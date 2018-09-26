package prendasEBJ;

import java.util.Collection;

import javax.ejb.Remote;

@Remote
public interface garmentEJB {
    public int getConnection();
    public boolean insertGarment(Garment g);
    public boolean updateGarment(Garment g);
    public boolean removeGarment(Garment g);
    public boolean commit(int index);
    Collection<Garment> getGarments();
}