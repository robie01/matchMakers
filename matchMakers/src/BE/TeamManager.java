/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author Jesper Enemark
 */
public class TeamManager
        
{
    int id; // Team id
    String Name; // Team name
    int Goals; // Team Goals
    int GoalsDif; // Team Goal difference

    public TeamManager(int id, String Name, int Goals, int GoalsDif ) {
        this.id = id;
        this.Name = Name;
        this.Goals = Goals;
        this.GoalsDif = GoalsDif;}
   
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setId(int id) {
        this.id = id;
    }
public void setGoals(int Goals){
    this.Goals = Goals;
   
}

public void setGoalsDif(int GoalsDif){
    this.GoalsDif = GoalsDif;
}
 

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getGoals() {
        return Goals;
    }

    public int getGoalsDif() {
        return GoalsDif;
    }

}
