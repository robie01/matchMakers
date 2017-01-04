/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javafx.stage.Modality;
import javafx.stage.Stage;
import oracle.jrockit.jfr.events.Bits;

/**
 *
 * @author Masoud
 */
public class TournamentManagerViewController implements Initializable
{

    
    @FXML
    private Button generatebtnID;
    @FXML
    private Button addbtnID;
    @FXML
    private Button deletebtnID;
    @FXML
    private Label teamcountlbl;
    @FXML
    private ListView<String> teamNameListview;

    @FXML
    private TextField txtfield;
    //a list
    ObservableList<String> teamList = FXCollections.observableArrayList();
    //instance variable
    public int teamCount = 0;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {

    }
    /*
    needs implementation **********
    
    makes sure generation of a tournament is only allowed between a number of 12 and 16 teams
    switches view if the statement is true.
    */
    @FXML
    private void generatebtnAction(ActionEvent event) throws IOException
    {
        if (teamCount >= 12 && teamCount <= 16)
        {
            Stage stage = null;
            Parent root = null;
            if (event.getSource() == generatebtnID)
            {
                //get reference to the button's stage         
                stage = (Stage) generatebtnID.getScene().getWindow();
                //load up OTHER FXML document
                root = FXMLLoader.load(getClass().getResource("/GUI/View/MainView.fxml"));
            }

            //create a new scene with root and set the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }
    //adds whatever is in the txtfield to the listView, increases teamcount by 1, sets label equavelant to teamcount, clears txtfield.
    @FXML
    private void addbtnAction(ActionEvent event) throws IOException
    {
        
        teamList.add(txtfield.getText());
        teamNameListview.setItems(teamList);
        teamCount++;
        teamcountlbl.setText(""+teamCount);
        txtfield.clear();

    }

    //delete action, deletes the selectedItem in the listView, remove one number from teamCount and sets label equal to teamCount variable.
    @FXML
    private void deletebtnAction(ActionEvent event) throws IOException
    {
        int selectedItem = teamNameListview.getSelectionModel().getSelectedIndex();
        teamList.remove(selectedItem);
        teamCount--;
        teamcountlbl.setText(""+teamCount);

    }
}
