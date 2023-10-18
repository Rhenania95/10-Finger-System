package com.example.finger_system;

import java.io.FileWriter;
import java.io.FileReader;

public class FileHandler {
    private FileWriter myWriter;
    private FileReader myReader;
    private final String filename;
    long caractersWritten = 0;
    public FileHandler(String filename) {
        this.filename = filename;
        try {
            myWriter = new FileWriter(filename);
        }
        catch (Exception e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            myReader = new FileReader(filename);
        }
        catch (Exception e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void write (char c) {
        try {
            myWriter.write(c);
            caractersWritten++;
        }
        catch (Exception e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void close() {
        try {
            myWriter.close();
            myReader.close();
        }
        catch (Exception e) {
            //System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public char read() {
    return ' ';
    }
}
