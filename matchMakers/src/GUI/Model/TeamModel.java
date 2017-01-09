/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.*;
import java.util.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

/**
 *
 * @author Jesper Enemark
 */
public class TeamModel
{
    //singleton
    private static final TeamModel TEAMMODEL = new TeamModel();
    
    private ObservableList<Team> teamList = FXCollections.observableArrayList();
    
    //singleton
    private TeamModel() 
    {
    
    }
    public ObservableList<Team> getTeams() {
        return teamList;
    }
    
    //Singleton
    public static TeamModel getTeamModel() {
        return TEAMMODEL;
    }
    

    
    
}
