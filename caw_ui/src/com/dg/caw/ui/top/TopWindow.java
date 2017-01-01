package com.dg.caw.ui.top;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by timotej on 12/27/16.
 */
public class TopWindow extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("top.fxml"));
        primaryStage.setTitle("Cellular Automata Workbench");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}
