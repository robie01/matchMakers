/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Group;
import BE.Team;
import GUI.Model.TeamModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class MainView1Controller implements Initializable {

    
    @FXML
    private TableColumn<Team, String> groupAColumn;
    @FXML
    private TableColumn<Team, String> groupBColumn;
    @FXML
    private TableColumn<Team, String> groupCColumn;
   
    @FXML
    private Button teamS;
    @FXML
    private Button matchS;
    @FXML
    private Button groupR;
   
    private TeamModel teamModel = TeamModel.getTeamModel();    
    @FXML
    private TableView<Team> groupMatch;
    @FXML
    private TableColumn<Team, String> groupDColumn;

    
     
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       groupAColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
       groupMatch.setItems(teamModel.getGroupA());
      
       
       
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
     root = FXMLLoader.load(getClass().getResource("/GUI/View/MainView.fxml"));
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
    
    
    
    public void displayGroupA() {
        teamModel.getGroupA();
        
    }
    
}
