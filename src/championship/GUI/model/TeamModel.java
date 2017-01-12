/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.model;

import championship.BE.Team;
import championship.BLL.TeamManager;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author IAMLUX
 */
public class TeamModel {

    private final ObservableList<Team> items;

    private static TeamModel instance;

    private ArrayList<Team> quarterFinalTeams;

    private ArrayList<Team> semiFinalTeams;

    private ArrayList<Team> finalTeams;

    public ArrayList<Team> getQuarterFinalTeams() {
        return quarterFinalTeams;
    }

    public void setQuarterFinalTeams(ArrayList<Team> quarterFinalTeams) {
        this.quarterFinalTeams = quarterFinalTeams;
    }

    public ArrayList<Team> getSemiFinalTeams() {
        return semiFinalTeams;
    }

    public void setSemiFinalTeams(ArrayList<Team> semiFinalTeams) {
        this.semiFinalTeams = semiFinalTeams;
    }

    public ArrayList<Team> getFinalTeams() {
        return finalTeams;
    }

    public void setFinalTeams(ArrayList<Team> finalTeams) {
        this.finalTeams = finalTeams;
    }

    private TeamManager teammanager;

    /**
     * Constructor
     */
    private TeamModel() {
        teammanager = new TeamManager();
        items = FXCollections.observableArrayList();
        items.addAll(items);

    }

    public static TeamModel getInstance() {
        if (instance == null) {
            instance = new TeamModel();
        }
        return instance;
    }

    /**
     * Lets you add a team.
     *
     * @param name
     */
    public void addTeam(Team team) {
        teammanager.writeTeams(items);
        items.add(team);
    }

    /**
     * Returns a list of teamnames.
     *
     * @return teamName.
     */
    public ObservableList<Team> getTeams() {
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
