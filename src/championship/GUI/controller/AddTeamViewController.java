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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * Closes the window when you press the cancel button. 
     * @param event 
     */
    @FXML
    private void cancelButtonAction(ActionEvent event) 
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    
}