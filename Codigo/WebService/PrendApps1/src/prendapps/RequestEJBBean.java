package prendapps;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.transaction.Status;
import javax.transaction.UserTransaction;

@Stateless(name = "RequestEJB", mappedName = "WebService-PrendApps1-RequestEJB")
@TransactionManagement(TransactionManagementType.BEAN)
@Interceptors(RequestEJBBeanTxnInterceptor.class)
public class RequestEJBBean implements RequestEJB, RequestEJBLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "PrendApps")
    private EntityManager em;

    public RequestEJBBean() {
    }
}
class RequestEJBBeanTxnInterceptor {
    public RequestEJBBeanTxnInterceptor() {
    }

    @AroundInvoke
    Object executeInTrans(InvocationContext invocationContext) throws Exception {
        final RequestEJBBean requestEJBBean = (RequestEJBBean) invocationContext.getTarget();
        final UserTransaction txn = requestEJBBean.sessionContext.getUserTransaction();
        if (txn.getStatus() == Status.STATUS_NO_TRANSACTION) {
            txn.begin();
        }

        //  Execute the method body, along with any other chained interceptors
        Object result = invocationContext.proceed();

        //  Commit the transaction, if it is still active
        if (txn.getStatus() == Status.STATUS_ACTIVE) {
            txn.commit();
        }

        return result;
    }
}
