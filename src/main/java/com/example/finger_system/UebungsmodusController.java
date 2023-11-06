package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class UebungsmodusController extends Programmstart {
    private Stage stage;
    private Scene sceneResultatfenster;
    @FXML
    private Label textausgabe;
    @FXML
    private Label uebungNummer;
    @FXML
    private Label Stufe;
    @FXML
    private Label fehler;
    @FXML
    private Label zeit;
    @FXML
    private Label übung;
    int level = AuswahluebungenController.uebergabe[0];
    int stufe = AuswahluebungenController.uebergabe[1];
    public void setStage(Stage stage) {
        this.stage = stage;
        uebungNummer.setText(String.valueOf(level));
        System.out.println(AuswahluebungenController.uebergabe[0]);
        System.out.println(AuswahluebungenController.uebergabe[1]);
        if (stufe == 1) {
            Stufe.setText("lernen");
        }
        if (stufe == 2){
            Stufe.setText("trainieren");
        }

    }
    public void setSceneResultatfenster(Scene sceneResultatfenster) {
        this.sceneResultatfenster = sceneResultatfenster;
    }
    public void setTextausgabe(String text) {
        textausgabe.setText(text);
    }
    @FXML
    public void abbruchbutton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Wirklich abbrechen?");
        alert.setHeaderText("Wollen Sie die Übung wirklich abbrechen?");
        alert.showAndWait();
        if (alert.getResult().getText().equals("OK")) {
            stage.setScene(sceneResultatfenster);
        }
        if (alert.getResult().getText().equals("Abbrechen")) {
            alert.close();
        }
    }
}
