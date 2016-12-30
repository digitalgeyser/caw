package com.dg.caw.ui.top;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.InputEvent;

public class MenuController {

    @FXML
    private  void handleAbout(ActionEvent event) {

    }

    @FXML
    private void handleKeyInput(InputEvent event) {

    }

    @FXML
    private void handleExit(ActionEvent event) {
        Platform.exit();
    }
}
