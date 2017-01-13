/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/*s
 ss
 * @author robiesun
 */
public class Team
{

    private int id, point, goals, goalsLetIn, goalsDiff;
    private String name;
 

    public Team(int id, String name)
    {
        this.id = id;
        this.name = name;
        point = 0;
        goalsLetIn = 0;
        goals = 0;
        goalsDiff = 0;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getPoint()
    {
        return point;
    }

    public void setPoint(int point)
    {
        this.point = point;
    }

    public int getGoals()
    {
        return goals;
    }

    public void setGoals(int goals)
    {
        this.goals = goals;
    }

    public int getGoalsLetIn()
    {
        return goalsLetIn;
    }

    public void setGoalsLetIn(int goalsLetIn)
    {
        this.goalsLetIn = goalsLetIn;
    }

    public int getGoalsDiff()
    {
        return goalsDiff;
    }

    public void setGoalsDiff(int goalsDiff)
    {
        this.goalsDiff = goalsDiff;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name + "\t" + id + "\t" + "id";
    }

}
