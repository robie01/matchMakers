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
    private String name;
    private String group;

    
    
     
    public Team(int id ,String name)
    {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) //variable inside parameter is the explicit variables.
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }
    @Override
    public String toString() {
        return name + " Id: " + id;
    }
    
    
} 