package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HauptmenuController extends Parent {
    private Stage stage;
    private Scene sceneAuswahluebungen;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneAuswahluebungen(Scene sceneAuswahluebungen) {
        this.sceneAuswahluebungen = sceneAuswahluebungen;
    }
    @FXML
    public void AuswahluebungenStart(ActionEvent event) throws IOException {
        stage.setScene(sceneAuswahluebungen);
    }
}
