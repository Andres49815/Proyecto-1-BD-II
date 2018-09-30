package prendapps;


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
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


@Stateless(name = "RequestEJB", mappedName = "WebService-PrendApps-RequestEJB")
@TransactionManagement(TransactionManagementType.BEAN)
@WebService(wsdlLocation = "/META-INF/RequestEJBBeanService.wsdl")
public class RequestEJBBean implements RequestEJB, RequestEJBLocal {
    @Resource
    SessionContext sessionContext;
    static ArrayList<Connection> connectionList = new ArrayList<>(0);
        static PreparedStatement insert;
        static PreparedStatement update;
        static PreparedStatement remove;
        static PreparedStatement query;

        public RequestEJBBean() {
        }

        @Override
                @WebMethod
                public int getConnection() {
                    Connection conn = null;
                    try{
                        InitialContext ctx = new InitialContext();
                        DataSource odsconn =  (DataSource)ctx.lookup("/app/jdbc/jdbc/grupo07DS");
                        conn = odsconn.getConnection();
                        conn.setAutoCommit(false);
                        //conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
                        connectionList.add(conn);
                        insert = conn.prepareStatement("Insert into Line_Request vsalues(?,?,?,?,?,?)");
                        update = conn.prepareStatement("Update Line_Request set request_id = ?, line_id = ?, garment = ?, garment_size = ?, quantity = ?, unit_price = ?");
                        query = conn.prepareStatement("Select * from Request_Line");
                        remove = conn.prepareStatement("Delect from Line_Request where line_id = ? and request_line = ?");
                        return connectionList.size() - 1;                 
                    }catch(SQLException e){
                        return -1;
                    }catch(NamingException e){
                        return -1;
                    }
                }

                @Override
                @WebMethod
                public boolean insertLineRequest(LineRequest lr) {
                    try {
                        insert.setBigDecimal(1,lr.getRequestId());
                        insert.setBigDecimal(2, lr.getLineId());
                        insert.setBigDecimal(3, lr.getGarment());
                        insert.setBigDecimal(4, lr.getGarmentSize());
                        insert.setBigDecimal(5, lr.getQuantity());
                        insert.setDouble(6,lr.getUnitPrice());
                        insert.executeUpdate();
                        return true;
                    } catch (SQLException e) {
                        return false;
                    }
                }

                @Override
                @WebMethod
                public boolean updateLineRequest(LineRequest lr) {
                    try{
                        update.setBigDecimal(1,lr.getRequestId());
                        update.setBigDecimal(2, lr.getLineId());
                        update.setBigDecimal(3, lr.getGarment());
                        update.setBigDecimal(4, lr.getGarmentSize());
                        update.setBigDecimal(5, lr.getQuantity());
                        update.setDouble(6,lr.getUnitPrice());
                        update.executeUpdate();
                        return true;
                    }catch(SQLException e){
                        return false;
                     }
                }
                
                public boolean closeConection(int index){
                    try {
                        connectionList.get(index).close();
                        return true ;
                    }catch (SQLException e) {
                        return false;
                    }
                 }


                @Override
                @WebMethod
                public boolean removeLineRequest(LineRequest lr) {
                    try{
                        remove.setBigDecimal(1, lr.getRequestId());
                        remove.setBigDecimal(2, lr.getLineId());
                        remove.executeUpdate();
                        return true;
                    }catch(SQLException e){
                        return false;
                    }
                }
                
                

                @Override
                @WebMethod
                public boolean commit(int index) {
                    try{
                        connectionList.get(index).commit();
                        return true;
                    }catch(Exception e){
                        return false;
                    }
                }

                @Override
                @WebMethod
                public Collection<LineRequest> getLineRquests() {
                    Collection<LineRequest> lrequests;
                    lrequests = new ArrayList<LineRequest>();
                    try {
                        ResultSet rset;
                        rset = query.executeQuery();
                        while (rset.next()){
                            lrequests.add(new LineRequest(
                            rset.getBigDecimal("garment"),
                            rset.getBigDecimal("garment_size"),
                            rset.getBigDecimal("line_id"),
                            rset.getBigDecimal("quantity"),
                            rset.getBigDecimal("request_id"),
                            rset.getDouble("unit_price")
                            ));
                        };
                        rset.close();
                        return lrequests;
                    }catch (SQLException e) {
                        return lrequests;
                    }
                }

                @Override
                @WebMethod
                public boolean insertRequest(Request r) {
                    try {
                        insert.setBigDecimal(1,r.getId());
                        insert.setBigDecimal(2, r.getClient());
                        insert.setDate(3, (java.sql.Date) r.getDeliverDate());
                        insert.setDate(4, (java.sql.Date) r.getRequestDate());
                        insert.executeUpdate();
                        return true;
                    } catch (SQLException e) {
                        System.out.println(e.getErrorCode());
                        return false;
                    }
                }

                @Override
                @WebMethod
                public boolean updateRequest(Request r) {
                    try {
                        update.setBigDecimal(1,r.getId());
                        update.setBigDecimal(2, r.getClient());
                        update.setDate(3, (java.sql.Date) r.getDeliverDate());
                        update.setDate(4, (java.sql.Date) r.getRequestDate());
                        update.executeUpdate();
                        return true;
                    } catch (SQLException e) {
                        return false;
                    }
                }

                @Override
                @WebMethod
                public boolean removeRequest(Request r) {
                    try{
                        remove.setBigDecimal(1, r.getId());
                        remove.executeUpdate();
                        return true;
                    }catch(SQLException e){
                        return false;
                    }
                }

                @Override
                @WebMethod
                public Collection<Request> getRequests() {
                    Collection<Request> requests;
                    requests = new ArrayList<Request>();
                    try {
                        ResultSet rset;
                        rset = query.executeQuery();
                        while (rset.next()){
                            requests.add(new Request(
                            rset.getBigDecimal("client"),
                            rset.getDate("deliver_date"),
                            rset.getBigDecimal("id"),
                            rset.getDate("request_date")
                            ));
                        };
                        rset.close();
                        return requests;
                    }catch (SQLException e) {
                        return requests;
                    }
                }

            @Override
            @WebMethod
            public String hola() {
                return "holaaaaaa ajajajajajaja";
            }
        }

