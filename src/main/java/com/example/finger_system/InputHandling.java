package com.example.finger_system;

public class InputHandling {
    char currentCharTyped;
    char currentCharRecuired;
    int keyPressCount = 0;
    int wrongKeyPressedCount = 0;
    public void setCurrentCharTyped(char currentCharTyped) {
        this.currentCharTyped = currentCharTyped;
    }

    public void keyPressed() {
        keyPressCount++;
        if(rightKeyPressedCheck()) {
            currentCharRecuired = getNextWrightChar();
        }else{

        }


    }

    private boolean rightKeyPressedCheck() {
        if(currentCharTyped != currentCharRecuired) {
            wrongKeyPressedCount++;
            return false;
        }
        return true;
    }
    private char getNextWrightChar(){
        return ' ';
    }
}
