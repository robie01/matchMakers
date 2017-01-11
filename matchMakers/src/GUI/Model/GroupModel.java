/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.Team;
import GUI.Model.TeamModel;
import java.util.ArrayList;
import java.util.Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author robiesun
 */
public class GroupModel
{

    private static final GroupModel groupModel = new GroupModel();
    private ArrayList<Team> list = new ArrayList<Team>();

    private ArrayList<Team> listA = new ArrayList<Team>();
    private ArrayList<Team> listB = new ArrayList<Team>();
    private ArrayList<Team> listC = new ArrayList<Team>();
    private ArrayList<Team> listD = new ArrayList<Team>();
    private TeamModel teamModel = TeamModel.getTeamModel();
   
    ArrayList<ArrayList<Team>> allGroups = new ArrayList<>();

    public GroupModel()
    {

    }

    public static GroupModel getGroupModel()
    {
        return groupModel;
    }

    public void addTeamToGroup()
    {

        allGroups.add(listA);
        allGroups.add(listB);
        allGroups.add(listC);
        allGroups.add(listD);

        list.clear();
        list.addAll(teamModel.getTeams());
        Collections.shuffle(list);
        int count = 0;
        for (Team team : list)
        {
            System.out.println(team.getName() + " " + count + "");
            allGroups.get(count).add(team);
            if (count == 3)
            {
                count = -1;
            }
            count++;
        }
        System.out.println("Done");
    }

    public ArrayList<ArrayList<Team>> getAllGroups()
    {
        return allGroups;
    }

}
