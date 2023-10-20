package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField textInputField;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}