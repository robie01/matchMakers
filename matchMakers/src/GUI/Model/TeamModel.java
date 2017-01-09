/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.*;
import java.util.ArrayList;
import javafx.collections.FXCollections;
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
    private ArrayList<Group> GroupA =  new ArrayList<>();
    private ArrayList<Group> GroupB =  new ArrayList<>();
    private ArrayList<Group> GroupC =  new ArrayList<>();
    private ArrayList<Group> GroupD =  new ArrayList<>();
    
    
    //singleton
    private TeamModel() 
    {
    
    }
    public ObservableList<Team> getTeams() {
        return teamList;
    }
    public ArrayList<Group> getGroupA() {
        return GroupA;
    }
    public ArrayList<Group> getGroupB() {
        return GroupB;
    }
    public ArrayList<Group> getGroupC() {
        return GroupC;
    }
    public ArrayList<Group> getGroupD() {
        return GroupD;
    }
    
    
    
    
    
    //Singleton
    public static TeamModel getTeamModel() {
        return TEAMMODEL;
    }
    

    
    
}
