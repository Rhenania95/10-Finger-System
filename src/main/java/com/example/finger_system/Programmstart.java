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
        Controller controller = new Controller();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hauptmenu-view.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Tipp dich fit");
            stage.setScene(scene);
            stage.show();

            scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
                @Override
                public void handle(KeyEvent event) {
                    if (controller.getUebungsmodus().isActive()){
                        controller.getUebungsmodus().keyPressed((event.getCharacter()).charAt(0));
                        while (!controller.getUebungsmodus().keyPressedCheck()) {
                        }
                        if(!controller.getUebungsmodus().next()){
                            controller.getUebungsmodus().stop();
                        }
                    }
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}