package com.example.finger_system;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Programmstart extends Application {
    private HauptmenuController hauptmenuController;
    private AuswahluebungenController auswahluebungenController;
    private TimerauswahlController timerauswahlController;
    private UebungsmodusController uebungsmodusController;
    private ResultatfensterController resultatfensterController;
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader hauptmenuLoader = new FXMLLoader(getClass().getResource("hauptmenu.fxml"));
            Parent rootHauptmenu = hauptmenuLoader.load();
            hauptmenuController = (HauptmenuController) hauptmenuLoader.getController();
            Scene sceneHauptmenu = new Scene(rootHauptmenu, 1280, 726);

            FXMLLoader auswahluebungenLoader = new FXMLLoader(getClass().getResource("uebungauswahl.fxml"));
            Parent rootAuswahluebungen = auswahluebungenLoader.load();
            auswahluebungenController = (AuswahluebungenController) auswahluebungenLoader.getController();
            Scene sceneAuswahluebungen = new Scene(rootAuswahluebungen, 1280, 726);

            FXMLLoader timerauswahlLoader = new FXMLLoader(getClass().getResource("timereinstellen.fxml"));
            Parent rootTimerauswahl = timerauswahlLoader.load();
            timerauswahlController = (TimerauswahlController) timerauswahlLoader.getController();
            Scene sceneTimerauswahl = new Scene(rootTimerauswahl, 1280, 726);

            FXMLLoader uebungsmodusLoader = new FXMLLoader(getClass().getResource("uebungsmodus_view.fxml"));
            Parent rootUebungsmodus = uebungsmodusLoader.load();
            uebungsmodusController = (UebungsmodusController) uebungsmodusLoader.getController();
            Scene sceneUebungsmodus = new Scene(rootUebungsmodus, 1280, 726);

            FXMLLoader resultatfensterloader = new FXMLLoader(getClass().getResource("Resultatfenster.fxml"));
            Parent rootResultatfenster = resultatfensterloader.load();
            resultatfensterController = (ResultatfensterController) resultatfensterloader.getController();
            Scene sceneResultatfenster = new Scene(rootResultatfenster, 1280, 726);

            hauptmenuController.setStage(stage);
            hauptmenuController.setSceneAuswahluebungen(sceneAuswahluebungen);

            auswahluebungenController.setStage(stage);
            auswahluebungenController.setSceneHautpmenu(sceneHauptmenu);
            auswahluebungenController.setSceneTimerauswahl(sceneTimerauswahl);

            timerauswahlController.setStage(stage);
            timerauswahlController.setSceneAuswahluebungen(sceneAuswahluebungen);
            timerauswahlController.setSceneUebungsmodus(sceneUebungsmodus);

            uebungsmodusController.setStage(stage);
            uebungsmodusController.setSceneResultatfenster(sceneResultatfenster);

            resultatfensterController.setStage(stage);
            resultatfensterController.setSceneHauptmenu(sceneHauptmenu);

            sceneUebungsmodus.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (!timerauswahlController.uebungsmodus.isActive()) {
                        timerauswahlController.uebungsmodus.start();
                        uebungsmodusController.setTextausgabe("","",timerauswahlController.uebungsmodus.getAufgabe(),true);
                    }else {
                        timerauswahlController.uebungsmodus.keyPressed((event.getText().charAt(0)));
                        if (timerauswahlController.uebungsmodus.keyPressedCheck()) {
                            timerauswahlController.uebungsmodus.next();
                            uebungsmodusController.setTextausgabe(timerauswahlController.uebungsmodus.getCharsTyped(), "" + timerauswahlController.uebungsmodus.getCurrentCharRequired(), timerauswahlController.uebungsmodus.getCharsLeft(), true);
                        } else {
                            uebungsmodusController.setTextausgabe(timerauswahlController.uebungsmodus.getCharsTyped(), "" + timerauswahlController.uebungsmodus.getCurrentCharRequired(), timerauswahlController.uebungsmodus.getCharsLeft(), false);
                        }
                        uebungsmodusController.setAnschlägeAusgabe(timerauswahlController.uebungsmodus.getKeyPressCount());
                        uebungsmodusController.setFehlerAusgabe(timerauswahlController.uebungsmodus.getWrongKeyPressedCount());
                    }
                }
            });

            stage.setScene(sceneHauptmenu);
            stage.setTitle("Tipp dich fitt");
            stage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}