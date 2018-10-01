package controllers;
import views.NewLine_View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import prendapps.LineRequest;

import views.NewLine_View;

/**
 *
 * @author Andres Obando Alfaro
 */
public class NewLine_Controller implements ActionListener {
    
    private LineRequest model;
    private NewLine_View view;
    
    public NewLine_Controller(LineRequest model, NewLine_View view) {
        this.model = model;
        this.view = view;
        
        SetClients();
        this.view.Accept_Button.addActionListener(this);
        
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    private void SetClients() {
        //DB.GARMENTS().forEach((garment) -> { view.Garments_ComboBox.addItem(garment.DESCRIPTION); });
    }

    @Override public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            
        }
    }
}
