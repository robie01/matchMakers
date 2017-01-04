/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author Masoud
 */
public class TournamentManagerViewController implements Initializable {
    
    private Label label;
    @FXML
    private Button generatebtnID;
    @FXML
    private Button addbtnID;
    @FXML
    private Button deletebtnID;
    @FXML
    private Label teamcountlbl;
    @FXML
    private ListView<String> teamNameListview;
    
    private static AddTeamViewController controller = new AddTeamViewController();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    


    

    @FXML
    private void generatebtnAction(ActionEvent event)
    {
    }

    @FXML
    private void addbtnAction(ActionEvent event) throws IOException
    {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(
            AddTeamViewController.class.getResource("/GUI/View/AddTeamView.fxml"));
        
        stage.setScene(new Scene(root));
        
        stage.setTitle("AddTeamView Window");
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner( ((Node)event.getSource()).getScene().getWindow() );
        stage.show();
        
        
        
        
          
    }

    @FXML
    private void deletebtnAction(ActionEvent event)
    {
    }
}
