package org.example;
/*
Put header here


 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorFXMLController implements Initializable {
    private Calculator calculator;

    @FXML
    private Label lblDisplay;

    @FXML
    private void onEvalClick(ActionEvent event) {
        lblDisplay.setText("Hello World!");
    }

    @FXML
    private void onNumberClick(ActionEvent event) {
        Button button = (Button) event.getSource();
        Integer buttonValue = Integer.parseInt(button.textProperty().getValue());
        calculator.inputDigit(buttonValue);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        calculator = new Calculator();
        calculator.setDisplay(data -> lblDisplay.setText(data));
    }
}
