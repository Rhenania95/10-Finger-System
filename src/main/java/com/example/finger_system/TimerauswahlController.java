package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class TimerauswahlController{
    private Stage stage;
    private Scene sceneUebungsmodus;
    private Scene sceneAuswahluebungen;
    protected Uebungsmodus uebungsmodus;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneAuswahluebungen(Scene sceneAuswahluebungen) {this.sceneAuswahluebungen = sceneAuswahluebungen;}
    public void setSceneUebungsmodus(Scene sceneUebungsmodus) {this.sceneUebungsmodus = sceneUebungsmodus;}
    public void loadUebungsmodus(ActionEvent event) throws IOException {
        level = AuswahluebungenController.uebergabe[0];
        stufe = AuswahluebungenController.uebergabe[1];
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        stage.setScene(sceneUebungsmodus);
    }
    @FXML
    private Label falscheEingabe;
    @FXML
    private TextField textfeld;
    public static int dauer;
    public static int level;
    public static int stufe;
    public void timereingabeprüfen(ActionEvent event) throws IOException{
        try {
            dauer = Integer.parseInt(textfeld.getText());
            loadUebungsmodus(event);
        } catch (NumberFormatException e) {
            falscheEingabe.setText("!!Es können nur ganze Zahlen eingegeben werden!!");
        }
    }
    public void timereingabeabbrechen(ActionEvent event) throws IOException {
        stage.setScene(sceneAuswahluebungen);
    }
}