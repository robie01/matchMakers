/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Match;
import BE.Team;
import BE.Round;
import GUI.Model.GroupModel;
import GUI.Model.TeamModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Jesper Enemark
 */
 
public class GroupScheduleViewController implements Initializable
{
    private GroupModel groupModel = GroupModel.getGroupModel();
    private TeamModel teamModel = TeamModel.getTeamModel();
    @FXML
    private TableView<Match> tblViewA;
    @FXML
    private TableColumn<Match, String> clmHomeTeamA;
    @FXML
    private TableColumn<Match, String> clmGuestTeamA;
    @FXML
    private TableColumn<Match, String> clmMatchIDA;
    @FXML
    private TableView<Match> tblViewB;
    @FXML
    private TableColumn<Match, String> clmHomeTeamB;
    @FXML
    private TableColumn<Match, String> clmGuestTeamB;
    @FXML
    private TableColumn<Match, String> clmMatchIDB;
    @FXML
    private TableView<Match> tblViewC;
    @FXML
    private TableColumn<Match, String> clmHomeTeamC;
    @FXML
    private TableColumn<Match, String> clmGuestTeamC;
    @FXML
    private TableColumn<Match, String> clmMatchIDC;
    @FXML
    private TableView<Match> tblViewD;
    @FXML
    private TableColumn<Match, String> clmHomeTeamD;
    @FXML
    private TableColumn<Match, String> clmGuestTeamD;
    @FXML
    private TableColumn<Match, String> clmMatchIDD;
    @FXML
    private TableColumn<Match, String> clmHGoalA;
    @FXML
    private TableColumn<Match, String> clmGGoalA;
    @FXML
    private TableColumn<Match, String> clmHGoalB;
    @FXML
    private TableColumn<Match, String> clmGGoalB;
    @FXML
    private TableColumn<Match, String> clmHGoalC;
    @FXML
    private TableColumn<Match, String> clmGGoalC;
    @FXML
    private TableColumn<Match, String> clmHGoalD;
    @FXML
    private TableColumn<Match, String> clmGGoalD;

    /**
     * Initializes the controller class.
     */
    public void firstRound() {
        
        
        Match Match1 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
        //Match Match2 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 1);
        //Match ds = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
        }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        clmHomeTeamA.setCellValueFactory(new PropertyValueFactory<>("homeTeam"));
        clmGuestTeamA.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));
        clmHGoalA.setCellValueFactory(new PropertyValueFactory<>("homeScore"));
        clmGGoalA.setCellValueFactory(new PropertyValueFactory<>("awayScore"));
        clmMatchIDA.setCellValueFactory(new PropertyValueFactory<>("matchID"));
        //clmHomeTeamA.setCellValueFactory(homeTeam -> { return homeTeam.getValue().setMatch1().matchIdProperty();});
        //First Round
        Match Match1 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
        Match Match2 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 1);
        //Second Round
        Match Match3 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(3), 2);
        Match Match4 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 3);
        //Third Round
        Match Match5 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 4);
        Match Match6 = new Match(groupModel.getListA().get(3), groupModel.getListA().get(1), 5);
        //Fourth Round
        Match Match7 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 0);
        Match Match8 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 1);
        //Fifth Round
        Match Match9 = new Match(groupModel.getListA().get(3), groupModel.getListA().get(1), 2);
        Match Match10 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 3);
        //Sixth Round
        Match Match11 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 4);
        Match Match12 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(3), 5);
        
        tblViewA.setItems(FXCollections.observableArrayList(Match1, Match2, Match3, Match4, Match5, Match6, Match7, Match8, Match9, Match10, Match11, Match12));
        
        
     
    }    
    
}
