package prjprendas;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.interceptor.AroundInvoke;
import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;

import javax.transaction.Status;
import javax.transaction.UserTransaction;

@Stateless(name = "providerEJB", mappedName = "appPrendas-prjPrendas-providerEJB")
@TransactionManagement(TransactionManagementType.BEAN)
@Interceptors(providerEJBBeanTxnInterceptor.class)
public class providerEJBBean implements providerEJB, providerEJBLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "Garment")
    private EntityManager em;

    public providerEJBBean() {
    }

    @ExcludeClassInterceptors
    public Object queryByRange(String jpqlStmt, int firstResult, int maxResults) {
        Query query = em.createQuery(jpqlStmt);
        if (firstResult > 0) {
            query = query.setFirstResult(firstResult);
        }
        if (maxResults > 0) {
            query = query.setMaxResults(maxResults);
        }
        return query.getResultList();
    }

    public <T> T persistEntity(T entity) {
        em.persist(entity);
        return entity;
    }

    public <T> T mergeEntity(T entity) {
        return em.merge(entity);
    }
}
class providerEJBBeanTxnInterceptor {
    public providerEJBBeanTxnInterceptor() {
    }

    @AroundInvoke
    Object executeInTrans(InvocationContext invocationContext) throws Exception {
        final providerEJBBean providerEJBBean = (providerEJBBean) invocationContext.getTarget();
        final UserTransaction txn = providerEJBBean.sessionContext.getUserTransaction();
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
