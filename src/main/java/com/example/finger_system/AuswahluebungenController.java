package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.stage.Stage;
public class AuswahluebungenController{
    private Stage stage;
    private Scene sceneHautpmenu;
    private Scene sceneTimerauswahl;
    public static int[] uebergabe = new int[2];
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneHautpmenu(Scene sceneHautpmenu) {
        this.sceneHautpmenu = sceneHautpmenu;
    }
    public void setSceneTimerauswahl(Scene sceneTimerauswahl) {
        this.sceneTimerauswahl = sceneTimerauswahl;}
    @FXML
    public void Starthauptmenu(ActionEvent event) throws IOException {
        stage.setScene(sceneHautpmenu);
    }
    private void setUebung(int[] set){
        uebergabe [0] = set[0];
        uebergabe [1] = set[0];
    }
    @FXML
    public void startLernen1(ActionEvent event) throws IOException {
        setUebung(new int[]{1,1});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void startLernen2(ActionEvent event) throws IOException {
        setUebung(new int[]{2,1});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void startLernen3(ActionEvent event) throws IOException {
        setUebung(new int[]{3,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen4(ActionEvent event) throws IOException {
        setUebung(new int[]{4,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen5(ActionEvent event) throws IOException {
        setUebung(new int[]{5,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen6(ActionEvent event) throws IOException {
        setUebung(new int[]{6,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen7(ActionEvent event) throws IOException {
        setUebung(new int[]{7,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen8(ActionEvent event) throws IOException {
        setUebung(new int[]{8,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen9(ActionEvent event) throws IOException {
        setUebung(new int[]{9,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen10(ActionEvent event) throws IOException {
        setUebung(new int[]{10,1});
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void Starttrainieren1(ActionEvent event) throws IOException {
        setUebung(new int[]{1,2});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren2(ActionEvent event) throws IOException {
        setUebung(new int[]{2,2});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren3(ActionEvent event) throws IOException {
        setUebung(new int[]{3,2});
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren4(ActionEvent event) throws IOException {
        setUebung(new int[]{4,2});
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren5(ActionEvent event) throws IOException {
        setUebung(new int[]{5,2});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren6(ActionEvent event) throws IOException {
        setUebung(new int[]{6,2});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren7(ActionEvent event) throws IOException {
        setUebung(new int[]{7,2});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren8(ActionEvent event) throws IOException {
        setUebung(new int[]{8,2});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren9(ActionEvent event) throws IOException {
        setUebung(new int[]{9,2});
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren10(ActionEvent event) throws IOException {
        setUebung(new int[]{10,2});
        stage.setScene(sceneTimerauswahl);
    }
}