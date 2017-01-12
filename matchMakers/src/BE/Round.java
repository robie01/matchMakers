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
public class Round
{
    private Match match1, match2;
    
    public Round(Match match1, Match match2 ) {
        this.match1 = match1;
        this.match2 = match2;
        
    }

    public Match getMatch1()
    {
        return match1;
    }

    public void setMatch1(Match match1)
    {
        this.match1 = match1;
    }

    public Match getMatch2()
    {
        return match2;
    }

    public void setMatch2(Match match2)
    {
        this.match2 = match2;
    }
    
    
   
    
    
}
