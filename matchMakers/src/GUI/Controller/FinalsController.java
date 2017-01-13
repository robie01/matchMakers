/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View;

import GUI.Model.GroupModel;
import GUI.Model.TeamModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Jesper Enemark
 */
public class FinalsController implements Initializable
{

    @FXML
    private TextField txtFirstQuarterFinalist;
    @FXML
    private TextField txtFirstQuarterGoal1;
    @FXML
    private TextField txtSecondQuarterFinalist;
    @FXML
    private TextField txt3rdQuarterFinalist;
    @FXML
    private TextField txtSecondQuarterGoal2;
    @FXML
    private TextField txt7thQuarterFinalist;
    @FXML
    private TextField txt6thQuarterFinalist;
    @FXML
    private TextField txtThirdQuarterGoal1;
    @FXML
    private TextField txt5thQuarterFinalist;
    @FXML
    private TextField txt4thQuarterFinals;
    @FXML
    private TextField txt8thQuarterFinalist;
    @FXML
    private TextField txtForthQuarterGoal1;
    @FXML
    private TextField txt1stSemiFinalist;
    @FXML
    private TextField txt2ndSemiFinalist;
    @FXML
    private TextField txt3rdSemiFinalist;
    @FXML
    private TextField txt4thSemiFinalist;
    @FXML
    private TextField txtFirstSemiGoal1;
    @FXML
    private TextField txt1stFinalist;
    @FXML
    private TextField txt2ndFinalist;
    @FXML
    private TextField txt2ndsemiGoal2;
    @FXML
    private TextField txtWinner;
    @FXML
    private TextField txtFinalGoal1;
    @FXML
    private TextField txtFirstQuarterGoal2;
    @FXML
    private TextField txtSecondQuarterGoal1;
    @FXML
    private TextField txtThirdQuarterGoal2;
    @FXML
    private TextField txtForthQuarterGoal2;
    @FXML
    private TextField txt2ndsemiGoal1;
    @FXML
    private TextField txtFirstSemiGoal2;
    @FXML
    private TextField txtFinalGoal2;

    /**
     * Initializes the controller class.
     */
    private GroupModel groupModel = GroupModel.getGroupModel();
    private TeamModel teamModel = TeamModel.getTeamModel();
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        txtFirstQuarterFinalist.setText();
        txtSecondQuarterFinalist.setText();
        
        txt3rdQuarterFinalist.setText();
        txt4thQuarterFinals.setText();
        
        txt5thQuarterFinalist.setText();
        txt6thQuarterFinalist.setText();
        
        txt7thQuarterFinalist.setText();
        txt8thQuarterFinalist.setText();
    }    

    @FXML
    private void btnquarterFinalEvent(ActionEvent event)
    {
        
    }

    @FXML
    private void btnSemiEvent(ActionEvent event)
    {
    }

    @FXML
    private void btnFinalEvent(ActionEvent event)
    {
    }
    
}
