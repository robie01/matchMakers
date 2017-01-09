/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.Group;
import BE.Team;
import java.util.ArrayList;
import java.util.Random;
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
    //private static int smallestGroups = 3, biggestGroups = 4;

    private ObservableList<Team> teamList = FXCollections.observableArrayList();
    
    private ArrayList<Team> groupA = new ArrayList<>();
    private ArrayList<Team> groupB = new ArrayList<>();
    private ArrayList<Team> groupC = new ArrayList<>();
    private ArrayList<Team> groupD = new ArrayList<>();
    private ArrayList<ArrayList<Team>> Groups = new ArrayList<>();

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

    public ArrayList<Team> getGroupB()
    {
        return groupB;
    }

    public ArrayList<Team> getGroupC()
    {
        return groupC;
    }

    public ArrayList<Team> getGroupD()
    {
        return groupD;
    }
    public void getGroupA() // Used
    {
        teamList.get(0);
        teamList.get(1);
        teamList.get(2);
        teamList.get(3);
    }
    public ArrayList<ArrayList<Team>> getGroups() //not Used
    {

        Groups.add(groupA);
        Groups.add(groupB);
        Groups.add(groupC);
        Groups.add(groupD);
        return Groups;
    }

    //Singleton
    public static TeamModel getTeamModel()
    {
        return TEAMMODEL;
    }

    public void generateGroups() //Not Used
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
    }

    }
