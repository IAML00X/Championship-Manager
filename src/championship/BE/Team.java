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
public class Team implements Serializable {
    
    private String name;
    private int id;
    private int points;
    private int goalsScored;
    private int goalsRecieved;
    private int matchesPlayed;
    private int wins;
    private int draws;
    private int losses;

    /**
     * Contructor for Team class with the name parameter.
     *
     * @param name
     */
    public Team(String name, int points, int goalsScored, int goalsRecieved, int matchesPlayed, int wins, int draws, int losses) {
        this.name = name;
        this.points = points;
        this.goalsScored = goalsScored;
        this.goalsRecieved = goalsRecieved;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
        this.losses = losses;
    }
    
        /**
     * All the getters and setters for the Team class.
     *
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }



}
