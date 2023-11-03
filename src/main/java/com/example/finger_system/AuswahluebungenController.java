package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import java.io.IOException;

import javafx.stage.Stage;

public class AuswahluebungenController extends Programmstart{
    private Stage stage;
    private Scene sceneUebungsmodus;
    private Scene sceneHautpmenu;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneUebungsmodus(Scene sceneUebungsmodus) {
        this.sceneUebungsmodus = sceneUebungsmodus;
    }
    public void setSceneHautpmenu(Scene sceneHautpmenu) {
        this.sceneHautpmenu = sceneHautpmenu;
    }
    private void loadUebungsmodus(int level, int stufe, ActionEvent event) throws IOException {
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        stage.setScene(sceneUebungsmodus);
    }
    @FXML
    public void hauptmenu(ActionEvent event) throws IOException {
        stage.setScene(sceneHautpmenu);
    }
    @FXML
    public void alles1(ActionEvent event) throws IOException {
        loadUebungsmodus(1, 1, event);
    }
    @FXML
    public void alles2(ActionEvent event) throws IOException {
        loadUebungsmodus(2, 1, event);
    }
    @FXML
    public void alles3(ActionEvent event) throws IOException {
        loadUebungsmodus(3, 1, event);
    }
    @FXML
    public void alles4(ActionEvent event) throws IOException {
        loadUebungsmodus(4, 1, event);
    }
    @FXML
    public void alles5(ActionEvent event) throws IOException {
        loadUebungsmodus(5, 1, event);
    }
    @FXML
    public void alles6(ActionEvent event) throws IOException {
        loadUebungsmodus(6, 1, event);
    }
    @FXML
    public void alles7(ActionEvent event) throws IOException {
        loadUebungsmodus(7, 1, event);
    }
    @FXML
    public void alles8(ActionEvent event) throws IOException {
        loadUebungsmodus(8, 1, event);
    }
    @FXML
    public void alles9(ActionEvent event) throws IOException {
        loadUebungsmodus(9, 1, event);
    }
    @FXML
    public void alles10(ActionEvent event) throws IOException {
        loadUebungsmodus(10, 1, event);
    }
    @FXML
    public void neu1(ActionEvent event) throws IOException {
        loadUebungsmodus(2, 1, event);
    }
    @FXML
    public void neu2(ActionEvent event) throws IOException {
        loadUebungsmodus(2, 2, event);
    }
    @FXML
    public void neu3(ActionEvent event) throws IOException {
        loadUebungsmodus(3, 2, event);
    }
    @FXML
    public void neu4(ActionEvent event) throws IOException {
        loadUebungsmodus(4, 2, event);
    }
    @FXML
    public void neu5(ActionEvent event) throws IOException {
        loadUebungsmodus(5, 2, event);
    }
    @FXML
    public void neu6(ActionEvent event) throws IOException {
        loadUebungsmodus(6, 2, event);
    }
    @FXML
    public void neu7(ActionEvent event) throws IOException {
        loadUebungsmodus(7, 2, event);
    }
    @FXML
    public void neu8(ActionEvent event) throws IOException {
        loadUebungsmodus(8, 2, event);
    }
    @FXML
    public void neu9(ActionEvent event) throws IOException {
        loadUebungsmodus(9, 2, event);
    }
    @FXML
    public void neu10(ActionEvent event) throws IOException {
        loadUebungsmodus(10, 2, event);
    }
}