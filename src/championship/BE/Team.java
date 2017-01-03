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
public class Team implements Serializable{

    private int id;
    private int points;
    private String name;
    private int goalsScored;
    private int goalsRecieved;
    private int matchesPlayed;
    
    /**
     * Contructor for Team class with the name parameter.
     * @param name 
     */
    
    public Team(String name)
    {
        this.name = name;
    }

    /**
     * All the getters and setters for the Team class.
     *
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsRecieved() {
        return goalsRecieved;
    }

    public void setGoalsRecieved(int goalsRecieved) {
        this.goalsRecieved = goalsRecieved;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

}
