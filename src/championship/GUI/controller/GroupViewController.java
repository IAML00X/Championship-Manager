/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.controller;

import championship.BE.Team;
import championship.GUI.model.TeamModel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class GroupViewController implements Initializable {

    @FXML
    private TableColumn<Team, String> teamA;
    @FXML
    private TableColumn<Team, Integer> wonA;
    @FXML
    private TableColumn<Team, Integer> drawA;
    @FXML
    private TableColumn<Team, Integer> lostA;
    @FXML
    private TableColumn<Team, Integer> pointsA;
    
    @FXML
    private TableColumn<Team, String> teamB;
    @FXML
    private TableColumn<Team, Integer> wonB;
    @FXML
    private TableColumn<Team, Integer> drawB;
    @FXML
    private TableColumn<Team, Integer> lostB;
    @FXML
    private TableColumn<Team, Integer> pointsB;
    
    @FXML
    private TableColumn<Team, String> teamC;
    @FXML
    private TableColumn<Team, Integer> wonC;
    @FXML
    private TableColumn<Team, Integer> drawC;
    @FXML
    private TableColumn<Team, Integer> lostC;
    @FXML
    private TableColumn<Team, Integer> pointsC;
    
    @FXML
    private TableColumn<Team, String> teamD;
    @FXML
    private TableColumn<Team, Integer> wonD;
    @FXML
    private TableColumn<Team, Integer> drawD;
    @FXML
    private TableColumn<Team, Integer> lostD;
    @FXML
    private TableColumn<Team, Integer> pointsD;
    
    @FXML
    private TableView<Team> groupATbl;
    @FXML
    private TableView<Team> groupBTbl;
    @FXML
    private TableView<Team> groupCTbl;
    @FXML
    private TableView<Team> groupDTbl;
    @FXML
    private Button closeButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        
        TeamModel tm = TeamModel.getInstance();
        groupATbl.setItems(tm.getGroupA());
        groupBTbl.setItems(tm.getGroupB());
        groupCTbl.setItems(tm.getGroupC());
        groupDTbl.setItems(tm.getGroupD());
    }
    
    
    
    

    /**
     * Closes the window when you press the cancel button.
     *
     * @param event
     */
    @FXML
    public void closeButtonAction(ActionEvent event) 
    {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }


}
