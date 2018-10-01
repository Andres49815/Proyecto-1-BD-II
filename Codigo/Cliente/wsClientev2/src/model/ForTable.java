package model;

import java.util.ArrayList;

/**
 *
 * @author Andres Obando Alfaro
 */
public interface ForTable {
    // ID
    public int getID();
    
    // For Title
    public String getTitle();
    
    // For header
    public String[] getHeader();
    
    // For body
    public Object[] getRow();
    
    // For next
    public ArrayList<ForTable> getNext();
}
