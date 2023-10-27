package com.example.finger_system;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import java.io.IOException;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class Controller {
    private int stufe;
    private int level;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Uebungsmodus uebungsmodus;

    public Uebungsmodus getUebungsmodus() {
        return uebungsmodus;
    }

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
        stufe = 1;
        level = 1;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void alles2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 2;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void alles3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 3;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void alles4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 4;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void alles5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 5;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void alles6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 6;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }    public void alles7(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 7;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }    public void alles8(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 8;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }    public void alles9(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 1;
        level = 9;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void alles10(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe =1;
        level = 10;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu1(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 2;
        level = 1;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 2;
        level = 2;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 2;
        level = 3;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu4(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 2;
        level = 4;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu5(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 2;
        level = 5;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu6(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 2;
        level = 6;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu7(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe = 2;
        level = 7;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu8(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe =2;
        level = 8;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu9(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe =2;
        level = 9;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }
    public void neu10(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("uebungsmodus-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        stufe =2;
        level = 10;
        uebungsmodus = new Uebungsmodus(level, stufe, "QWERTZ");
        uebungsmodus.start();
    }





}