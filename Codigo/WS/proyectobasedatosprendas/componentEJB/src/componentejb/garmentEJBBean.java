package componentejb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Collection;

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

@Stateless(name = "garmentEJB", mappedName = "proyectobasedatosprendas-componentEJB-garmentEJB")
@TransactionManagement(TransactionManagementType.BEAN)
@WebService(wsdlLocation = "/META-INF/garmentEJBBeanService.wsdl")
public class garmentEJBBean implements garmentEJB, garmentEJBLocal {
    @Resource
    SessionContext sessionContext;
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
                remove = conn.prepareStatement("Delete from Garment Where id = ?");
                return connectionList.size() -1;
            }
            catch(NamingException e){
                return -1;
            }
            catch(SQLException e){
                return -1;
            }
        }
        
         public boolean closeConexion(int indice){
             try {
                connectionList.get(indice).close();
                return true ;
             }catch (SQLException e) {
                return false;
                }
         }

        @Override
        @WebMethod
        public boolean insertGarment(Garment g) {
            /*Insert into Garment(id, description, unit_cost, image, video, style)*/
            try{
                insert.setBigDecimal(1,g.getId());
                insert.setString(2,g.getDescription());
                insert.setDouble(3, g.getUnitCost());
                insert.setBytes(4, g.getImage());
                insert.setBytes(5, g.getVideo());
                insert.setBigDecimal(6, g.getStyle());
                insert.executeUpdate();
                return true;
                
            }catch(SQLException e){
                return false;
                }  
        }

        @Override
        @WebMethod
        public boolean updateGarment(Garment g) {
            /*Update Garment set description = ?, 
             * unit_cost = ?, image = ?, 
             * video = ?, style = ?*/
            try{
                update.setString(1,g.getDescription());
                update.setDouble(2, g.getUnitCost());
                update.setBytes(3, g.getImage());
                update.setBytes(4, g.getVideo());
                update.setBigDecimal(5, g.getStyle());
                update.executeUpdate();
                return true;
            }catch(SQLException e){
                return false;
            }
        }

        @Override
        @WebMethod
        public boolean removeGarment(Garment g) {
            try{
                remove.setBigDecimal(1, g.getId());
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
            }catch(SQLException e){
                return false;
            }
        }

        @Override
        @WebMethod
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