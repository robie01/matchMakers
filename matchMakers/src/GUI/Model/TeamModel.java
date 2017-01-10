/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.Group;
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

 /* private ArrayList<Team> groupA = new ArrayList<>();
    private ArrayList<Team> groupB = new ArrayList<>();
    private ArrayList<Team> groupC = new ArrayList<>();
    private ArrayList<Team> groupD = new ArrayList<>();
    private ArrayList<ArrayList<Team>> Groups = new ArrayList<>();
*/
    //singleton
    private TeamModel()
    {

    }

    public ObservableList<Team> getTeams()
    {
        return teamList;
    }
    /*public ArrayList<Team> getGroupA()
    {
        return groupA;
    }*/
    
    
    
    
    public ObservableList<Team> getGroupA() // Used
    { ObservableList<Team> teams = FXCollections.observableArrayList();
        for (int i = 0; i < 4; i++)
        {
            teams.add(teamList.get(i));
        }
        return teams;
    }
    public ObservableList<Team> getGroupB() {
        ObservableList<Team> teams = FXCollections.observableArrayList();
        for (int i = 4; i < 8; i++)
        {
            teams.add(teamList.get(i));
        }
        return teams;
    }
    

    public ObservableList<Team> getGroupC()
    {
        ObservableList<Team> teams = FXCollections.observableArrayList();
        for (int i = 8; i < 12; i++)
        {
            teams.add(teamList.get(i));
        }
        return teams;
        
    }

    public ObservableList<Team> getGroupD()
    {
        ObservableList<Team> teams = FXCollections.observableArrayList();
        for (int i = 12; i < 1; i++)
        {
            teams.add(teamList.get(i));
        }
        return teams;
      
    }

    /*public ArrayList<ArrayList<Team>> getGroups() //not Used
    {

        Groups.add(groupA);
        Groups.add(groupB);
        Groups.add(groupC);
        Groups.add(groupD);
        return Groups;
    }
*/
    //Singleton
    public static TeamModel getTeamModel()
    {
        return TEAMMODEL;
    }

    /*public void generateGroups() //Not Used
    {

        boolean checkNumber = true;
        for (Team teams : teamList)
        {

            while (checkNumber == true)
            {

                if (groupA.size() != 4)
                {
                    teams.setGroup("A");
                    groupA.add(teams);
                    checkNumber = false;
                } else if (groupB.size() != 4)
                {
                    teams.setGroup("B");
                    groupB.add(teams);
                    checkNumber = false;
                } else if (groupC.size() != 4)
                {
                    teams.setGroup("C");
                    groupC.add(teams);
                    checkNumber = false;

                } else if (groupD.size() != 4)
                {
                    teams.setGroup("D");
                    groupC.add(teams);
                    checkNumber = false;
                }

            }

        }
*/
    }


