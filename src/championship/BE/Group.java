/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BE;

/**
 *
 * @author IAMLUX
 */

import java.util.ArrayList;

public class Group {

    private String groupName;
    private ArrayList<Team> groupTeam;
    private ArrayList<Match> groupMatches;
    
    public Group(String groupName, ArrayList<Team> groupTeam){
        this.groupName = groupName;
        this.groupTeam = groupTeam;
        groupMatches = new ArrayList<>();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ArrayList<Team> getGroupTeam() {
        return groupTeam;
    }

    public void setGroupTeam(ArrayList<Team> groupTeam) {
        this.groupTeam = groupTeam;
    }

    public ArrayList<Match> getGroupMatches() {
        return groupMatches;
    }

    public void setGroupMatches(ArrayList<Match> groupMatches) {
        this.groupMatches = groupMatches;
    }
    
    public void addGroupMatches(ArrayList<Match> newMatches){
        groupMatches.addAll(newMatches);
    }

}
