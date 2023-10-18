package com.example.finger_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;

public class Programmstart extends Application {
    private static String textInputFileName = "text_input.txt";
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Programmstart.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        //create file to write the text input.
        try {
            File file = new File(textInputFileName);
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //launch();
    }
}