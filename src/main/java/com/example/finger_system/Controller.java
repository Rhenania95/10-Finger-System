package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import java.io.IOException;
import java.util.Objects;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {
    public static int modus = 0;
    public static int level = 0;
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void uebungsmodusStart(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("auswahlübungen.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void hauptmenu(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hauptmenu-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void alles1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 1;
    }
    public void alles2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 2;
    }
    public void alles3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 3;
    }
    public void alles4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 4;
    }
    public void alles5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 5;
    }
    public void alles6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 6;
    }    public void alles7(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 7;
    }    public void alles8(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 8;
    }    public void alles9(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 1;
        level = 9;
    }
    public void alles10(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus =1;
        level = 10;
    }
    public void neu1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 2;
        level = 1;
    }
    public void neu2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 2;
        level = 2;
    }
    public void neu3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 2;
        level = 3;
    }
    public void neu4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 2;
        level = 4;
    }
    public void neu5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 2;
        level = 5;
    }
    public void neu6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 2;
        level = 6;
    }
    public void neu7(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus = 2;
        level = 7;
    }
    public void neu8(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus=2;
        level = 8;
    }
    public void neu9(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus=2;
        level = 9;
    }
    public void neu10(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        modus=2;
        level = 10;
    }





}