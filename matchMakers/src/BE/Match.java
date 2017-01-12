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
private String hTeamName, aTeamName;

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


    public String gethTeamName() {
        return hTeamName;
    }

    public void sethTeamName(String hTeamName) {
        this.hTeamName = hTeamName;
    }

    public String getaTeamName() {
        return aTeamName;
    }

    public void setaTeamName(String aTeamName) {
        this.aTeamName = aTeamName;
    }

@Override
    public String toString(){
        return "HomeTeam:" + homeTeam + "AwayTeam" + awayTeam +"/t"+ matchID; 
       
    }
    
    
    
    
}
