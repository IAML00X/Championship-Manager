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

    private final ObservableList<Team> teams;

    private static TeamModel instance;

    private ArrayList<Team> quarterFinalTeams;

    private ArrayList<Team> semiFinalTeams;

    private ArrayList<Team> finalTeams;

    private final ObservableList<Team> groupA;
    private final ObservableList<Team> groupB;
    private final ObservableList<Team> groupC;
    private final ObservableList<Team> groupD;

    private TeamManager teammanager;

    /**
     * Constructor
     */
    private TeamModel() {
        teammanager = new TeamManager();
        teams = FXCollections.observableArrayList();
        groupA = FXCollections.observableArrayList();
        groupB = FXCollections.observableArrayList();
        groupC = FXCollections.observableArrayList();
        groupD = FXCollections.observableArrayList();
        teams.addAll(teams);

    }

    /**
     * The Singleton we use for ease of access to the model. This was a
     * breakthrough.
     *
     * @return
     */
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
        //teammanager.writeTeams(teams);
        teams.add(team);
    }

    /**
     * Returns a list of teamnames.
     *
     * @return teamName.
     */
    public ObservableList<Team> getTeams() {
        return teams;
    }

    /**
     * Sets the name of the Team.
     */
    public void setTeamNames(List<Team> teams) {
        this.teams.clear();
        this.teams.addAll(teams);
    }

    /**
     * Was meant to return a list of Teams who made it to the quarterfinals.
     *
     * @return
     */
    public ArrayList<Team> getQuarterFinalTeams() {
        return quarterFinalTeams;
    }

    /**
     * Sets the Teams who made it to the quarterfinals.
     *
     * @param quarterFinalTeams
     */
    public void setQuarterFinalTeams(ArrayList<Team> quarterFinalTeams) {
        this.quarterFinalTeams = quarterFinalTeams;
    }

    /**
     * Was meant to return a list of Teams who made it to the semifinals.
     *
     * @return
     */
    public ArrayList<Team> getSemiFinalTeams() {
        return semiFinalTeams;
    }

    /**
     * Sets the Teams who made it to the semifinals.
     *
     * @param semiFinalTeams
     */
    public void setSemiFinalTeams(ArrayList<Team> semiFinalTeams) {
        this.semiFinalTeams = semiFinalTeams;
    }

    /**
     * Was meant to return a list of Teams who made it to the finals.
     *
     * @return
     */
    public ArrayList<Team> getFinalTeams() {
        return finalTeams;
    }

    /**
     * Sets the Teams who made it to the finals.
     *
     * @param finalTeams
     */
    public void setFinalTeams(ArrayList<Team> finalTeams) {
        this.finalTeams = finalTeams;
    }

    /**
     * Returns a list of Teams in Group A.
     *
     * @return
     */
    public ObservableList<Team> getGroupA() {
        return groupA;
    }

    /**
     * Returns a list of Teams in Group B.
     *
     * @return
     */
    public ObservableList<Team> getGroupB() {
        return groupB;
    }

    /**
     * Returns a list of Teams in Group C.
     *
     * @return
     */
    public ObservableList<Team> getGroupC() {
        return groupC;
    }

    /**
     * Returns a list of Teams in Group D.
     *
     * @return
     */
    public ObservableList<Team> getGroupD() {
        return groupD;
    }

}
