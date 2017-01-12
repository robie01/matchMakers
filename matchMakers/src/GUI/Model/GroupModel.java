/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.Match;
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

    private final ArrayList<Team> listA = new ArrayList<Team>();
    private final ArrayList<Team> listB = new ArrayList<Team>();
    private final ArrayList<Team> listC = new ArrayList<Team>();
    private final ArrayList<Team> listD = new ArrayList<Team>();

    private final TeamModel teamModel = TeamModel.getTeamModel();

    ArrayList<ArrayList<Team>> allGroups = new ArrayList<>();
    private final ObservableList<Match> matchlist1 = FXCollections.observableArrayList();
    private final ObservableList<Match> matchlist2 = FXCollections.observableArrayList();

    private GroupModel()
    {

    }

    public static GroupModel getGroupModel()
    {
        return groupModel;
    }

    public ArrayList<Team> getListA()
    {

        return listA;
    }

    public ArrayList<Team> getListB()
    {
        return listB;
    }

    public ArrayList<Team> getListC()
    {
        return listC;
    }

    public ArrayList<Team> getListD()
    {
        return listD;
    }

    public ObservableList<Match> getMatchListA()
    {
        return matchlist1;
    }

    public ObservableList<Match> getMatchList2()
    {
        return matchlist2;
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
    
    public ObservableList<Match> GroupBPlay() 
    {
        
        if(listB.size() == 4) 
        {
            Match Match1 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
        }
        return null;
    }

    public ObservableList<Match> GroupAPlay()
    {
        
        if (listA.size() == 4)
        {
            //First Round
            Match Match1 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
            Match Match2 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 1);
            //Second Round
            Match Match3 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(3), 2);
            Match Match4 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 3);
            //Third Round
            Match Match5 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 4);
            Match Match6 = new Match(groupModel.getListA().get(3), groupModel.getListA().get(1), 5);

            //Fourth Round
            Match Match7 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 6);
            Match Match8 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 7);
            //Fifth Round
            Match Match9 = new Match(groupModel.getListA().get(3), groupModel.getListA().get(1), 8);
            Match Match10 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 9);
            //Sixth Round
            Match Match11 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 10);
            Match Match12 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(3), 11);

            matchlist1.add(Match1);
            matchlist1.add(Match2);
            matchlist1.add(Match3);
            matchlist1.add(Match4);
            matchlist1.add(Match5);
            matchlist1.add(Match6);
            matchlist1.add(Match7);
            matchlist1.add(Match8);
            matchlist1.add(Match9);
            matchlist1.add(Match10);
            matchlist1.add(Match11);
            matchlist1.add(Match12);

            return matchlist1;

        } else
        {
            //first round
            Match Match13 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
            Match Match14 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 1);
            //Second Round
            Match Match15 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(0), 2);
            Match Match16 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 3);
            //Third Round
            Match Match17 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 4);
            Match Match18 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 5);

            matchlist2.add(Match13);
            matchlist2.add(Match14);
            matchlist2.add(Match15);
            matchlist2.add(Match16);
            matchlist2.add(Match17);
            matchlist2.add(Match18);
            
            return matchlist2;
        }

    }

    

}
