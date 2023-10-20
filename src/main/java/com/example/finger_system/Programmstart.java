package com.example.finger_system;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
public class Programmstart extends Application {
    private static String textInput = "";
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Programmstart.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

            @Override
            public void handle(KeyEvent event) {
                textInput += event.getCode().getChar();
                System.out.print(event.getCode().getChar());
            }
        });
    }


    public static void main(String[] args) {
        launch();
    }
}