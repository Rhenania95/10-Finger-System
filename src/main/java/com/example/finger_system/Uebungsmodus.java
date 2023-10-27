package com.example.finger_system;


import com.example.finger_system.Module.Uebung;

public class Uebungsmodus {
    private char currentCharTyped;
    private char currentCharRequired;
    private int keyPressCount = 0;
    private int wrongKeyPressedCount = 0;
    private long timeElapsed;
    private long startTime;
    private boolean active;
    private String aufgabe;
    private int aufgabeLength;
    private int count = 0;


    public Uebungsmodus(int stufe, int level, String Tastatur) {
        Uebung uebung = new Uebung(stufe, level, Tastatur);
        aufgabe = uebung.getAufgabe();
        aufgabeLength = aufgabe.length();
    }
    public boolean isActive() {
        return active;
    }
    public long getTimeElapsed() {
        return timeElapsed;
    }
    public long getTime() {
        return System.nanoTime() - startTime;
    }

    public void start() {
        this.active = true;
        startTime = System.nanoTime();
    }
    public boolean next() {
        count++;
        if (count < aufgabeLength) {
            currentCharRequired = aufgabe.charAt(count);
            return true;
        }else{
            return false;
        }
    }
    public void keyPressed(char currentCharTyped) {
        this.currentCharTyped = currentCharTyped;
        keyPressCount++;
    }
    public boolean keyPressedCheck() {
        if(currentCharTyped != currentCharRequired) {
            wrongKeyPressedCount++;
            return false;
        }
        return true;
    }
    public void stop() {
        this.active = false;
        timeElapsed = System.nanoTime() - startTime;
    }
    public void wrongKeyPressed() {
        //print error
    }

    public int getKeyPressCount() {
        return keyPressCount;
    }

    public int getWrongKeyPressedCount() {
        return wrongKeyPressedCount;
    }
}
