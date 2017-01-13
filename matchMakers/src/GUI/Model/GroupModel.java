/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.Match;
import BE.Team;
import BLL.GroupMatch;
import GUI.Model.TeamModel;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author robiesun
 */
public class GroupModel
{

    private static final GroupModel groupModel = new GroupModel();
    public ArrayList<Team> list = new ArrayList<Team>();

    private final ArrayList<Team> listA = new ArrayList<Team>();
    private final ArrayList<Team> listB = new ArrayList<Team>();
    private final ArrayList<Team> listC = new ArrayList<Team>();
    private final ArrayList<Team> listD = new ArrayList<Team>();
    private final TeamModel teamModel = TeamModel.getTeamModel();

    public ArrayList<ArrayList<Team>> allGroups = new ArrayList<>();

    //Not used ObservableList<ObservableList<Match>> allMatchLists = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList1A = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList2A = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList1B = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList2B = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList1C = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList2C = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList1D = FXCollections.observableArrayList();
    private final ObservableList<Match> matchList2D = FXCollections.observableArrayList();

    private GroupModel()
    {

    }

    public ObservableList<Match> getMatchList1A()
    {
        return matchList1A;
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

    public void GroupArrangements()
    {
        groupModel.allGroups.add(groupModel.getListA());
        groupModel.allGroups.add(groupModel.getListB());
        groupModel.allGroups.add(groupModel.getListC());
        groupModel.allGroups.add(groupModel.getListD());

        groupModel.list.clear();
        groupModel.list.addAll(teamModel.getTeams());
        Collections.shuffle(groupModel.list);
        int count = 0;
        for (Team team : groupModel.list)
        {

            groupModel.allGroups.get(count).add(team);
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

    public ObservableList<Match> GroupAPlay()
    {
        
        matchList1A.clear();
        if (listA.size() == 4)
        {

            //First Round
            Match Match1 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
            Match Match2 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(3), 1);
            //Second Round
            Match Match3 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 2);
            Match Match4 = new Match(groupModel.getListA().get(3), groupModel.getListA().get(0), 3);
            //Third Round
            Match Match5 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(3), 4);
            Match Match6 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(2), 5);

            //Fourth Round
            Match Match7 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 6);
            Match Match8 = new Match(groupModel.getListA().get(3), groupModel.getListA().get(2), 7);
            //Fifth Round
            Match Match9 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 8);
            Match Match10 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(3), 9);
            //Sixth Round
            Match Match11 = new Match(groupModel.getListA().get(3), groupModel.getListA().get(1), 10);
            Match Match12 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(0), 11);

            matchList1A.add(Match1);
            matchList1A.add(Match2);
            matchList1A.add(Match3);
            matchList1A.add(Match4);
            matchList1A.add(Match5);
            matchList1A.add(Match6);
            matchList1A.add(Match7);
            matchList1A.add(Match8);
            matchList1A.add(Match9);
            matchList1A.add(Match10);
            matchList1A.add(Match11);
            matchList1A.add(Match12);
            
            
            return matchList1A;
            

        } else
        {
            
              matchList2A.clear();
            //First Round
            Match Match13 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 0);
            //Second Round
            Match Match14 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 1);
            //Third Round
            Match Match15 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(0), 2);
            //Fourth Round
            Match Match16 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 3);
            //Fifth Round
            Match Match17 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(2), 4);
            //Sixth Round
            Match Match18 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 5);

            matchList2A.add(Match13);
            matchList2A.add(Match14);
            matchList2A.add(Match15);
            matchList2A.add(Match16);
            matchList2A.add(Match17);
            matchList2A.add(Match18);

            return matchList2A;
        }
        
        
    }
    
    public void UpdateMatchInATable(int matchId, int homeScore, int guestScore)
    {
        Match matchToUpdate = null;
        
        for (Match match : matchList1A)
        {
            if(matchId==match.getMatchID())
            {
            matchToUpdate = match;
            }
        }
        if(matchToUpdate != null){
        matchList1A.remove(matchToUpdate);
        matchToUpdate.setHomeScore(homeScore);
        matchToUpdate.setAwayScore(guestScore);
        
        
        matchList1A.add(matchToUpdate);
        matchToUpdate = null;
        }
    }
    public void UpdateMatchInBTable(int matchId, int homeScore, int guestScore)
    {
        Match matchToUpdate = null;
        
        for (Match match : matchList1B)
        {
            if(matchId==match.getMatchID())
            {
            matchToUpdate = match;
            }
        }
        if(matchToUpdate != null){
        matchList1B.remove(matchToUpdate);
        matchToUpdate.setHomeScore(homeScore);
        matchToUpdate.setAwayScore(guestScore);
        
        
        matchList1A.add(matchToUpdate);
        matchToUpdate = null;
        }
    }
    
    public ObservableList<Match> GroupBPlay()
    {
        
        matchList1B.clear();
        if (listB.size() == 4)
        {
            //First Round
            Match Match19 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(1), 12);
            Match Match20 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(3), 13);
            //Second Round
            Match Match21 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(2), 14);
            Match Match22 = new Match(groupModel.getListB().get(3), groupModel.getListB().get(0), 15);
            //Third Round
            Match Match23 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(3), 16);
            Match Match24 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(2), 17);
            //Fourth Round
            Match Match25 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(0), 18);
            Match Match26 = new Match(groupModel.getListB().get(3), groupModel.getListB().get(2), 19);
            //Fifth Round
            Match Match27 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(1), 20);
            Match Match28 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(3), 21);
            //Sixth Round
            Match Match29 = new Match(groupModel.getListB().get(3), groupModel.getListB().get(1), 22);
            Match Match30 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(0), 23);

            matchList1B.add(Match19);
            matchList1B.add(Match20);
            matchList1B.add(Match21);
            matchList1B.add(Match22);
            matchList1B.add(Match23);
            matchList1B.add(Match24);
            matchList1B.add(Match25);
            matchList1B.add(Match26);
            matchList1B.add(Match27);
            matchList1B.add(Match28);
            matchList1B.add(Match29);
            matchList1B.add(Match30);

            return matchList1B;

        } else
        {
            
            matchList2B.clear();
            //First round
            Match Match31 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(1), 6);
            //Second Round
            Match Match32 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(2), 7);
            //Third Round
            Match Match33 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(0), 8);
            //Fourth Round
            Match Match34 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(0), 9);
            //Fifth
            Match Match35 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(2), 10);
            //Sixth
            Match Match36 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(1), 11);

            matchList2B.add(Match31);
            matchList2B.add(Match32);
            matchList2B.add(Match33);
            matchList2B.add(Match34);
            matchList2B.add(Match35);
            matchList2B.add(Match36);

            return matchList2B;

        }

    }

    public ObservableList<Match> GroupCPlay()
    {
        
        matchList1C.clear();
        if (listC.size() == 4)
        {

            //First Round
            Match Match37 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(1), 24);
            Match Match38 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(3), 25);
            //Second Round
            Match Match39 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(2), 26);
            Match Match40 = new Match(groupModel.getListC().get(3), groupModel.getListC().get(0), 27);
            //Third Round
            Match Match41 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(3), 28);
            Match Match42 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(2), 29);
            //Fourth Round
            Match Match43 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(0), 30);
            Match Match44 = new Match(groupModel.getListC().get(3), groupModel.getListC().get(2), 31);
            //Fifth Round
            Match Match45 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(1), 32);
            Match Match46 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(3), 33);
            //Sixth Round
            Match Match47 = new Match(groupModel.getListC().get(3), groupModel.getListC().get(1), 34);
            Match Match48 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(0), 35);

            matchList1C.add(Match37);
            matchList1C.add(Match38);
            matchList1C.add(Match39);
            matchList1C.add(Match40);
            matchList1C.add(Match41);
            matchList1C.add(Match42);
            matchList1C.add(Match43);
            matchList1C.add(Match44);
            matchList1C.add(Match45);
            matchList1C.add(Match46);
            matchList1C.add(Match47);
            matchList1C.add(Match48);

            return matchList1C;

        } else
        {
            
            matchList2C.clear();
            //First Round
            Match Match49 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(1), 12);
            //Second Round
            Match Match50 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(2), 13);
            //Third Round
            Match Match51 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(0), 14);
            //Four Round
            Match Match52 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(0), 15);
            //Fifth Round
            Match Match53 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(2), 16);
            //Sixth Round
            Match Match54 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(1), 17);

            matchList2C.add(Match49);
            matchList2C.add(Match50);
            matchList2C.add(Match51);
            matchList2C.add(Match52);
            matchList2C.add(Match53);
            matchList2C.add(Match54);

            return matchList2C;

        }

    }

    public ObservableList<Match> GroupDPlay()
    {
        
        matchList1D.clear();
        if (listD.size() == 4)
        {

            //First Round
            Match Match55 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(1), 36);
            Match Match56 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(3), 37);
            //Second Round
            Match Match57 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(2), 38);
            Match Match58 = new Match(groupModel.getListD().get(3), groupModel.getListD().get(0), 39);
            //Third Round
            Match Match59 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(3), 40);
            Match Match60 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(2), 41);
            //Fourth Round
            Match Match61 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(0), 42);
            Match Match62 = new Match(groupModel.getListD().get(3), groupModel.getListD().get(2), 43);
            //Fifth Round
            Match Match63 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(1), 44);
            Match Match64 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(3), 45);
            //Sixth Round
            Match Match65 = new Match(groupModel.getListD().get(3), groupModel.getListD().get(1), 46);
            Match Match66 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(0), 47);

            matchList1D.add(Match55);
            matchList1D.add(Match56);
            matchList1D.add(Match57);
            matchList1D.add(Match58);
            matchList1D.add(Match59);
            matchList1D.add(Match60);
            matchList1D.add(Match61);
            matchList1D.add(Match62);
            matchList1D.add(Match63);
            matchList1D.add(Match64);
            matchList1D.add(Match65);
            matchList1D.add(Match66);

            return matchList1D;

        } else
        {
            
             matchList2D.clear();
            //first round
            Match Match67 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(1), 18);
            //Second Round
            Match Match68 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(2), 19);
            //Third Round
            Match Match69 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(0), 20);
            //Four Round
            Match Match70 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(0), 21);
            //Fifth Round
            Match Match71 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(2), 22);
            //Sixth Round
            Match Match72 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(1), 23);

            matchList2D.add(Match67);
            matchList2D.add(Match68);
            matchList2D.add(Match69);
            matchList2D.add(Match70);
            matchList2D.add(Match71);
            matchList2D.add(Match72);

            return matchList2D;

        }

    }

}
