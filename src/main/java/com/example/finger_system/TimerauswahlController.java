package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class TimerauswahlController extends Programmstart {
    private Stage stage;
    private Scene sceneUebungsmodus;
    private Scene sceneAuswahluebungen;
    @FXML
    private Label falscheEingabe;
    @FXML
    private TextField textfeld;
    public int dauer;
    public int level;
    public int stufe;
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneAuswahluebungen(Scene sceneAuswahluebungen) {
        this.sceneAuswahluebungen = sceneAuswahluebungen;
    }
    public void setSceneUebungsmodus(Scene sceneUebungsmodus) {
        this.sceneUebungsmodus = sceneUebungsmodus;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void setStufe(int stufe) {
        this.stufe = stufe;
    }
    public int getDauer() {
        return dauer;
    }
    private void loadUebungsmodus(ActionEvent event) throws IOException {
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        stage.setScene(sceneUebungsmodus);
        uebungsmodusController.setLevelStufeText();
        uebungsmodusController.startbild();
    }
    @FXML
    public void timereingabeprüfen(ActionEvent event) throws IOException{
        try {
            if (Integer.parseInt(textfeld.getText()) > 0) {
                dauer = Integer.parseInt(textfeld.getText());
                loadUebungsmodus(event);
                falscheEingabe.setText(" ");
            }
            else {
                falscheEingabe.setText("!!eingegebene Zahl muss grösser als null sein!!");
            }
        } catch (NumberFormatException e) {
            falscheEingabe.setText("!!Es können nur ganze Zahlen eingegeben werden!!");
        }
    }
    @FXML
    public void timereingabeabbrechen(ActionEvent event) throws IOException {
        stage.setScene(sceneAuswahluebungen);
    }
}