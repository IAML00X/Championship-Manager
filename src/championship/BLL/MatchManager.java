/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.BLL;

import java.util.Random;

/**
 *
 * @author IAMLUX
 */
public class MatchManager {
    
    
        /**
     * This randomize which group each team gets. ??
     * @param args 
     */
    public static void main(String[]args){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int value = 12 + random.nextInt(3);
            System.out.println(value);
    
        }
    }
      

//    MatchDAO mDAO = new MatchDAO();
//    
//    /**
//     * logic part of the serialize function, calls it from the DAL when it, itself is called from the GUI
//     * @param id
//     * @return match
//     * @throws IOException 
//     */
//    public Match AddMatch(int id, int homeTeamScore, int guestTeamScore) throws IOException {
//        Match match = new Match(id, homeTeamScore, guestTeamScore);
//        mDAO.Serialize(match);
//        return match;
//    }
//    
//    /**
//     * logic part of the deserialize function, calls it from the DAL when it, itself is called from the GUI
//     * gets a singular match
//     * @param id
//     * @return match
//     * @throws IOException
//     * @throws FileNotFoundException
//     * @throws ClassNotFoundException 
//     */
//    public Match GetMatch(int id) throws IOException, FileNotFoundException, ClassNotFoundException {
//        List<Match> matchList = mDAO.deserialize();
//        for (Match match : matchList) {
//            if (match.getId() == id) {
//                return match;
//            }
//        }
//        return null;
//    }
//    
//    /**
//     * logic part of the deserialize function, calls it from the DAL when it, itself is called from the GUI
//     * gets every match currently serialized
//     * @return match
//     * @throws IOException
//     * @throws FileNotFoundException
//     * @throws ClassNotFoundException 
//     */
//    public List<Match> GetAllMatches() throws IOException, FileNotFoundException, ClassNotFoundException {
//        return mDAO.deserialize();
//    }
}
