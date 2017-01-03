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
    
    public void addTeam(String name){
        Team team = new Team(name);
    }

}
