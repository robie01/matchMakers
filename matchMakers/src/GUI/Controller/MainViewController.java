/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author EdwinSilva
 */
public class MainViewController implements Initializable {

    @FXML
    private Button GroupA;
    @FXML
    private Button GroupB;
    @FXML
    private Button GroupC;
    @FXML
    private Button GroupD;
    @FXML
    private Button MatchS;
    @FXML
    private Button GroupR;
    @FXML
    private Button TeamS;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }    

    @FXML
    private void GroupASAction(ActionEvent event) {
    }

    @FXML
    private void GroupBSAction(ActionEvent event) {
    }

    @FXML
    private void GroupCSAction(ActionEvent event) {
    }

    @FXML
    private void GroupDSAction(ActionEvent event) {
    }

    @FXML
private void MatchSAction(ActionEvent event) throws IOException{
    Stage stage; 
 Parent root;
 
 if(event.getSource()==MatchS)
 {
   stage = new Stage();
   root = FXMLLoader.load(getClass().getResource("/GUI/View/Finals.fxml"));
   stage.setScene(new Scene(root));
   stage.setTitle("My modal window");
   stage.initModality(Modality.APPLICATION_MODAL);
   stage.initOwner(MatchS.getScene().getWindow());
   stage.showAndWait();
 }

 
}
@FXML
    private void GroupRankAction(ActionEvent event) {
    }

    @FXML
    private void TeamSAction(ActionEvent event) {
    }
    
    }

  

