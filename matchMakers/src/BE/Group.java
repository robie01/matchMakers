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
public class Group
{
   private String teamName;
   
   
   public Group(String teamName) {
       this.teamName = teamName;
   }
   
public String getTeamName()
    {
        return teamName;
    }
public void setTeamName(String name) {
        this.teamName = name;
    }
@Override
    public String toString() {
        return teamName;
    }
}
