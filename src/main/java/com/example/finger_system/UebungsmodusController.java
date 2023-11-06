package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;

public class UebungsmodusController extends Programmstart {
    @FXML
    private Label anschlägeAusgabe;
    @FXML
    private Label fehlerAusgabe;
    private Stage stage;
    private Scene sceneResultatfenster;
    @FXML
    private Label textAusgabe;
    @FXML
    private Label uebungNummer;
    @FXML
    private Label Stufe;
    private int fontSize = 50;
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
    @FXML
    public void setTextausgabe(String charsTyped, String currentCharRequired, String charsLeft, boolean correct) {
        TextFlow textFlowPane = new TextFlow();
        Text charsTypedText = new Text(charsTyped);
        charsTypedText.setFill(Color.GREEN);
        charsTypedText.setFont(Font.font(fontSize));
        Text currentCharRequiredText = new Text(currentCharRequired);
        if(correct){
            currentCharRequiredText.setFill(Color.BLUE);
        }else {
            currentCharRequiredText.setFill(Color.RED);
        }
        currentCharRequiredText.setFont(Font.font(fontSize));
        Text charsLeftText = new Text(charsLeft);
        charsLeftText.setFill(Color.BLACK);
        charsLeftText.setFont(Font.font(fontSize));
        textFlowPane.getChildren().addAll(charsTypedText, currentCharRequiredText, charsLeftText);
        textAusgabe.setText("");
        textAusgabe.setGraphic(textFlowPane);
    }
    private void easteregg(Label label, int n) {
        if(n==69){
            label.setText("nice");
        }else {
            label.setText(String.valueOf(n));
        }
    }
    public void setAnschlägeAusgabe(int n) {
        easteregg(anschlägeAusgabe, n);
    }
    public void setFehlerAusgabe(int n) {
        easteregg(fehlerAusgabe, n);
    }
    @FXML
    public void abbruchbutton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Wirklich abbrechen?");
        alert.setHeaderText("Wollen Sie die Übung wirklich abbrechen?");
        alert.showAndWait();
        if (alert.getResult().getText().equals("OK")) {
            TextFlow textFlowPane = new TextFlow();
            Text restartText = new Text("Tastendruck startet die Übung");
            restartText.setFill(Color.BLACK);
            restartText.setFont(Font.font(fontSize));
            textFlowPane.getChildren().add(restartText);
            textAusgabe.setGraphic(textFlowPane);
            stage.setScene(sceneResultatfenster);
            fehlerAusgabe.setText("0");
            anschlägeAusgabe.setText("0");
        }
        if (alert.getResult().getText().equals("Abbrechen")) {
            alert.close();
        }
    }
}
