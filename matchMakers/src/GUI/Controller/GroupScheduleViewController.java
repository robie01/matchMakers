/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Match;
import BE.Team;
import GUI.Model.GroupModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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
    private GroupModel groupModel = new GroupModel();
    @FXML
    private TableView<Match> tblViewA;
    @FXML
    private TableColumn<Match, String> clmHomeTeamA;
    @FXML
    private TableColumn<Match, String> clmGoalA;
    @FXML
    private TableColumn<Match, String> clmGuestTeamA;
    @FXML
    private TableColumn<Match, String> clmMatchIDA;
    @FXML
    private TableView<Match> tblViewB;
    @FXML
    private TableColumn<Match, String> clmHomeTeamB;
    @FXML
    private TableColumn<Match, String> clmGoalB;
    @FXML
    private TableColumn<Match, String> clmGuestTeamB;
    @FXML
    private TableColumn<Match, String> clmMatchIDB;
    @FXML
    private TableView<Match> tblViewC;
    @FXML
    private TableColumn<Match, String> clmHomeTeamC;
    @FXML
    private TableColumn<Match, String> clmGoalC;
    @FXML
    private TableColumn<Match, String> clmGuestTeamC;
    @FXML
    private TableColumn<Match, String> clmMatchIDC;
    @FXML
    private TableView<Match> tblViewD;
    @FXML
    private TableColumn<Match, String> clmHomeTeamD;
    @FXML
    private TableColumn<Match, String> clmGoalD;
    @FXML
    private TableColumn<Match, String> clmGuestTeamD;
    @FXML
    private TableColumn<Match, String> clmMatchIDD;

    /**
     * Initializes the controller class.
     */
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        clmHomeTeamA.setCellValueFactory(new PropertyValueFactory<>("hometeam"));
        clmHomeTeamB.setCellValueFactory(new PropertyValueFactory<>("hometeam"));
        
    }    
    
}
