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
}
