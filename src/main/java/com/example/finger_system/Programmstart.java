package com.example.finger_system;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

public class Programmstart extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hauptmenu-view.fxml"));
            Scene hauptmenu = new Scene(root);
            stage.setTitle("Zehnfinger tipp übungs züg");
            stage.setScene(hauptmenu);
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        launch();
    }
}