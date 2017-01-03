/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.model;

import championship.BE.Team;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author IAMLUX
 */
public class TeamModel {
    
    private ArrayList<Team> teams;
    private ObservableList<String> teamName;
    /**
     * Constructor
     */
    private TeamModel(){
        this.teamName = FXCollections.observableArrayList();
        teams = new ArrayList<>();
    }
    /**
     * Lets you add a team.
     * @param name 
     */
    public void addTeam(String name){
        Team team = new Team(name);
        teams.add(team);
        setTeamNames();
    }
    /**
     * Returns a list of teamnames.
     * @return 
     */
    public ObservableList<String> getTeamNames()
    {
        return teamName;
    }
    /**
     * Sets the name of the Team, loop for forced update.
     */
    private void setTeamNames() {
        teamName.clear();
        for (Team team : teams)
        {
            teamName.add(team.getName());
        }
    }

}
