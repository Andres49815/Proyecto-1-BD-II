package prjprendas;

import javax.ejb.Remote;

@Remote
public interface garmentEJB {
    public int getConnection();
}
