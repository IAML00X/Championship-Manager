/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.model;

import championship.BE.Team;
import championship.DAL.TeamDAO;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author IAMLUX
 */
public class TeamModel {
    
    private final TeamDAO teamDAO;

    private final ObservableList<Team> items;
    /**
     * Constructor
     */
    public TeamModel(){
        items = FXCollections.observableArrayList();
        teamDAO = new TeamDAO();
    }
    /**
     * Lets you add a team.
     * @param team
     *
     */
    public void addTeam(Team team){

        items.add(team);
    }
    
    public void setTeams(List<Team> teams) 
    {
        items.clear();
        items.addAll(teams);
    }
    public ObservableList<Team> getTeamName() {
        return items;
    }
    /**
     * Sets the name of the Team, loop for forced update.
     * @return 
     */
//    private void setTeamNames() {
//        teamName.clear();
//        for (Team team : teams)
//        {
//            teamName.add(team.getName());
//        }
//    }


    

}
