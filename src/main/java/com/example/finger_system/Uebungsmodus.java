package com.example.finger_system;


import com.example.finger_system.Module.Uebung;

public class Uebungsmodus {
    private char currentCharTyped;
    private char currentCharRequired;
    private int keyPressCount = 0;
    private int wrongKeyPressedCount = 0;
    private boolean active = false;
    private String aufgabe;
    private String charsTyped = "";
    private String charsLeft;
    private int aufgabeLength;
    private int count = 0;
    private int level;
    private int stufe;
    private String Tastatur;
    public Uebungsmodus(int level, int stufe, String Tastatur) {
        this.level = level;
        this.stufe = stufe;
        this.Tastatur = Tastatur;
        Uebung uebung = new Uebung(level, stufe, Tastatur);
        aufgabe = uebung.getAufgabe();
        aufgabeLength = aufgabe.length();
        currentCharRequired = aufgabe.charAt(0);
        charsLeft = aufgabe.substring(1);
    }
    public String getCharsTyped() {
        return charsTyped;
    }
    public String getCharsLeft() {
        return charsLeft;
    }
    public boolean isActive() {
        return active;
    }
    public void start() {
        this.active = true;
    }
    public void next() {
        count++;
        if (count < aufgabeLength) {
            currentCharRequired = aufgabe.charAt(count);
            charsTyped += currentCharTyped;
            charsLeft = aufgabe.substring(count+1);
        }else{
            Uebung uebung = new Uebung(level, stufe, Tastatur);
            aufgabe = uebung.getAufgabe();
            aufgabeLength = aufgabe.length();
            currentCharRequired = aufgabe.charAt(0);
            charsTyped = "";
            charsLeft = aufgabe.substring(1);
            count = 0;
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