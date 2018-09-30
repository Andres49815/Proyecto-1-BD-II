package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.math.BigDecimal;

import java.util.ArrayList;
import javax.swing.JButton;

import model.ForTable;

import prendapps.LineRequest;
import prendapps.Request;

import views.NewLine_View;
import views.NewRequest_View;
import views.Request_View;

/**
 *
 * @author Andres Obando Alfaro
 */
public class Request_Controller implements ActionListener, MouseListener {
    
    private Request_View view;
    private ArrayList<ForTable> model;
    private int actualRequest = -1;
    
    public Request_Controller(Request_View view, ArrayList<ForTable> model) {
        this.view = view;
        this.model = model;
        
        ConfigureView();
        
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    private void ConfigureView() {
        this.view.SetTable(model);
        this.view.Create_Button.addActionListener(this);
        this.view.Requests_Table.addMouseListener(this);
    }
    
    // Action Listener
    @Override public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Create":
                CreateNew();
                break;
        }
    }
    
    private void CreateNew() {
        if (actualRequest == -1) {
            
        }
        else {
            LineRequest line;
            NewLine_Controller controller;
            
            line = new LineRequest();
            line.setGarment(new BigDecimal(454));
            line.setLineId(new BigDecimal(45));
            line.setGarmentSize(new BigDecimal(2000));
            line.setQuantity(new BigDecimal(4));
            line.setRequestId(new BigDecimal(465));
            line.setUnitPrice(564.04);
            controller = new NewLine_Controller(line, new NewLine_View());
        }
    }
    
    // Mouse Listener
    @Override public void mousePressed(MouseEvent me) {}
    @Override public void mouseReleased(MouseEvent me) {}
    @Override public void mouseEntered(MouseEvent me) {}
    @Override public void mouseExited(MouseEvent me) {}
    
    
    @Override public void mouseClicked(MouseEvent e) {
        int column, row;
        
        column = view.Requests_Table.getColumnModel().getColumnIndexAtX(e.getX());
        row = e.getY() / view.Requests_Table.getRowHeight();
        
        if (row < view.Requests_Table.getRowCount() && row >= 0 &&
                column < view.Requests_Table.getColumnCount() && column >= 0) {
            Object value = view.Requests_Table.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                switch (column) {
                    case 4:
                        Modify(row);
                        break;
                    case 6:
                        ViewLines(row);
                        break;
                    default:
                        System.out.println("Columna: " + column + ", " + "Fila: " + row);
                }
            }
        }
    }
    
    private void Modify(int row) {
        if (actualRequest == -1) {
            
        }
        else {
            NewLine_Controller controller;
            
            LineRequest line = (LineRequest) model.get(row);
            controller = new NewLine_Controller(line, new NewLine_View());
            this.view.dispose();
        }
    }
    
    private void ViewLines(int row) {
        Request request = (Request) model.get(row);
        //Request request  = (Request) model.get(row);
        ArrayList<ForTable> newModel = request.getNext();
        actualRequest = request.getID();
        
        model = newModel;
        this.view.SetTable(model);
    }
    
}
