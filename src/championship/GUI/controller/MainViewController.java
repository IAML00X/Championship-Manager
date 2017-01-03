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
    private TableView<?> mainTblVw;
    @FXML
    private Button viewMatchesButton;
    @FXML
    private Button finalResultsButton;
    @FXML
    private Button groupResultsButton;
    @FXML
    private Button addMatchResultButton;
    @FXML
    private Button teamResultsButton;
    @FXML
    private TableColumn<Team, String> colGroup;
    @FXML
    private TableColumn<Team, String> colTeam;
    @FXML
    private TableColumn<Team, Integer> colPoints;
    
    private TeamModel teammodel;
    
    ObservableList<Team> teams = FXCollections.observableArrayList();
    
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        colGroup.setCellValueFactory(
                new PropertyValueFactory("group"));
        colTeam.setCellValueFactory(
                new PropertyValueFactory("team"));
        colPoints.setCellValueFactory(
                new PropertyValueFactory("points"));
        
        //mainTblVw.getItems().setAll(mainTblVw);
   
    }
    
    
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
     * closes the application. 
     * @param event 
     */
    @FXML
    public void closeApp(ActionEvent event) {
        Platform.exit();
    }

}
