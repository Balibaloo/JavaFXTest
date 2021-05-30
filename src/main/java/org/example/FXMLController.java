package org.example;
/*
Put header here


 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class FXMLController implements Initializable {

    @FXML
    private Label lblDisplay;

    @FXML
    private void btnClickAction(ActionEvent event) {
        lblDisplay.setText("Hello World!");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
