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
    int zeiteiner = 0; //1s
    int zeitzener = 0; //10s
    int zeitminuten = 0; //60s = 1 min
    private int fontSize = 50;
    int level = AuswahluebungenController.uebergabe[0];
    int stufe = AuswahluebungenController.uebergabe[1];
    private Timeline timeline = new Timeline();
    private String zeit;
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
        }
        if (n == 420) {
            label.setText("snoop dog");
        }
        else {
            label.setText(String.valueOf(n));
        }
    }
    public void setAnschlägeAusgabe(int n) {
        easteregg(anschlägeAusgabe, n);
    }
    public void setFehlerAusgabe(int n) {
        easteregg(fehlerAusgabe, n);
    }
    private String fehlerQuote(){
        int keyPressedCount = timerauswahlController.uebungsmodus.getKeyPressCount();
        int wrongKeyPressedCount = timerauswahlController.uebungsmodus.getWrongKeyPressedCount();
        if((keyPressedCount == 0)||(wrongKeyPressedCount == 0)){
            return "0%";
        }else {
            int fehlerquote = (wrongKeyPressedCount*100)/keyPressedCount;
            return String.valueOf(fehlerquote);
        }
    }
    private String zeichenQuote(){
        int keyPressedCount = timerauswahlController.uebungsmodus.getKeyPressCount();
        long time = (zeitminuten*60+zeitzener+zeiteiner)/60;

        if (time == 0){
            return "0";
        }else {
            long zeichenquote = (keyPressedCount)/time;
            return String.valueOf(zeichenquote);
        }
    }
    private void reset(){
        resultatfensterController.setZeichenausgabeText(String.valueOf(timerauswahlController.uebungsmodus.getKeyPressCount()));
        resultatfensterController.setFehlerausgabeText(String.valueOf(timerauswahlController.uebungsmodus.getWrongKeyPressedCount()));
        resultatfensterController.setÜbungsdauerText(zeit);
        resultatfensterController.setFehlerquoteText(fehlerQuote());
        resultatfensterController.setZeichenprominuteText(zeichenQuote());

        TextFlow textFlowPane = new TextFlow();
        Text restartText = new Text("Tastendruck startet die Übung");
        restartText.setFill(Color.BLACK);
        restartText.setFont(Font.font(fontSize));
        textFlowPane.getChildren().add(restartText);
        textAusgabe.setGraphic(textFlowPane);
        fehlerAusgabe.setText("0");
        anschlägeAusgabe.setText("0");
        timeline.stop();
        timeline.getKeyFrames().clear();
        zeiteiner = 0;
        zeitzener = 0;
        zeitminuten = 0;
        zeitausgabe.setText("0:00");

        stage.setScene(sceneResultatfenster);
    }
    @FXML
    public void abbruchbutton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Wirklich abbrechen?");
        alert.setHeaderText("Wollen Sie die Übung wirklich abbrechen?");
        timeline.pause();
        alert.showAndWait();
        if (alert.getResult().getText().equals("OK")) {
            reset();
        }
        if (alert.getResult().getText().equals("Abbrechen")) {
            alert.close();
            timeline.play();
        }
    }
    @Override
    public void start(Stage stage) {
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
                    reset();
                }
                zeit = String.valueOf(zeitminuten) + ":" + String.valueOf(zeitzener) + String.valueOf(zeiteiner);
                zeitausgabe.setText(zeit);
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