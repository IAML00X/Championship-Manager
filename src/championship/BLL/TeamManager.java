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

    TeamDAO tDAO = new TeamDAO();
//    
//    /**
//     * logic part of the serialize function, calls it from the DAL when it, itself is called from the GUI
//     * @param name
//     * @return team
//     * @throws IOException 
//     */

    public Team addTeam(String name) throws IOException {
        Team team = new Team(name);
//        tDAO.Serialize(team);
        return team;
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
}
