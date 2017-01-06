/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BE;

import java.io.Serializable;

/**
 *
 * @author IAMLUX
 */
public class Match implements Serializable{

    private int id;
    private int homeTeamScore;
    private int guestTeamScore;
    private boolean wasPlayed;

    /**
     * constructor for the Match class with the id parameter
     * @param id 
     */
    public Match(int id, int homeTeamScore, int guestTeamScore){
        this.id = id;
        this.homeTeamScore = homeTeamScore;
        this.guestTeamScore = guestTeamScore;
    }
    
    /**
     * All the getters and setters for the Match class.
     *
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getGuestTeamScore() {
        return guestTeamScore;
    }

    public void setGuestTeamScore(int guestTeamScore) {
        this.guestTeamScore = guestTeamScore;
    }

    public boolean wasPlayed() {
        return wasPlayed;
    }
}
