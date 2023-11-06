package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import java.io.IOException;
import javafx.stage.Stage;
public class AuswahluebungenController{
    private Stage stage;
    private Scene sceneUebungsmodus;
    private Scene sceneHautpmenu;
    private Scene sceneTimerauswahl;
    public static int[] uebergabe = new int[2];
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public void setSceneUebungsmodus(Scene sceneUebungsmodus) {
        this.sceneUebungsmodus = sceneUebungsmodus;
    }
    public void setSceneHautpmenu(Scene sceneHautpmenu) {
        this.sceneHautpmenu = sceneHautpmenu;
    }
    public void setSceneTimerauswahl(Scene sceneTimerauswahl) {
        this.sceneTimerauswahl = sceneTimerauswahl;}
    @FXML
    public void Starthauptmenu(ActionEvent event) throws IOException {
        stage.setScene(sceneHautpmenu);
    }
    @FXML
    public void startLernen1(ActionEvent event) throws IOException {
        uebergabe [0] = 1;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void startLernen2(ActionEvent event) throws IOException {
        uebergabe [0] = 2;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void startLernen3(ActionEvent event) throws IOException {
        uebergabe [0] = 3;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen4(ActionEvent event) throws IOException {
        uebergabe [0] = 4;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen5(ActionEvent event) throws IOException {
        uebergabe [0] = 5;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen6(ActionEvent event) throws IOException {
        uebergabe [0] = 6;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen7(ActionEvent event) throws IOException {
        uebergabe [0] = 7;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen8(ActionEvent event) throws IOException {
        uebergabe [0] = 8;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen9(ActionEvent event) throws IOException {
        uebergabe [0] = 9;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void startLernen10(ActionEvent event) throws IOException {
        uebergabe [0] = 10;
        uebergabe [1] = 1;
        stage.setScene(sceneTimerauswahl);    }
    @FXML
    public void Starttrainieren1(ActionEvent event) throws IOException {
        uebergabe [0] = 1;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren2(ActionEvent event) throws IOException {
        uebergabe [0] = 2;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);
    }
    @FXML
    public void Starttrainieren3(ActionEvent event) throws IOException {
        uebergabe [0] = 3;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren4(ActionEvent event) throws IOException {
        uebergabe [0] = 4;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren5(ActionEvent event) throws IOException {
        uebergabe [0] = 5;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren6(ActionEvent event) throws IOException {
        uebergabe [0] = 6;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren7(ActionEvent event) throws IOException {
        uebergabe [0] = 7;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren8(ActionEvent event) throws IOException {
        uebergabe [0] = 8;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren9(ActionEvent event) throws IOException {
        uebergabe [0] = 9;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }
    @FXML
    public void Starttrainieren10(ActionEvent event) throws IOException {
        uebergabe [0] = 10;
        uebergabe [1] = 2;
        stage.setScene(sceneTimerauswahl);      }

}