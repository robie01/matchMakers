/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Model;

import BE.Match;
import BE.Team;
import GUI.Model.TeamModel;
import java.lang.reflect.Array;
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
    private final ArrayList<Match> matchArrayList1A = new ArrayList<Match>();
    private final TeamModel teamModel = TeamModel.getTeamModel();
    

    ArrayList<ArrayList<Team>> allGroups = new ArrayList<>();
    ObservableList<ObservableList<Match>> allMatchLists = FXCollections.observableArrayList();
    private final ArrayList<Match> matchList1A = new ArrayList<Match>();
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
    
    public ObservableList<ObservableList<Match>> getAllMatchList()
    {
        //allMatchLists.add(matchList1A);
        allMatchLists.add(matchList2A);
        allMatchLists.add(matchList1B);
        allMatchLists.add(matchList2B);
        allMatchLists.add(matchList1C);
        allMatchLists.add(matchList1C);
        allMatchLists.add(matchList1D);
        allMatchLists.add(matchList2D);
        
        return allMatchLists;
    }

    public ArrayList<ArrayList<Team>> getAllGroups()
    {
        return allGroups;
    }
    
    public ArrayList<Match> getGroupAPlay()
    {
        
        return matchArrayList1A;
        
    }
    
    public final void GroupAPlay()
    {

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

            matchArrayList1A.add(Match1);
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

            //return matchList1A;

        } else
        {
            //first round
            Match Match13 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(1), 12);
            Match Match14 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(2), 13);
            //Second Round
            Match Match15 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(0), 14);
            Match Match16 = new Match(groupModel.getListA().get(1), groupModel.getListA().get(0), 16);
            //Third Round
            Match Match17 = new Match(groupModel.getListA().get(0), groupModel.getListA().get(2), 17);
            Match Match18 = new Match(groupModel.getListA().get(2), groupModel.getListA().get(1), 18);

            matchList2A.add(Match13);
            matchList2A.add(Match14);
            matchList2A.add(Match15);
            matchList2A.add(Match16);
            matchList2A.add(Match17);
            matchList2A.add(Match18);

            //return matchList2A;
        }

    }

    public ObservableList<Match> GroupBPlay()
    {

        if (listB.size() == 4)
        {
            //First Round
            Match Match19 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(1), 19);
            Match Match20 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(3), 20);
            //Second Round
            Match Match21 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(2), 21);
            Match Match22 = new Match(groupModel.getListB().get(3), groupModel.getListB().get(0), 22);
            //Third Round
            Match Match23 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(3), 23);
            Match Match24 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(2), 24);
            //Fourth Round
            Match Match25 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(0), 25);
            Match Match26 = new Match(groupModel.getListB().get(3), groupModel.getListB().get(2), 26);
            //Fifth Round
            Match Match27 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(1), 27);
            Match Match28 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(3), 28);
            //Sixth Round
            Match Match29 = new Match(groupModel.getListB().get(3), groupModel.getListB().get(1), 29);
            Match Match30 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(0), 30);

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

            //first round
            Match Match31 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(1), 31);
            Match Match32 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(2), 32);
            //Second Round
            Match Match33 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(0), 33);
            Match Match34 = new Match(groupModel.getListB().get(1), groupModel.getListB().get(0), 34);
            //Third Round
            Match Match35 = new Match(groupModel.getListB().get(0), groupModel.getListB().get(2), 35);
            Match Match36 = new Match(groupModel.getListB().get(2), groupModel.getListB().get(1), 36);

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

        if (listC.size() == 4)
        {

            //First Round
            Match Match37 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(1), 37);
            Match Match38 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(3), 38);
            //Second Round
            Match Match39 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(2), 39);
            Match Match40 = new Match(groupModel.getListC().get(3), groupModel.getListC().get(0), 40);
            //Third Round
            Match Match41 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(3), 41);
            Match Match42 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(2), 42);
            //Fourth Round
            Match Match43 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(0), 43);
            Match Match44 = new Match(groupModel.getListC().get(3), groupModel.getListC().get(2), 44);
            //Fifth Round
            Match Match45 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(1), 45);
            Match Match46 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(3), 46);
            //Sixth Round
            Match Match47 = new Match(groupModel.getListC().get(3), groupModel.getListC().get(1), 47);
            Match Match48 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(0), 48);

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

            //first round
            Match Match49 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(1), 49);
            Match Match50 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(2), 50);
            //Second Round
            Match Match51 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(0), 51);
            Match Match52 = new Match(groupModel.getListC().get(1), groupModel.getListC().get(0), 52);
            //Third Round
            Match Match53 = new Match(groupModel.getListC().get(0), groupModel.getListC().get(2), 53);
            Match Match54 = new Match(groupModel.getListC().get(2), groupModel.getListC().get(1), 54);

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

        if (listD.size() == 4)
        {

            //First Round
            Match Match55 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(1), 55);
            Match Match56 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(3), 56);
            //Second Round
            Match Match57 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(2), 57);
            Match Match58 = new Match(groupModel.getListD().get(3), groupModel.getListD().get(0), 58);
            //Third Round
            Match Match59 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(3), 59);
            Match Match60 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(2), 60);
            //Fourth Round
            Match Match61 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(0), 61);
            Match Match62 = new Match(groupModel.getListD().get(3), groupModel.getListD().get(2), 62);
            //Fifth Round
            Match Match63 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(1), 63);
            Match Match64 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(3), 64);
            //Sixth Round
            Match Match65 = new Match(groupModel.getListD().get(3), groupModel.getListD().get(1), 65);
            Match Match66 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(0), 66);

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

            //first round
            Match Match67 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(1), 67);
            Match Match68 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(2), 68);
            //Second Round
            Match Match69 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(0), 69);
            Match Match70 = new Match(groupModel.getListD().get(1), groupModel.getListD().get(0), 70);
            //Third Round
            Match Match71 = new Match(groupModel.getListD().get(0), groupModel.getListD().get(2), 71);
            Match Match72 = new Match(groupModel.getListD().get(2), groupModel.getListD().get(1), 72);

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
