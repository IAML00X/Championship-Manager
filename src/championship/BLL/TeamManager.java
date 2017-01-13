/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BLL;

import championship.BE.Team;
import championship.GUI.model.TeamModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author IAMLUX
 */
public class TeamManager {

//    TeamDAO teamData = new TeamDAO();
//    
//    /**
//     * logic part of the serialize function, calls it from the DAL when it, itself is called from the GUI
//     * @param name
//     * @return team
//     * @throws IOException 
//     */
    public Team Team(String name, int points, int goalsScored, int goalsRecieved, int matchesPlayed, int wins, int draws, int losses) throws IOException {
        Team team = new Team(name, points, goalsScored, goalsRecieved, matchesPlayed, wins, draws, losses);
//        tDAO.Serialize(team);
        return team;
    }

    /**
     * This will sort teams randomly into 4 groups.
     *
     * @param teams
     */
    public void createGroups(ArrayList<Team> teams) {
        Collections.shuffle(teams);
        TeamModel tm = TeamModel.getInstance();
        int count = 0;
        for (Team team : tm.getTeams()) {
            if (count == 0) {
                tm.getGroupA().add(team);
            } else if (count == 1) {
                tm.getGroupB().add(team);
            } else if (count == 2) {
                tm.getGroupC().add(team);
            } else if (count == 3) {
                tm.getGroupD().add(team);
                count = -1;
            }
            count++;

        }
    }

//    public List<Team> getAll() {
//        return teamData.readObjData("save.ser");
//    }
//
//    public void writeTeams(List<Team> teams) {
//        teamData.writeObjData(teams, "save.ser");
}
//    
//    /**
//     * logic part of the deserialize function, calls it from the DAL when it, itself is called from the GUI
//     * gets a singular team
//     * @param name
//     * @return team
//     * @throws IOException
//     * @throws FileNotFoundException
//     * @throws ClassNotFoundException 
//     */
//    public Team GetTeam(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
//        List<Team> teamList = tDAO.deserialize();
//        for (Team team : teamList) {
//            if (team.getName() == name) {
//                return team;
//            }
//        }
//        return null;
//    }
//    
//    /**
//     * logic part of the deserialize function, calls it from the DAL when it, itself is called from the GUI
//     * gets every team currently serialized
//     * @return team
//     * @throws IOException
//     * @throws FileNotFoundException
//     * @throws ClassNotFoundException 
//     */
//    public List<Team> GetAllTeams() throws IOException, FileNotFoundException, ClassNotFoundException {
//        return tDAO.deserialize();
//    }

