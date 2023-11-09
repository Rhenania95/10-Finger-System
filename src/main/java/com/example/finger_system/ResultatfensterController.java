package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ResultatfensterController {
    private Stage stage;
    private Scene sceneHauptmenu;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneHauptmenu(Scene sceneHauptmenu) {
        this.sceneHauptmenu = sceneHauptmenu;
    }
    @FXML
    public void StartHauptmenu(ActionEvent event) throws IOException {
        stage.setScene(sceneHauptmenu);
    }
}
