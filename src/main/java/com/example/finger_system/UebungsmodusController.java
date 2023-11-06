package com.example.finger_system;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.util.Duration;
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
    @FXML
    private Label zeitausgabe;
    int zeiteiner = 0;
    int zeitzener = 0;
    int zeitminuten = 0;
    private int fontSize = 50;
    int level = AuswahluebungenController.uebergabe[0];
    int stufe = AuswahluebungenController.uebergabe[1];


    public void setStage(Stage stage) {
        this.stage = stage;
        uebungNummer.setText(String.valueOf(level));
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
        start(stage);
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
    @Override
    public void start(Stage stage) {
        // Erstelle eine neue Timeline
        Timeline timeline = new Timeline();

        // Setze die Dauer zwischen den Aktionen
        Duration duration = Duration.seconds(1);

        // Füge einen KeyFrame zur Timeline hinzu, der die Aktion definiert
        KeyFrame keyFrame = new KeyFrame(duration, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                zeiteiner++;
                if (zeiteiner == 10){
                    zeiteiner = 0;
                    zeitzener++;
                }
                if (zeitzener == 6){
                    zeitzener = 0;
                    zeitminuten++;
                }
                if (zeitminuten == TimerauswahlController.dauer){
                    timeline.stop();
                    stage.setScene(sceneResultatfenster);
                    fehlerAusgabe.setText("0");
                    anschlägeAusgabe.setText("0");
                    zeitausgabe.setText("0:00");
                }
                String ausgabe = String.valueOf(zeitminuten) + ":" + String.valueOf(zeitzener) + String.valueOf(zeiteiner);
                zeitausgabe.setText(ausgabe);
            }
        });
        // Füge den KeyFrame zur Timeline hinzu
        timeline.getKeyFrames().add(keyFrame);

        // Setze die Anzahl der Wiederholungen (hier unendlich)
        timeline.setCycleCount(Timeline.INDEFINITE);

        // Starte die Timeline
        timeline.play();
}
}
