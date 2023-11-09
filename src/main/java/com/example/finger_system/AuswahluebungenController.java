package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.stage.Stage;
public class AuswahluebungenController extends Programmstart {
    private Stage stage;
    private Scene sceneHautpmenu;
    private Scene sceneTimerauswahl;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneHautpmenu(Scene sceneHautpmenu) {
        this.sceneHautpmenu = sceneHautpmenu;
    }
    public void setSceneTimerauswahl(Scene sceneTimerauswahl) {
        this.sceneTimerauswahl = sceneTimerauswahl;}

    @FXML
    private void Starthauptmenu(ActionEvent event) throws IOException {
        stage.setScene(sceneHautpmenu);
    }
    private void setUebung(int level, int stufe) {
        timerauswahlController.setLevel(level);
        timerauswahlController.setStufe(stufe);
        uebungsmodusController.setLevel(level);
        uebungsmodusController.setStufe(stufe);
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void startLernen1(ActionEvent event) throws IOException {
        setUebung(1,1);
    }
    @FXML
    public void startLernen2(ActionEvent event) throws IOException {
        setUebung(2,1);
    }
    @FXML
    public void startLernen3(ActionEvent event) throws IOException {
        setUebung(3,1);
    }
    @FXML
    public void startLernen4(ActionEvent event) throws IOException {
        setUebung(4,1);
    }
    @FXML
    public void startLernen5(ActionEvent event) throws IOException {
        setUebung(5,1);
    }
    @FXML
    public void startLernen6(ActionEvent event) throws IOException {
        setUebung(6,1);
    }
    @FXML
    public void startLernen7(ActionEvent event) throws IOException {
        setUebung(7,1);
    }
    @FXML
    public void startLernen8(ActionEvent event) throws IOException {
        setUebung(8,1);
    }
    @FXML
    public void startLernen9(ActionEvent event) throws IOException {
        setUebung(9,1);
    }
    @FXML
    public void startLernen10(ActionEvent event) throws IOException {
        setUebung(10,1);
    }
    @FXML
    public void Starttrainieren1(ActionEvent event) throws IOException {
        setUebung(1,2);
    }
    @FXML
    public void Starttrainieren2(ActionEvent event) throws IOException {
        setUebung(2,2);
    }
    @FXML
    public void Starttrainieren3(ActionEvent event) throws IOException {
        setUebung(3,2);
    }
    @FXML
    public void Starttrainieren4(ActionEvent event) throws IOException {
        setUebung(4,2);
    }
    @FXML
    public void Starttrainieren5(ActionEvent event) throws IOException {
        setUebung(5,2);
    }
    @FXML
    public void Starttrainieren6(ActionEvent event) throws IOException {
        setUebung(6,2);
    }
    @FXML
    public void Starttrainieren7(ActionEvent event) throws IOException {
        setUebung(7,2);
    }
    @FXML
    public void Starttrainieren8(ActionEvent event) throws IOException {
        setUebung(8,2);
    }
    @FXML
    public void Starttrainieren9(ActionEvent event) throws IOException {
        setUebung(9,2);
    }
    @FXML
    public void Starttrainieren10(ActionEvent event) throws IOException {
        setUebung(10,2);
    }
}