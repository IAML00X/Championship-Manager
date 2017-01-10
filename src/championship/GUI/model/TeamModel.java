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

    private ArrayList<Team> teams;
    private ObservableList<Team> items;
    private TeamDAO teamDAO;

    /**
     * Constructor
     */
    public TeamModel() {
        items = FXCollections.observableArrayList();
        teamDAO = new TeamDAO();
    }

    /**
     * Lets you add a team.
     *
     * @param name
     */
    public void addTeam(Team team) {
        teams.add(team);
    }

    /**
     * Returns a list of teamnames.
     *
     * @return teamName.
     */
    public ObservableList<Team> getTeamNames() {
        return items;
    }

    /**
     * Sets the name of the Team, loop for forced update.
     */
    public void setTeamNames(List<Team> teams) {
        items.clear();
        items.addAll(teams);
    }

}
