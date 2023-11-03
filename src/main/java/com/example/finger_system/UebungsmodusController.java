package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class UebungsmodusController extends Programmstart {
    private Stage stage;
    private Scene sceneAuswahluebungen;

    @FXML
    private Label textausgabe;
    @FXML
    private Label anschläge;
    @FXML
    private Label levelx;
    @FXML
    private Label fehler;
    @FXML
    private Label zeit;
    @FXML
    private Label übung;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneAuswahluebungen(Scene sceneAuswahluebungen) {
        this.sceneAuswahluebungen = sceneAuswahluebungen;
    }
    public void setTextausgabe(String text) {
        textausgabe.setText(text);
    }
    @FXML
    public void abbruchbutton(ActionEvent event) throws IOException {
        stage.setScene(sceneAuswahluebungen);
    }
    @FXML
    public void refresh(ActionEvent event) throws IOException {
        String text = "testtext";
        String nummer= "Übung 1";
        int mistake = 3;
        int clicks = 100;
        int time = 10;
        String levels = "Einsteiger";
        String stufe = "Alles";
        setTextausgabe(Character.toString(uebungsmodus.getCurrentCharRequired()));
        übung.setText(nummer);
        anschläge.setText(String.valueOf(mistake));
        levelx.setText(levels);
        fehler.setText(String.valueOf(clicks));
        zeit.setText(String.valueOf(time));
    }
}
