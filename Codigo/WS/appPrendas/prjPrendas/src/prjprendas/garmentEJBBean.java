package prjprendas;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptors;
import javax.interceptor.InvocationContext;

import javax.jws.WebMethod;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.sql.DataSource;

import javax.transaction.Status;
import javax.transaction.UserTransaction;

@Stateless(name = "garmentEJB", mappedName = "appPrendas-prjPrendas-garmentEJB")
@TransactionManagement(TransactionManagementType.BEAN)
@WebService(wsdlLocation = "/META-INF/garmentEJBBeanService.wsdl")
public class garmentEJBBean implements garmentEJB, garmentEJBLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "Garment")
    private EntityManager em;
    static ArrayList<Connection> connectionList = new ArrayList<Connection>(0);
    static PreparedStatement insert;
    static PreparedStatement update;
    static PreparedStatement remove;
    static PreparedStatement query;

    public garmentEJBBean() {
    }

    @Override
    @WebMethod
    public int getConnection() {
        Connection conn = null;
        try{
            InitialContext ctx = new InitialContext();
            DataSource odsconn = (DataSource)ctx.lookup("/app/jdbc/jdbc/GRUPO07DS");
            conn = odsconn.getConnection();
            conn.setAutoCommit(false);
            conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
            connectionList.add(conn);
            insert = conn.prepareStatement("Insert into Garment(id, description, unit_cost, image, video, style) Values(?,?,?,?,?,?)");
            query = conn.prepareStatement("Select * from Garment");
            update = conn.prepareStatement("Update Garment set description = ?, unit_cost = ?, image = ?, video = ?, style = ?");
            remove = conn.prepareStatement("Delete from Garment Where id > ?");
            return connectionList.size() -1;
        }
        catch(NamingException e){
            return -1;
        }
        catch(SQLException e){
            return -1;
        }
    }
    
    @WebMethod
     public boolean closeConexion(int indice){
         try {
            connectionList.get(indice).close();
            return true ;
         }catch (SQLException e) {
            return false;
        }
     }

    @Override
    public boolean insertGarment(Garment g) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean updateGarment(Garment g) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean removeGarment(Garment g) {
        // TODO Implement this method
        return false;
    }

    @Override
    public boolean commit(int index) {
        try{
            connectionList.get(index).commit();
            return true;
        }catch(SQLException e){
            return false;
        }
    }

    @Override
    public Collection<Garment> getGarments() {
        Collection<Garment> gaments;
        gaments = new ArrayList<Garment>();
        try {
            ResultSet rset;
            rset = query.executeQuery();
            while (rset.next()){
                gaments.add(new Garment(
                            rset.getString("description"),
                            rset.getBigDecimal("id"),
                            rset.getBigDecimal("style"),
                            rset.getDouble("unit_cost")
                            ));
            };
            rset.close();
            return gaments;
         }
         catch (SQLException e) {
            return gaments;
         }

    }
}
class garmentEJBBeanTxnInterceptor {
    public garmentEJBBeanTxnInterceptor() {
    }

    @AroundInvoke
    Object executeInTrans(InvocationContext invocationContext) throws Exception {
        final garmentEJBBean garmentEJBBean = (garmentEJBBean) invocationContext.getTarget();
        final UserTransaction txn = garmentEJBBean.sessionContext.getUserTransaction();
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
