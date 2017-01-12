/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BE;

import java.util.ArrayList;
import javafx.collections.ObservableList;

/**
 *
 * @author IAMLUX
 */
public class Group {

    private final String groupName;

    private ArrayList<Team> groupTeams;

    private int teamsInGroup;
    private int[] homeTeams1;
    private int[] awayTeams1;
    private int[] homeTeams2;
    private int[] awayTeams2;
    private int currentRound;
    private ObservableList<Team> teams;
    private String name;

    public Group(String groupName, int teams) {
        this.currentRound = 1;
        this.groupName = groupName;
        this.teamsInGroup = teams;
        groupPlay(teamsInGroup);
    }

    /**
     * Construct a group for the matchups
     *
     * @param groupName
     * @param groupTeams
     */
    public Group(String groupName, ArrayList<Team> groupTeams) {
        this.currentRound = 1;
        this.groupName = groupName;
        this.groupTeams = groupTeams;
        this.teamsInGroup = groupTeams.size();
        groupPlay(teamsInGroup);
    }

    /**
     * Either group of 3 or group of 4 has to work or the program won't work and
     * the user gets an ERROR.
     *
     * @param teams
     */
    public void groupPlay(int teams) {
        switch (teams) {
            case 3:
                groupOf3();
                break;
            case 4:
                groupOf4();
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    /**
     * Group of 3 where every team must team eachother twice.
     */
    private void groupOf3() {
        homeTeams1 = new int[]{
            1, 2, 1, 3, 2, 3
        };
        awayTeams1 = new int[]{
            2, 1, 3, 1, 3, 2
        };
    }

    /**
     * Group of 4 where every team must team eachother twice.
     */
    private void groupOf4() {
        homeTeams1 = new int[]{
            1, 4, 2, 3, 4, 3
        };
        awayTeams1 = new int[]{
            1, 2, 2, 3, 4, 1
        };
        homeTeams2 = new int[]{
            1, 3, 2, 3, 4, 2
        };
        awayTeams2 = new int[]{
            2, 1, 2, 3, 2, 4
        };

    }

    /**
     * Getters for groupname, groupteams, teamsingroup, hometeams1,
     * awayteams1,hometeams2, awayteams2 and currentround. Setter for
     * currentround.
     *
     * @return
     */
    public String getGroupName() {
        return groupName;
    }

    public ArrayList<Team> getGroupTeams() {
        return groupTeams;
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
