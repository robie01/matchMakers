/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE;

/**
 *
 * @author EdwinSilva
 */
public class Match {
    
private Team homeTeam, awayTeam;
private int homeScore, awayScore, matchID, round; 
private static final int WIN = 3, LOSE = 0, DRAW = 1;
private boolean noMatch = true;



public Match( Team homeTeam, Team awayteam, int matchID) {

    this.homeTeam = homeTeam;
    this.awayTeam = awayteam;
    this.matchID = matchID;
    
}

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }
    public Team getWinner()
    {
        if(!noMatch)
        {
            if(homeScore > awayScore)
            {
                return homeTeam;
            }
            else if(homeScore<awayScore)
            {
                return awayTeam;
                
            }
            else {
                
            }
        }
        
    
        return null;

    }
    public Team setWinner(int homeScore,int awayScore)
    {
        if(this.homeScore == this.awayScore)
        {
            
           homeScore = DRAW;
           awayScore = DRAW;
        }
        else if( this.homeScore < this.awayScore)
        {
            homeScore = LOSE;
            awayScore = WIN;
            
        }
        else if (this.homeScore > this.awayScore)
        {
            homeScore = WIN;
            awayScore = LOSE;
        }
        return null;
    }

    
@Override
    public String toString(){
        return "HomeTeam:" + homeTeam + "AwayTeam" + awayTeam +"/t"+ matchID; 
    }

   
    
    
    
}
