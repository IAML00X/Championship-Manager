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

/**
 * FXML Controller class
 *
 * @author MissJ
 */
public class GroupViewController implements Initializable {

    @FXML
    private TableColumn<?, ?> teamA;
    @FXML
    private TableColumn<?, ?> wonA;
    @FXML
    private TableColumn<?, ?> drawA;
    @FXML
    private TableColumn<?, ?> lostA;
    @FXML
    private TableColumn<?, ?> pointsA;
    @FXML
    private Button closeButton;
    @FXML
    private TableColumn<?, ?> teamB;
    @FXML
    private TableColumn<?, ?> wonB;
    @FXML
    private TableColumn<?, ?> drawB;
    @FXML
    private TableColumn<?, ?> lostB;
    @FXML
    private TableColumn<?, ?> pointsB;
    @FXML
    private TableColumn<?, ?> teamC;
    @FXML
    private TableColumn<?, ?> wonC;
    @FXML
    private TableColumn<?, ?> drawC;
    @FXML
    private TableColumn<?, ?> lostC;
    @FXML
    private TableColumn<?, ?> pointsC;
    @FXML
    private TableColumn<?, ?> teamD;
    @FXML
    private TableColumn<?, ?> wonD;
    @FXML
    private TableColumn<?, ?> drawD;
    @FXML
    private TableColumn<?, ?> lostD;
    @FXML
    private TableColumn<?, ?> pointsD;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void closeButtonAction(ActionEvent event) {
    }
    
}
