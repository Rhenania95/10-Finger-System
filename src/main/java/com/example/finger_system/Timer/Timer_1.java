package com.example.finger_system.Timer;

import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//main
public class Timer_1 extends Application {

    int del = 0;

    public void start(Stage st) {
        UIinitialisation(st);
    }

    private void UIinitialisation(Stage st) {

        HBox hb = new HBox(12);
        hb.setPadding(new Insets(12));
        Timer tm = new java.util.Timer();
        Spinner sp = new Spinner(1, 120, 5);
        sp.setPrefWidth(85);
        Button b = new Button(" Set Timer");
        b.setOnAction(event -> {
            del = (int) sp.getValue();
            tm.schedule(new subtimer(), del * 60 * 1000);
        });
        hb.getChildren().addAll(b, sp);
        st.setOnCloseRequest(event -> {
            tm.cancel();
        });

        Scene sc = new Scene(hb);
        st.setTitle("Timer Working");
        hb.setStyle("-fx-border-width: 2;-fx-border-color: #0051ff;");
        st.setScene(sc);
        st.show();
    }

    private class subtimer extends TimerTask {

        @Override
        public void run() {
            Platform.runLater(() -> {
                Alert al = new Alert(Alert.AlertType.INFORMATION);
                al.setTitle("10 Finger-System");
                al.setHeaderText("Time Over");
                String c;
                if (del == 1) {
                    c = "1 min elapsed";
                } else {
                    c = String.format("%d sec elapsed",
                            del);
                }
                al.setContentText(c);
                al.showAndWait();
            });
        }
    }

    //main method
    public static void main(String[] args) {
        //launch the app
        launch(args);
    }
}
