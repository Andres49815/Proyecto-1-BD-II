package controllers;

import views.NewRequest_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import prendapps.Request;
import prendapps.RequestEJBBean;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import javax.swing.JFrame;

import prendapps.RequestEJBBeanService;
import javax.xml.datatype.*;

import views.NewRequest_View;

/**
 *
 * @author Lenovo
 */
public class NewRequest_Controller implements ActionListener {
    
    NewRequest_View view;
    Request model;
    private Request_Controller mainScreen;
    
    public NewRequest_Controller(NewRequest_View v, Request m) {
        this.view = v;
        this.model = m;
        
        view.Accept_Button.addActionListener(this);
        
        view.setVisible(true);
    }
    
    public NewRequest_Controller(NewRequest_View v, Request m, Request_Controller mainController) {
        this.view = v;
        this.model = m;
        this.mainScreen = mainController;
        view.Accept_Button.addActionListener(this);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.setVisible(true);
    }

    @Override public void actionPerformed(ActionEvent ae) {
        if (model.getId().longValue() == -1) {
            
            int n = (Integer) view.Client_Spinner.getValue();
            String dt = view.Date_TextField.getText();
            
            LocalDateTime initialDate = LocalDateTime.now();
            Date rqDate = new Date(initialDate.getDayOfYear() - 1900, initialDate.getMonth().getValue() - 1, initialDate.getDayOfMonth());
            
            String[] delDate = dt.split("/");
            
            int y = Integer.parseInt(delDate[0]);
            int m = Integer.parseInt(delDate[1]);
            int d = Integer.parseInt(delDate[2]);
            
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(rqDate);
            try {
                model.setRequestDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
                Date deliver = new Date(y - 1900, m - 1, d);
                GregorianCalendar c2 = new GregorianCalendar();
                c2.setTime(deliver);
                model.setClient(new BigDecimal(n));
                model.setDeliverDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c2));
            }
            catch(Exception e) {
                e.printStackTrace();    
            } // Mae, llegue temprano manana, me voy a dormir*
            
            RequestEJBBeanService requestEJBBeanService = new RequestEJBBeanService();
            RequestEJBBean requestEJBBean = requestEJBBeanService.getRequestEJBBeanPort();
            if (requestEJBBean.insertRequest(model)){
                System.out.println("wiiiiiiiiiiiii");
                mainScreen.refresh();
            }else{
                System.out.println("ws de ORACLE no sirve");
            }
            //requestEJBBean.commit(ProgramState.getInstance().getConn());
        }
        else {
            int n = (Integer) view.Client_Spinner.getValue();
            String dt = view.Date_TextField.getText();
            
            LocalDateTime initialDate = LocalDateTime.now();
            Date rqDate = new Date(initialDate.getDayOfYear() - 1900, initialDate.getMonth().getValue() - 1, initialDate.getDayOfMonth());
            
            String[] delDate = dt.split("/");
            
            int y = Integer.parseInt(delDate[0]);
            int m = Integer.parseInt(delDate[1]);
            int d = Integer.parseInt(delDate[2]);
            
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(rqDate);
            try {
                model.setRequestDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c));
                Date deliver = new Date(y - 1900, m - 1, d);
                GregorianCalendar c2 = new GregorianCalendar();
                c2.setTime(deliver);
                model.setClient(new BigDecimal(n));
                model.setDeliverDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(c2));
            }
            catch(Exception e) {
                e.printStackTrace();    
            } // Mae, llegue temprano manana, me voy a dormir*
            
            RequestEJBBeanService requestEJBBeanService = new RequestEJBBeanService();
            RequestEJBBean requestEJBBean = requestEJBBeanService.getRequestEJBBeanPort();
            if (requestEJBBean.updateRequest(model)){
                System.out.println("wiiiiiiiiiiiii");
                mainScreen.refresh();
            }else{
                System.out.println("ws de ORACLE no sirve");
            }
            //requestEJBBean.commit(ProgramState.getInstance().getConn());
            view.setVisible(false);
        }
    }
}
