package com.example.finger_system;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
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
    private int aktuellerbuchstabe;
    @FXML
    private Label textAusgabe;
    @FXML
    private Label uebungNummer;
    @FXML
    private Label Stufe;
    @FXML
    private Label zeitausgabe;
    @FXML
    private ImageView bildlvl1;
    @FXML
    private ImageView bildlvl2;
    @FXML
    private ImageView bildlvl3;
    @FXML
    private ImageView bildlvl4;
    @FXML
    private ImageView bildlvl5;
    @FXML
    private ImageView bildlvl6;
    @FXML
    private ImageView bildlvl7;
    @FXML
    private ImageView bildlvl8;
    @FXML
    private ImageView bildlvl9;
    @FXML
    private ImageView bildlvl10;
    @FXML
    private ImageView tasteeinsbild;
    @FXML
    private ImageView tastezweibild;
    @FXML
    private ImageView tastedreibild;
    @FXML
    private ImageView tastevierbild;
    @FXML
    private ImageView tastefünfbild;
    @FXML
    private ImageView tastesechsbild;
    @FXML
    private ImageView tastesiebenbild;
    @FXML
    private ImageView tasteachtbild;
    @FXML
    private ImageView tasteneunbild;
    @FXML
    private ImageView tastenullbild;
    @FXML
    private ImageView tasteqbild;
    @FXML
    private ImageView tastewbild;
    @FXML
    private ImageView tasteebild;
    @FXML
    private ImageView tasterbild;
    @FXML
    private ImageView tastetbild;
    @FXML
    private ImageView tastezbild;
    @FXML
    private ImageView tasteubild;
    @FXML
    private ImageView tasteibild;
    @FXML
    private ImageView tasteobild;
    @FXML
    private ImageView tastepbild;
    @FXML
    private ImageView tasteabild;
    @FXML
    private ImageView tastesbild;
    @FXML
    private ImageView tastedbild;
    @FXML
    private ImageView tastefbild;
    @FXML
    private ImageView tastegbild;
    @FXML
    private ImageView tastehbild;
    @FXML
    private ImageView tastejbild;
    @FXML
    private ImageView tastekbild;
    @FXML
    private ImageView tastelbild;
    @FXML
    private ImageView tasteöbild;
    @FXML
    private ImageView tasteybild;
    @FXML
    private ImageView tastexbild;
    @FXML
    private ImageView tastecbild;
    @FXML
    private ImageView tastevbild;
    @FXML
    private ImageView tastebbild;
    @FXML
    private ImageView tastenbild;
    @FXML
    private ImageView tastembild;
    @FXML
    private ImageView tastekommabild;
    @FXML
    private ImageView tastepunktbild;
    @FXML
    private ImageView tastebindestrichbild;
    @FXML
    private ImageView tasteleerschlagbild;
    int zeiteiner = 0; //1s
    int zeitzener = 0; //10s
    int zeitminuten = 0; //60s = 1 min
    private int fontSize = 50;
    int level;
    int stufe;
    private Timeline timeline = new Timeline();
    private String zeit;
    public void setStage(Stage stage) {
        this.stage = stage;
        startbild();
    }
    public void setLevelStufeText() {
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

    public void setLevel(int level) {
        this.level = level;
    }

    public void setStufe(int stufe) {
        this.stufe = stufe;
    }

    @FXML
    public void setTextausgabe(String charsTyped, String currentCharRequired, String charsLeft, boolean correct) {
        aktuellerbuchstabe = currentCharRequired.charAt(0);
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
            return "0";
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
                if (zeitminuten == timerauswahlController.getDauer()){
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
    public void startbild() {
        if (level == 1) {
            bildlvl1.setVisible(true);
        }
        if (level == 2) {
            bildlvl2.setVisible(true);
        }
        if (level == 3) {
            bildlvl3.setVisible(true);
        }
        if (level == 4) {
            bildlvl4.setVisible(true);
        }
        if (level == 5) {
            bildlvl5.setVisible(true);
        }
        if (level == 6) {
            bildlvl6.setVisible(true);
        }
        if (level == 7) {
            bildlvl7.setVisible(true);
        }
        if (level == 8) {
            bildlvl8.setVisible(true);
        }
        if (level == 9) {
            bildlvl9.setVisible(true);
        }
        if (level == 10) {
            bildlvl10.setVisible(true);
        }
    /*}
    public void uebungsbild() {
     */
        if (aktuellerbuchstabe == '1') {
            tasteeinsbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '2') {
            tastezweibild.setVisible(true);
        }
        if (aktuellerbuchstabe == '3') {
            tastedreibild.setVisible(true);
        }
        if (aktuellerbuchstabe == '4') {
            tastevierbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '5') {
            tastefünfbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '6') {
            tastesechsbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '7') {
            tastesiebenbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '8') {
            tasteachtbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '9') {
            tasteneunbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '0') {
            tastenullbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'a') {
            tasteabild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'b') {
            tastebbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'c') {
            tastecbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'd') {
            tastedbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'e') {
            tasteebild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'f') {
            tastefbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'g') {
            tastegbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'h') {
            tastehbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'i') {
            tasteibild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'j') {
            tastejbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'k') {
            tastekbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'l') {
            tastelbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'm') {
            tastembild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'n') {
            tastenbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'o') {
            tasteobild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'p') {
            tastepbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'q') {
            tasteqbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'r') {
            tasterbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 's') {
            tastesbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 't') {
            tastetbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'u') {
            tasteubild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'v') {
            tastevbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'w') {
            tastewbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'x') {
            tastexbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'y') {
            tasteybild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'z') {
            tastezbild.setVisible(true);
        }
        if (aktuellerbuchstabe == 'ö') {
            tasteöbild.setVisible(true);
        }
        if (aktuellerbuchstabe == ',') {
            tastekommabild.setVisible(true);
        }
        if (aktuellerbuchstabe == '.') {
            tastepunktbild.setVisible(true);
        }
        if (aktuellerbuchstabe == '-') {
            tastebindestrichbild.setVisible(true);
        }
        if (aktuellerbuchstabe == ' ') {
            tasteleerschlagbild.setVisible(true);
        }
    }
}