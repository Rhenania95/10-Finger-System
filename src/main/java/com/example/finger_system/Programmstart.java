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
    private UebungsmodusController uebungsmodusController;
    protected Uebungsmodus uebungsmodus;
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader hauptmenuLoader = new FXMLLoader(getClass().getResource("hauptmenu_view.fxml"));
            Parent rootHauptmenu = hauptmenuLoader.load();
            hauptmenuController = (HauptmenuController) hauptmenuLoader.getController();
            Scene sceneHauptmenu = new Scene(rootHauptmenu, 1280, 726);

            FXMLLoader auswahluebungenLoader = new FXMLLoader(getClass().getResource("auswahluebungen_view.fxml"));
            Parent rootAuswahluebungen = auswahluebungenLoader.load();
            auswahluebungenController = (AuswahluebungenController) auswahluebungenLoader.getController();
            Scene sceneAuswahluebungen = new Scene(rootAuswahluebungen, 1280, 726);

            FXMLLoader uebungsmodusLoader = new FXMLLoader(getClass().getResource("uebungsmodus_view.fxml"));
            Parent rootUebungsmodus = uebungsmodusLoader.load();
            uebungsmodusController = (UebungsmodusController) uebungsmodusLoader.getController();
            Scene sceneUebungsmodus = new Scene(rootUebungsmodus, 1280, 726);

            hauptmenuController.setStage(stage);
            hauptmenuController.setSceneAuswahluebungen(sceneAuswahluebungen);

            auswahluebungenController.setStage(stage);
            auswahluebungenController.setSceneHautpmenu(sceneHauptmenu);
            auswahluebungenController.setSceneUebungsmodus(sceneUebungsmodus);

            uebungsmodusController.setStage(stage);
            uebungsmodusController.setSceneAuswahluebungen(sceneAuswahluebungen);

            sceneUebungsmodus.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    /*
                    if (!uebungsmodus.isActive()) {
                        uebungsmodus.start();
                        uebungsmodusController.setTextausgabe(uebungsmodus.getAufgabe());
                    }
                    uebungsmodus.keyPressed((event.getCharacter()).charAt(0));
                    if(uebungsmodus.keyPressedCheck()) {
                        if(uebungsmodus.next()){
                        }else{
                            uebungsmodus.stop();
                        }
                    }
                     */
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