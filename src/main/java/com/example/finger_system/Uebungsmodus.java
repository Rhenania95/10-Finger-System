package com.example.finger_system;


import com.example.finger_system.Module.Uebung;

public class Uebungsmodus {
    private char currentCharTyped;
    private char currentCharRequired;
    private int keyPressCount = 0;
    private int wrongKeyPressedCount = 0;
    private boolean active = false;
    private String aufgabe;
    private int aufgabeLength;
    private int count = 0;
    public Uebungsmodus(int level, int stufe, String Tastatur) {
        Uebung uebung = new Uebung(level, stufe, Tastatur);
        aufgabe = uebung.getAufgabe();
        aufgabeLength = aufgabe.length();
        currentCharRequired = aufgabe.charAt(0);
    }
    public boolean isActive() {
        return active;
    }
    public void start() {
        this.active = true;
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
    }
    public void wrongKeyPressed() {
        //print error
    }
    public char getCurrentCharRequired() {
        return currentCharRequired;
    }
    public String getAufgabe() {
        return aufgabe;
    }
    public int getKeyPressCount() {
        return keyPressCount;
    }
    public int getWrongKeyPressedCount() {
        return wrongKeyPressedCount;
    }
}