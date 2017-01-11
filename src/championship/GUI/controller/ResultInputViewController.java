/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class ResultInputViewController implements Initializable {

    @FXML
    private Button cancelButton;
    @FXML
    private Button saveButton;
    @FXML
    private TextField matchNrTextField;
    @FXML
    private TextField homeTeamGoalTextField;
    @FXML
    private TextField guestTeamGoalTextField;



    public ResultInputViewController() {
        
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Closes the window when you press the cancel button.
     *
     * @param event
     */
    @FXML
    public void cancelButtonAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

//    /**
//     * checks if all three fields contain text/numbers, then converts Strings to int
//     * after that it calls the serialize method through the BLL, and places the file in the given folder
//     * it then closes the window
//     * @param event
//     * @throws IOException 
//     */
//    @FXML
//    private void recordMatch(ActionEvent event) throws IOException {
//        if (!matchNrTextField.getText().isEmpty() && !homeTeamGoalTextField.getText().isEmpty() && !guestTeamGoalTextField.getText().isEmpty()) {
//            IntegerStringConverter iSC = new IntegerStringConverter();
//            String name = matchNrTextField.getText();
//            int id = 0;
//            id = iSC.fromString(name);
//            int intId = id;
//            String homeTeamGoal = homeTeamGoalTextField.getText();
//            int homeGoals = 0;
//            homeGoals = iSC.fromString(homeTeamGoal);
//            int intHomeTeamGoals = homeGoals;
//            String guestTeamGoal = guestTeamGoalTextField.getText();
//            int guestGoals = 0;
//            guestGoals = iSC.fromString(homeTeamGoal);
//            int intGuestTeamGoals = guestGoals;
//            MatchManager.AddMatch(intId, intHomeTeamGoals, intGuestTeamGoals);
//            Stage stage = (Stage) cancelButton.getScene().getWindow();
//            stage.close();
//        }
//    }

}
