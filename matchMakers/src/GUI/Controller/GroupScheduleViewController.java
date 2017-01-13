/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Match;
import GUI.Model.GroupModel;
import GUI.Model.TeamModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    @FXML
    private TextField txtHomeScore;
    @FXML
    private TextField txtGuestScore;
    @FXML
    private TextField txtMatchId;
    @FXML
    private Button btnSetScore;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        showColumnGroupA();
        showColumnGroupB();
        showColumnGroupC();
        showColumnGroupD();
    }

    public void showColumnGroupA()
    {
        clmHomeTeamA.setCellValueFactory(new PropertyValueFactory<>("homeTeam"));
        clmGuestTeamA.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));
        clmHGoalA.setCellValueFactory(new PropertyValueFactory<>("homeScore"));
        clmGGoalA.setCellValueFactory(new PropertyValueFactory<>("awayScore"));
        clmMatchIDA.setCellValueFactory(new PropertyValueFactory<>("matchID"));

        tblViewA.setItems(groupModel.GroupAPlay());
        
    }

    public void showColumnGroupB()
    {
        clmHomeTeamB.setCellValueFactory(new PropertyValueFactory<>("homeTeam"));
        clmGuestTeamB.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));
        clmHGoalB.setCellValueFactory(new PropertyValueFactory<>("homeScore"));
        clmGGoalB.setCellValueFactory(new PropertyValueFactory<>("awayScore"));
        clmMatchIDB.setCellValueFactory(new PropertyValueFactory<>("matchID"));

        tblViewB.setItems(groupModel.GroupBPlay());

    }

    public void showColumnGroupC()
    {
        clmHomeTeamC.setCellValueFactory(new PropertyValueFactory<>("homeTeam"));
        clmGuestTeamC.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));
        clmHGoalC.setCellValueFactory(new PropertyValueFactory<>("homeScore"));
        clmGGoalC.setCellValueFactory(new PropertyValueFactory<>("awayScore"));
        clmMatchIDC.setCellValueFactory(new PropertyValueFactory<>("matchID"));

        tblViewC.setItems(groupModel.GroupCPlay());
    }

    public void showColumnGroupD()
    {
        clmHomeTeamD.setCellValueFactory(new PropertyValueFactory<>("homeTeam"));
        clmGuestTeamD.setCellValueFactory(new PropertyValueFactory<>("awayTeam"));
        clmHGoalD.setCellValueFactory(new PropertyValueFactory<>("homeScore"));
        clmGGoalD.setCellValueFactory(new PropertyValueFactory<>("awayScore"));
        clmMatchIDD.setCellValueFactory(new PropertyValueFactory<>("matchID"));

        tblViewD.setItems(groupModel.GroupDPlay());
    }

    

    @FXML
    private void actionEventSubmit(ActionEvent event)
    {
        int y = Integer.parseInt(txtMatchId.getText());
        int x = Integer.parseInt(txtHomeScore.getText());
        
        //groupModel.group
        
        
    }

}
