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
    public void cancelButtonAction (ActionEvent event) 
    {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    /**
     * Saves the data the user writes. 
     * @param event 
     */
    @FXML
    private void saveButtonAction(ActionEvent event) 
    {
        // saves the data the user writes 
    }
    
}
