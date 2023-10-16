module com.example.finger_system {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.finger_system to javafx.fxml;
    exports com.example.finger_system;
}