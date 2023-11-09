package com.example.finger_system;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammstartTest {

    @Test
    public void test () {
        Programmstart test = new Programmstart();
        int result = test.addNumber(1, 1);
        assertEquals(2, result);
    }
}