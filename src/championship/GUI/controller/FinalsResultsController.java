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
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class FinalsResultsController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private Button closeButton;
    @FXML
    private TableColumn<?, ?> homePlrCol;
    @FXML
    private TableColumn<?, ?> guestPlrCol;
    @FXML
    private TableColumn<?, ?> gameRstsCol;
    @FXML
    private TableColumn<?, ?> groupCol;
    @FXML
    private TableColumn<?, ?> teamCol;
    @FXML
    private TableColumn<?, ?> quarterFnlsCol;
    @FXML
    private TableColumn<?, ?> semiFnlsCol;
    @FXML
    private TableColumn<?, ?> finalsCol;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    /**
     * Closes the window when you press the close button. 
     * @param event 
     */
    @FXML
    public void closeButtonAction(ActionEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}
