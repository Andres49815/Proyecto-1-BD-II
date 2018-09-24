package prjprendas;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

@Stateless(name = "garmentEJB", mappedName = "appPrendas-prjPrendas-garmentEJB")
@TransactionManagement(TransactionManagementType.BEAN)
public class garmentEJBBean implements garmentEJB, garmentEJBLocal {
    @Resource
    SessionContext sessionContext;

    public garmentEJBBean() {
    }
}
