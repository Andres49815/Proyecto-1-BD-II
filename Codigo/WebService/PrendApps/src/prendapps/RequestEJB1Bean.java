package prendapps;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "RequestEJB", mappedName = "WebServiceRO-PrendApps-RequestEJB")
@TransactionManagement(TransactionManagementType.BEAN)
public class RequestEJB1Bean implements RequestEJB1, RequestEJB1Local {
    @Resource
    SessionContext sessionContext;

    public RequestEJB1Bean() {
    }
}
