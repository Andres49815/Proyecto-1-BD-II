package controllers;
import views.NewLine_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.math.BigDecimal;

import javax.swing.JFrame;

import prendapps.LineRequest;

import prendapps.RequestEJBBean;
import prendapps.RequestEJBBeanService;

import views.NewLine_View;

/**
 *
 * @author Andres Obando Alfaro
 */
public class NewLine_Controller implements ActionListener {
    
    private LineRequest model;
    private NewLine_View view;
    private JFrame mainScreen;
    
    public NewLine_Controller(LineRequest model, NewLine_View view) {
        this.model = model;
        this.view = view;
        
        this.view.Accept_Button.addActionListener(this);
        
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    
    public NewLine_Controller(LineRequest model, NewLine_View view, JFrame prevScreen) {
        this.model = model;
        this.view = view;
        mainScreen = prevScreen;
        this.view.Accept_Button.addActionListener(this);
        this.view.setLocationRelativeTo(null);
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.view.setVisible(true);
    }
    
    private void CreateLine() {
        if (model.getLineId().longValue() == -1) {
            int ln = (Integer) this.view.LineID_Spinner.getValue();
            int q = (Integer) this.view.Quantity_Spinner.getValue();
            int g = (Integer) this.view.Garment_Spinner.getValue();
            int ppu = (Integer) this.view.PricePerUnit_Spinner.getValue();
            
            int sz = this.view.Size_ComboBox.getSelectedIndex() + 1;
            model.setGarmentSize(new BigDecimal(sz));
            model.setUnitPrice((Integer)this.view.PricePerUnit_Spinner.getValue());
            model.setQuantity(new BigDecimal(q));
            model.setGarment(new BigDecimal(g));
            model.setLineId(new BigDecimal(ln));
            
            System.out.println(model.getRequestId());
            System.out.println(model.getLineId());
            System.out.println(model.getGarment());
            System.out.println(model.getGarmentSize());
            
            RequestEJBBeanService requestEJBBeanService = new RequestEJBBeanService();
            RequestEJBBean requestEJBBean = requestEJBBeanService.getRequestEJBBeanPort();
            if (requestEJBBean.insertLineRequest(model)){
                System.out.println("wiiiiiiiiiiiii");
            }else{
                System.out.println("ws de ORACLE no sirve");
            }
            requestEJBBean.commit(ProgramState.getInstance().getConn());
        }
        else {
            
        }
    }

    @Override public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Accept":
                CreateLine();
                break;
        }
        Request_Controller c;
        
        
    }
}
