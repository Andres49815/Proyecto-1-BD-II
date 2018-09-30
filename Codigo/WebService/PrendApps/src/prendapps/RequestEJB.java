package prendapps;

import java.util.Collection;
import javax.ejb.Remote;

@Remote
public interface   RequestEJB {
    public int getConnection();
    public boolean insertLineRequest(LineRequest lr);
    public boolean updateLineRequest(LineRequest lr);
    public boolean removeLineRequest(LineRequest lr);
    public boolean insertRequest(Request r);
    public boolean updateRequest(Request r);
    public boolean removeRequest(Request r);
    public boolean commit(int index);
    public Collection<LineRequest> getLineRquests();
    public Collection<Request> getRequests();
    public String hola();
}
