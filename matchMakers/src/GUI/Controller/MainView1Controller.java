/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Team;
import BLL.GroupMatch;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class MainView1Controller implements Initializable {

    @FXML
    private TableColumn<GroupMatch, String> teamNameColumn;
    @FXML
    private TableColumn<GroupMatch, String> teamIdColumn;
    @FXML
    private TableColumn<GroupMatch, String> groupAColumn;
    @FXML
    private TableColumn<GroupMatch, String> groupBColumn;
    @FXML
    private TableColumn<GroupMatch, String> groupCColumn;
    @FXML
    private TableColumn<GroupMatch, String> groupDColumn;
    @FXML
    private TableView<String> groupMatch;
    @FXML
    private Button teamS;
    @FXML
    private Button matchS;
    @FXML
    private Button groupR;

   
     
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void teamSAction(ActionEvent event) {
    }

    @FXML
    private void matchSAction(ActionEvent event) throws IOException {
        
         Stage stage; 
         Parent root;
 
    if(event.getSource()==matchS)
    {
     stage = new Stage();
     root = FXMLLoader.load(getClass().getResource("/GUI/View/Finals.fxml"));
     stage.setScene(new Scene(root));
     stage.setTitle("Finals");
     stage.initModality(Modality.APPLICATION_MODAL);
     stage.initOwner(matchS.getScene().getWindow());
     stage.showAndWait();
    }
    }

    @FXML
    private void groupRankAction(ActionEvent event) {
    }
    
    public void setTeamList(ObservableList<Team> teamList) {
        
    }
    
    
}
