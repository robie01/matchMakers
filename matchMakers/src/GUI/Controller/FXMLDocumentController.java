/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Masoud
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private JFXButton AddTeambtn;
    @FXML
    private JFXButton deletebtn;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void generatetourAction(ActionEvent event)
    {
    }

    @FXML
    private void addBtnAction(ActionEvent event)
    {
    }

    @FXML
    private void dltBtnAction(ActionEvent event)
    {
    }
    
}
