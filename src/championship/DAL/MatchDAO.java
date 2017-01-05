/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.DAL;

import championship.BE.Match;
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
public class MatchDAO {

    /**
     * writes the data and metadata into a file that is saved in MatchFolder
     *
     * @param match
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void Serialize(Match match) throws FileNotFoundException, IOException {
        try (FileOutputStream fos = new FileOutputStream("src/championship/MatchFolder/" + match.getId())) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(match);
        }
    }

    /**
     * unwraps the files in MatchFolder, if there are any, otherwise it gives an
     * empty list then it adds them to the list and then returns the list
     *
     * @return matchList
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public List<Match> deserialize() throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Match> matchList = new ArrayList<>();
        File folder = new File("src/MatchFolder");
        if (folder.listFiles() == null) {
            return matchList;
        }
        for (File f : folder.listFiles()) {
            try (FileInputStream fis = new FileInputStream(f)) {
                ObjectInputStream ois = new ObjectInputStream(fis);
                Match match = (Match) ois.readObject();
                matchList.add(match);
            }
        }
        return matchList;
    }
}
