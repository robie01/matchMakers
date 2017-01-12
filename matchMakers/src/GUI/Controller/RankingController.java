/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Team;
import GUI.Model.GroupModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;

/**
 * FXML Controller class
 *
 * @author EdwinSilva
 */
public class RankingController implements Initializable {
    
    private GroupModel groupModel = GroupModel.getGroupModel();

    
    @FXML
    private ListView<?> rankingBId;
    @FXML
    private ListView<?> rankingBPoints;
    @FXML
    private ListView<?> rankingBGoalDif;
    @FXML
    private ListView<Team> RankingBNames;
    @FXML
    private ListView<?> rankingDPoints;
    @FXML
    private ListView<?> rankingDGoalDif;
    @FXML
    private ListView<Team> RankingDNames;
    @FXML
    private ListView<?> rankingDId;
    @FXML
    private ListView<?> rankingAId;
    @FXML
    private ListView<?> rankingAPoints;
    @FXML
    private ListView<?> rankingAGoalDif;
    @FXML
    private ListView<Team> RankingANames;
    @FXML
    private ListView<?> rankingCPoints; 
    @FXML
    private ListView<?> rankingCGoalDif;
    @FXML
    private ListView<Team> RankingCNames;
    @FXML
    private ListView<?> rankingCId;
    @FXML
    private Button btnRefreshRanking;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    groupModel.addTeamToGroup();
    displayGroupsInRanking();
        
        
    }    

    
    
    @FXML
    private void RefreshRankingAction(ActionEvent event) {
    }
    
    private void displayGroupsInRanking(){
     RankingANames.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(0)));
     RankingBNames.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(1)));
     RankingCNames.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(2)));
     RankingDNames.setItems(FXCollections.observableArrayList(groupModel.getAllGroups().get(3)));
     
     
     
    }
}
