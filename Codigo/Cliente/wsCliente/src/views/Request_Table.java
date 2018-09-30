package views;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.ForTable;

/**
 *
 * @author Andres Obando Alfaro
 */
public class Request_Table {
    
    public void viewTable(JTable table, ArrayList<ForTable> rows) {
        if (rows.size() > 0) {
            table.setDefaultRenderer(Object.class, new Render());
            DefaultTableModel defaultTable = new DefaultTableModel() {
                @Override public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            SetHeader(defaultTable, rows.get(0).getHeader());
            
            rows.forEach((row) -> { defaultTable.addRow(row.getRow()); });
            table.setModel(defaultTable);
            table.setRowHeight(30);
        }
    }
    
    private static void SetHeader(DefaultTableModel table, String[] head) {
        for (String title : head)
            table.addColumn(title);
    }
    
}
