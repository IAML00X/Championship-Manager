/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.controller;

import championship.BE.Team;
import championship.GUI.model.TeamModel;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author IAMLUX
 */
public class MainViewController implements Initializable {

    @FXML
    private Button addTeamButton;
    @FXML
    private Button updateButton;
    @FXML
    private Button closeButton;
    @FXML
    private Button viewGroupButton;
    @FXML
    private Button viewMatchesButton;
    @FXML
    private Button addMatchResultButton;
    @FXML
    private Button finalsBttn;
    @FXML
    private TableView<Team> mainTblVw;
    @FXML
    private TableColumn<Team, String> colGroup;
    @FXML
    private TableColumn<Team, String> colName;
    @FXML
    private TableColumn<Team, Integer> colPoints;
    @FXML
    private TableColumn<Team, Integer> colWon;
    @FXML
    private TableColumn<Team, Integer> colLost;
    @FXML
    private TableColumn<Team, Integer> colDraw;
    @FXML
    private TableColumn<Team, Integer> colMtchPl;
    @FXML
    private TableColumn<Team, Integer> colGlScrd;

    ObservableList<Team> teams = FXCollections.observableArrayList();
    @FXML
    private Button startTournamentButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        colGroup.setCellValueFactory(
                new PropertyValueFactory("group"));
        colName.setCellValueFactory(
                new PropertyValueFactory("name"));
        colPoints.setCellValueFactory(
                new PropertyValueFactory("points"));
        colWon.setCellValueFactory(
                new PropertyValueFactory("wins"));
        colLost.setCellValueFactory(
                new PropertyValueFactory("losses"));
        colDraw.setCellValueFactory(
                new PropertyValueFactory("draws"));
        colMtchPl.setCellValueFactory(
                new PropertyValueFactory("matchesPlayed"));
        colGlScrd.setCellValueFactory(
                new PropertyValueFactory("goalsScored"));

        setTeams();

        teams.add(new Team("Sædding", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Sønderris", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Tjæreborg", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Bollesager", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Jerne", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Hjerting", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Rørkjær", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Kvaglund", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Sjælborg", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Ribe", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Alslev", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Tarp", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Forvrefeldt", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Spangsbjerg", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Gjesing", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Danmarksgade", 0, 0, 0, 0, 0, 0, 0));
        teams.add(new Team("Norvang", 0, 0, 0, 0, 0, 0, 0));
    }

    public void setTeams() {
        TeamModel tm = TeamModel.getInstance();
        teams = (ObservableList<Team>) tm.getTeams();
        tm.setTeamNames(teams);
        mainTblVw.setItems(tm.getTeams());
    }

    /**
     * Opens the view where the user can add a team.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void handleOnButtonActionAddTeam(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/championship/GUI/view/AddTeamView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Add A Team Window");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    /**
     * Opens the view where the user can see final results.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void buttonActionFinalResults(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/championship/GUI/view/FinalsResults.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Final Results");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    /**
     * Opens the view where the use can see the scheduling for the teams
     * matches.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void matchSchedulingButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/championship/GUI/view/MatchSchedulingView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Watch The Match Schelduling");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    /**
     * Opens the view were the user can enter match results.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void matchResultButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/championship/GUI/view/ResultInputView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Enter Match Results");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    /**
     * Opens the view where the teams can see what group they belong to.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void viewGoupButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/championship/GUI/view/GroupView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    /**
     * Opens the view where the user can edit a team name.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    public void updateButtonAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/championship/GUI/view/UpdateView.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        UpdateViewController controller = fxmlLoader.getController();
        controller.setSelectedTeam(mainTblVw.getSelectionModel().getSelectedItem());
        Stage stage = new Stage();
        stage.setTitle("");
        stage.setScene(new Scene(root1));
        stage.show();
    }

    /**
     * Closes the application.
     *
     * @param event
     */
    @FXML
    public void closeApp(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void handleStartTournamentButton(ActionEvent event) {
    }

}
