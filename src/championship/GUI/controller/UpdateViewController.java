/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package championship.GUI.controller;

import championship.BE.Team;
import championship.BLL.TeamManager;
import championship.GUI.model.TeamModel;
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
public class UpdateViewController implements Initializable {

    @FXML
    private Button closeBtn;
    @FXML
    private Button saveBtn;
    @FXML
    private TextField teamNmTxt;
    
    private Team selectedTeam;
    
    TeamModel teammodel;

    private TeamManager teammanager;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    //public void Update
    
   @FXML
   public void saveTeam(ActionEvent event)
   {
    


   }
    
//    public void getTeamInfo(Team selectedTeam)
//    {
//        this.teamNmTxt.getText(selectedTeam.getName());
//    }
//    
//    public void setSelectedTeam(Team selectedTeam) 
//    {
//        this.selectedTeam = selectedTeam;
//    }
//    
//    public void setModel(TeamModel model)
//    {
//        teammodel = model;
//    }
    /**
     * Closes the window when you press the cancel button.
     *
     * @param event
     */
    public void cancelButton(ActionEvent event)
    {
        Stage stage = (Stage) closeBtn.getScene().getWindow();
        stage.close();
    }


    
}
