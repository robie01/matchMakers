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
    private int id;
    private String tName;
    
    
     
    public Team(int id, String name)
    {
        this.id = id;
        this.tName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) //variable inside parameter is the explicit variables.
    {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String name) {
        this.tName = name;
    }

    @Override
    public String toString() {
        return id + " " + tName;
    }
    
    
} 