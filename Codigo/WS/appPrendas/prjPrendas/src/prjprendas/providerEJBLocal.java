package prjprendas;

import javax.ejb.Local;

@Local
public interface providerEJBLocal {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);
}
