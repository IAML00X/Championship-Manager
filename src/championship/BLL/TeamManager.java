/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BLL;

import championship.BE.Team;
import championship.DAL.TeamDAO;
import java.io.IOException;

/**
 *
 * @author IAMLUX
 */
public class TeamManager {

    TeamDAO teamData = new TeamDAO();
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

