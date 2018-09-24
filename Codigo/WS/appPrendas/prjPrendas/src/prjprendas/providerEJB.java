package prjprendas;

import javax.ejb.Remote;

@Remote
public interface providerEJB {
    Object queryByRange(String jpqlStmt, int firstResult, int maxResults);

    <T> T persistEntity(T entity);

    <T> T mergeEntity(T entity);
}
