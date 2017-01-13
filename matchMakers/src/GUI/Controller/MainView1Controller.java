/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import GUI.Model.GroupModel;
import BE.Team;
import GUI.Model.TeamModel;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author robiesun
 */
public class MainView1Controller implements Initializable
{

    @FXML
    private Button teamS;
    @FXML
    private Button matchS;

    private GroupModel groupModel = GroupModel.getGroupModel();

    private TeamModel teamModel = TeamModel.getTeamModel();
    //private TableView<Team> groupMatch;
    @FXML
    private ListView<Team> listA;
    @FXML
    private ListView<Team> listD;
    @FXML
    private ListView<Team> listC;
    @FXML
    private ListView<Team> listB;
    @FXML
    private Button btnGroupMatch;
    @FXML
    private Button btnRanking;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {

        
        groupModel.GroupArrangements();
        displayGroups();
    }

    
    
      
    /*
    * Set stage to finals.fxml
    */
    @FXML
    private void matchSAction(ActionEvent event) throws IOException
    {

        Stage stage;
        Parent root;

        if (event.getSource() == matchS)
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
    /*
    *Set the stage to GroupViewScheduleView.Fxml.
    */
    @FXML
    private void groupMatchAction(ActionEvent event) throws IOException
    {
        Stage stage;
        Parent root;
        
        if(event.getSource() == btnGroupMatch) 
        {
            stage = new Stage ();
            root = FXMLLoader.load(getClass().getResource("/GUI/View/GroupScheduleView.fxml"));
            stage.setScene(new Scene(root));
            stage.setTitle("Group Matches");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.initOwner(btnGroupMatch.getScene().getWindow());
            stage.showAndWait();
        }
    }
    /*
    * This sets all the team names in each group. And each group is recognized from its index from 0-3.
    This get an array from Groups and set them in a list.
    */
    public void displayGroups()
    {
        

        listA.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(0)));

        listB.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(1)));

        listC.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(2)));

        listD.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(3)));
    }
    /*
    *This set stage to the Ranking.fxml.
    */
    @FXML
    private void RankingAction(ActionEvent event) throws IOException {
    Stage stage;
    Parent root;
    
if(event.getSource()==btnRanking){
    stage = new Stage();
    root = FXMLLoader.load(getClass().getResource("/GUI/View/Rankings.fxml"));
    stage.setScene(new Scene(root));
    stage.setTitle("Group Ranking");
    stage.initModality(Modality.APPLICATION_MODAL);
    stage.initOwner(btnRanking.getScene().getWindow());
    stage.showAndWait();
}    
    }

}
