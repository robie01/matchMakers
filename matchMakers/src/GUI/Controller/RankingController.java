/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Team;
import GUI.Model.GroupModel;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * FXML Controller class
 *
 * @author EdwinSilva
 */
public class RankingController implements Initializable {

    private GroupModel groupModel = GroupModel.getGroupModel();

    @FXML
    private ListView<String> RankingANames;
    @FXML
    private ListView<String> RankingBNames;
    @FXML
    private ListView<String> RankingCNames;
    @FXML
    private ListView<String> RankingDNames;

    @FXML
    private ListView<Integer> rankingBId;
    @FXML
    private ListView<Integer> rankingBPoints;
    @FXML
    private ListView<Integer> rankingBGoalDif;
    @FXML
    private ListView<Integer> rankingDPoints;
    @FXML
    private ListView<Integer> rankingDGoalDif;

    @FXML
    private ListView<Integer> rankingDId;
    @FXML
    private ListView<Integer> rankingAId;
    @FXML
    private ListView<Integer> rankingAPoints;
    @FXML
    private ListView<Integer> rankingAGoalDif;
    @FXML
    private ListView<Integer> rankingCPoints;
    @FXML
    private ListView<Integer> rankingCGoalDif;
    @FXML
    private ListView<Integer> rankingCId;
    @FXML
    private Button btnRefreshRanking;

    public RankingController() {

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        displayGroupsInRanking();

    }

    @FXML
    private void RefreshRankingAction(ActionEvent event) {

        displayGroupsInRanking();

    }

    private void displayGroupsInRanking() {

        getRankingNames();
        getRankingNamesId();

    }

    private void getRankingNames() {
        RankingANames.getItems().clear();
        RankingBNames.getItems().clear();
        RankingCNames.getItems().clear();
        RankingDNames.getItems().clear();

        for (int i = 0; i < groupModel.getListA().size(); i++) {

            RankingANames.getItems().add(groupModel.getListA().get(i).getName());

        }
        for (int i = 0; i < groupModel.getListB().size(); i++) {

            RankingBNames.getItems().add(groupModel.getListB().get(i).getName());
        }
        for (int i = 0; i < groupModel.getListC().size(); i++) {
            RankingCNames.getItems().add(groupModel.getListC().get(i).getName());
        }
        for (int i = 0; i < groupModel.getListD().size(); i++) {
            RankingDNames.getItems().add(groupModel.getListD().get(i).getName());
        }
    }

    private void getRankingNamesId() {
        rankingAId.getItems().clear();
        rankingBId.getItems().clear();
        rankingCId.getItems().clear();
        rankingDId.getItems().clear();
        for (int i = 0; i < groupModel.getListA().size(); i++) {
            rankingAId.getItems().add(groupModel.getListA().get(i).getId());
        }

        for (int i = 0; i < groupModel.getListB().size(); i++) {

            rankingBId.getItems().add(groupModel.getListB().get(i).getId());
        }
        for (int i = 0; i < groupModel.getListC().size(); i++) {
            rankingCId.getItems().add(groupModel.getListC().get(i).getId());
        }
        for (int i = 0; i < groupModel.getListD().size(); i++) {
            rankingDId.getItems().add(groupModel.getListD().get(i).getId());
        }

    }
public void getGoalDif(){
    
}
}
