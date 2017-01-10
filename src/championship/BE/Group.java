/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BE;

import java.util.ArrayList;

/**
 *
 * @author IAMLUX
 */
public class Group {

    private final String groupName;

    private ArrayList<Team> groupTeams;

    private ArrayList<Match> groupMatches;
    
    private int teamsInGroup;
    private int[] homeTeams1;
    private int[] awayTeams1;
    private int[] homeTeams2;
    private int[] awayTeams2;
    private int currentRound;
    
    
  

    /**
     * Construct a group for the matchups
     *
     * @param groupName
     * @param groupTeams
     */
    public Group(String groupName, ArrayList<Team> groupTeams) {
        this.groupName = groupName;
        this.groupTeams = groupTeams;
        groupMatches = new ArrayList<>();
    }
    public String getGroupName() {
        return groupName;
    }
    
    public ArrayList<Team> getGroupTeams() {
        return groupTeams;
    }
    
    public ArrayList<Match> getGroupMatches() {
        return groupMatches;
    }

    public int getTeamsInGroup() {
        return teamsInGroup;
    }

    public int[] getHomeTeams1() {
        return homeTeams1;
    }

    public int[] getAwayTeams1() {
        return awayTeams1;
    }

    public int[] getHomeTeams2() {
        return homeTeams2;
    }

    public int[] getAwayTeams2() {
        return awayTeams2;
    }

    public int getCurrentRound() {
        return currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }
    
}
