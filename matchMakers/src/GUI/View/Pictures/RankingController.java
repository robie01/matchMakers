/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.View.Pictures;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author EdwinSilva
 */
public class RankingController implements Initializable {

    @FXML
    private ListView<?> rankingBId;
    @FXML
    private ListView<?> rankingBPoints;
    @FXML
    private ListView<?> rankingBGoalDif;
    @FXML
    private ListView<?> RankingBNames;
    @FXML
    private ListView<?> rankingDPoints;
    @FXML
    private ListView<?> rankingDGoalDif;
    @FXML
    private ListView<?> RankingDNames;
    @FXML
    private ListView<?> rankingDId;
    @FXML
    private ListView<?> rankingAId;
    @FXML
    private ListView<?> rankingAPoints;
    @FXML
    private ListView<?> rankingAGoalDif;
    @FXML
    private ListView<?> RankingANames;
    @FXML
    private ListView<?> rankingCPoints; 
    @FXML
    private ListView<?> rankingCGoalDif;
    @FXML
    private ListView<?> RankingCNames;
    @FXML
    private ListView<?> rankingCId;
    @FXML
    private Button btnRefreshRanking;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RefreshRankingAction(ActionEvent event) {
    }
    
}
