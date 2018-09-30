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
        static PreparedStatement insertRL;
        static PreparedStatement insertR;
        static PreparedStatement updateRL;
        static PreparedStatement updateR;
        static PreparedStatement removeR;
        static PreparedStatement removeRL;
        static PreparedStatement queryR;
        static PreparedStatement queryRL;

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
                        insertRL = conn.prepareStatement("Insert into Line_Request values(?,?,?,?,?,?)");
                        insertR = conn.prepareStatement("insert into Request values (?,?,?,?)");
                        updateRL = conn.prepareStatement("Update Line_Request set request_id = ?, line_id = ?, garment = ?, garment_size = ?, quantity = ?, unit_price = ?");
                        updateR = conn.prepareStatement("Update Request set request_id = ?, line_id = ?, garment = ?, garment_size = ?, quantity = ?, unit_price = ?");
                        queryRL = conn.prepareStatement("Select * from Line_Request");
                        queryR = conn.prepareStatement("Select * from Request");
                        removeR = conn.prepareStatement("Delete from Request where id = ?");
                        removeRL = conn.prepareStatement("Delete from Line_Request where line_id = ? and request_line = ?");
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
                        insertRL.setBigDecimal(1,lr.getRequestId());
                        insertRL.setBigDecimal(2, lr.getLineId());
                        insertRL.setBigDecimal(3, lr.getGarment());
                        insertRL.setBigDecimal(4, lr.getGarmentSize());
                        insertRL.setBigDecimal(5, lr.getQuantity());
                        insertRL.setDouble(6,lr.getUnitPrice());
                        insertRL.executeUpdate();
                        return true;
                    } catch (SQLException e) {
                        return false;
                    }
                }

                @Override
                @WebMethod
                public boolean updateLineRequest(LineRequest lr) {
                    try{
                        updateRL.setBigDecimal(1,lr.getRequestId());
                        updateRL.setBigDecimal(2, lr.getLineId());
                        updateRL.setBigDecimal(3, lr.getGarment());
                        updateRL.setBigDecimal(4, lr.getGarmentSize());
                        updateRL.setBigDecimal(5, lr.getQuantity());
                        updateRL.setDouble(6,lr.getUnitPrice());
                        updateRL.executeUpdate();
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
                        removeRL.setBigDecimal(1, lr.getRequestId());
                        removeRL.setBigDecimal(2, lr.getLineId());
                        removeRL.executeUpdate();
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
                        rset = queryRL.executeQuery();
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
                        insertR.setBigDecimal(1,r.getId());
                        insertR.setBigDecimal(2, r.getClient());
                        insertR.setDate(3, (java.sql.Date) r.getDeliverDate());
                        insertR.setDate(4, (java.sql.Date) r.getRequestDate());
                        insertR.executeUpdate();
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
                        updateR.setBigDecimal(1,r.getId());
                        updateR.setBigDecimal(2, r.getClient());
                        updateR.setDate(3, (java.sql.Date) r.getDeliverDate());
                        updateR.setDate(4, (java.sql.Date) r.getRequestDate());
                        updateR.executeUpdate();
                        return true;
                    } catch (SQLException e) {
                        return false;
                    }
                }

                @Override
                @WebMethod
                public boolean removeRequest(Request r) {
                    try{
                        removeR.setBigDecimal(1, r.getId());
                        removeR.executeUpdate();
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
                        rset = queryR.executeQuery();
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

