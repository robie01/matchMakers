/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Jesper Enemark
 */
public class GroupScheduleViewController implements Initializable
{

    @FXML
    private TableView<?> tblViewA;
    @FXML
    private TableColumn<?, ?> clmHomeTeamA;
    @FXML
    private TableColumn<?, ?> clmGoalA;
    @FXML
    private TableColumn<?, ?> clmGuestTeamA;
    @FXML
    private TableColumn<?, ?> clmMatchIDA;
    @FXML
    private TableView<?> tblViewB;
    @FXML
    private TableColumn<?, ?> clmHomeTeamB;
    @FXML
    private TableColumn<?, ?> clmGoalB;
    @FXML
    private TableColumn<?, ?> clmGuestTeamB;
    @FXML
    private TableColumn<?, ?> clmMatchIDB;
    @FXML
    private TableView<?> tblViewC;
    @FXML
    private TableColumn<?, ?> clmHomeTeamC;
    @FXML
    private TableColumn<?, ?> clmGoalC;
    @FXML
    private TableColumn<?, ?> clmGuestTeamC;
    @FXML
    private TableColumn<?, ?> clmMatchIDC;
    @FXML
    private TableView<?> tblViewD;
    @FXML
    private TableColumn<?, ?> clmHomeTeamD;
    @FXML
    private TableColumn<?, ?> clmGoalD;
    @FXML
    private TableColumn<?, ?> clmGuestTeamD;
    @FXML
    private TableColumn<?, ?> clmMatchIDD;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
