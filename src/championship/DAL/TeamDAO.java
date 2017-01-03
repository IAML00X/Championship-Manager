/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.DAL;

import championship.BE.Team;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author IAMLUX
 */
public class TeamDAO {

    /**
     * writes the data and metadata into a file that is saved in TeamFolder
     *
     * @param team
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void Serialize(Team team) throws FileNotFoundException, IOException {
        try (FileOutputStream fos = new FileOutputStream("src/TeamFolder/" + team.getName())) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(team);
        }
    }

    /**
     * unwraps the files in TeamFolder, if there are any, otherwise it gives an
     * empty list then it adds them to the list and then returns the list
     *
     * @return teamList
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public List<Team> deserialize() throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Team> teamList = new ArrayList<>();
        File folder = new File("src/TeamFolder");
        if (folder.listFiles() == null) {
            return teamList;
        }
        for (File f : folder.listFiles()) {
            try (FileInputStream fis = new FileInputStream(f)) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                Team team = (Team) ois.readObject();
                teamList.add(team);
            }
        }
        return teamList;
    }
}
