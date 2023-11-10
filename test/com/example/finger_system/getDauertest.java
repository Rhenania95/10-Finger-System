package com.example.finger_system;

import javafx.event.ActionEvent;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class getDauertest {


    @Test
    public void test_returns_getDauer() {
        TimerauswahlController controller = new TimerauswahlController();
        controller.dauer = 10;
        int result = controller.getDauer();
        assertEquals(10, result);
    }
}