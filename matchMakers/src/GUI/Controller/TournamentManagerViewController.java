/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import BE.Team;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author Masoud
 */
public class TournamentManagerViewController implements Initializable {
    
    private Label label;
    @FXML
    private Button generatebtnID;
    @FXML
    private Label teamcountlbl;
    @FXML
    private ListView<Team> teamNameListview;
    @FXML
    private TextField txtField;
    @FXML
    private Label warningSign;
    @FXML
    private Button updateBtn;
    @FXML
    private Button deletebtn;
    
    
    private int teamCount = 0;
     
    private int teamId = 0;
  
    
    ObservableList<Team> teamList = FXCollections.observableArrayList();
    //
   
  
   
   
   
   
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        teamNameListview.setItems(teamList); // Binding
    }    


    

    @FXML
    private void generatebtnAction(ActionEvent event) 
    {
        if(teamCount == 0 || teamCount == 0){
                            
      
        Stage stage = null; 
        Parent root = null;
        
        
        
        if(event.getSource()==generatebtnID){
        
        //get reference to the button's stage  
       stage=(Stage) generatebtnID.getScene().getWindow();
       
       //load up OTHER FXML document
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/GUI/View/MainView1.fxml"));
            try {
                root = fxmlLoader.load();
            } catch (IOException ex) {
                Logger.getLogger(TournamentManagerViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
                MainView1Controller controller = (MainView1Controller)fxmlLoader.getController();
        controller.setTeamList(teamList);
        
        
      }
     
     //create a new scene with root and set the stage
      Scene scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
    }
    }
    

    @FXML
    private void addbtnAction(ActionEvent event) throws IOException
    {
         
        if(!txtField.getText().isEmpty()) {
            
            teamList.add(new Team(++teamId,txtField.getText()));
            teamcountlbl.setText(""+ ++teamCount);
            txtField.clear();
            warningSign.setText("");
        }
         
        else
            warningSign.setText("Warning: team name required");
          
    }

    @FXML
    private void deletebtnAction(ActionEvent event)
    {
       
               
        int selectedItem = teamNameListview.getSelectionModel().getSelectedIndex();
        teamList.remove(selectedItem);
        teamCount--;
    
        teamcountlbl.setText("" + teamCount);
        teamId--;
        txtField.clear();

    }

    @FXML
    private void updateBtnAction(ActionEvent event) {
        
        
//        if(!txtField.getText().isEmpty()) {
//            
//            teamList.add(new Team(++teamId,txtField.getText()));
//            teamcountlbl.setText(""+ ++teamCount);
//            txtField.clear();
//            warningSign.setText("");
//        }
//         
//        else
//            warningSign.setText("Warning: team name required");
    }
   
}
