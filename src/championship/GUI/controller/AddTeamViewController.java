/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.controller;

import championship.BE.Team;
import championship.BLL.TeamManager;
import championship.GUI.model.TeamModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class AddTeamViewController implements Initializable {

    @FXML
    private Button saveButton;
    @FXML
    private Button cancelButton;
    @FXML
    private TextField teamNameLb;
    @FXML
    private AnchorPane root;

    private TeamManager teammanager;
    private TeamModel teammodel;

    public AddTeamViewController() {
        teammanager = new TeamManager();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * when the Add Team button is pressed, the method checks if there is
     * anything in the text field, and if there is, it calls the AddTeam from
     * the TeamManager so that the team gets serialized after that it closes the
     * addTeamView
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void addTeam(ActionEvent event) throws IOException {
        if (!teamNameLb.getText().isEmpty()) {
            TeamModel tm = TeamModel.getInstance();
            Team team = new Team(teamNameLb.getText(), "", 0);
            tm.addTeam(team);
            teammanager.writeTeams(tm.getTeams());
            Stage stage = (Stage) cancelButton.getScene().getWindow();
            stage.close();
        }
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

}
