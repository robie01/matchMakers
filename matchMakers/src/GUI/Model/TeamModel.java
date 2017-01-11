/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;


import BE.Team;
import com.sun.org.apache.xpath.internal.axes.SubContextList;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

/**
 *
 * @author Jesper Enemark
 */
public class TeamModel
{

    //singleton
    private static final TeamModel TEAMMODEL = new TeamModel();
    //private static int smallestGroups = 3, biggestGroups = 4;
    ArrayList<ListView> lists = new ArrayList<>();

    private ObservableList<Team> teamList = FXCollections.observableArrayList();

 
    //singleton
    private TeamModel()
    {

    }

    public ObservableList<Team> getTeams()
    {
        return teamList;
    }
    
  
    //Singleton
    public static TeamModel getTeamModel()
    {
        return TEAMMODEL;
    }

    
    }


