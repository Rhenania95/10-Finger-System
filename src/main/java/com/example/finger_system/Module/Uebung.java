package com.example.finger_system.Module;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Uebung extends Modul {

    /* Jede Übung besitzt ein Level, dass unterscheidet, welche Tasten in der Übung verwendet werden.
    *  Rückgabe mittels getLevel().
    *  Seten mittels setLevel().
     */
    private int Level;


    /* Je nach Tastatur unterschiedet sich die Verteilung der Buchstaben auf der Tastatut.
    *  Das Attrbut dient zur Unterscheidung der verschiedenen Tastaturen.
    *  Unterschiedliche Tastaturen haben jeweils anders aufgebaute Levels.
    *  Rückgabe mittels getTastatur().
    *  Setzen mittels setTastatur().
    *
    * Implementierte Tastaturen:
    *  "QWERTZ" für QWERTZ Tastatur
    *
     */
    private String Tastatur;

    /* Der String enthält die Tasten für die Übung.
    *  Wird im Konstruktor mit der Methode Buchstabenset() anhand der Attribute Level, Stufe und Tastatur erstellt.
    *  Rückgabe mittels getTasten().
    *  Setzen mittels setTasten().
    *  Ausgabe mittels prtTasten().
     */
    private String Tasten = null;

    /* Es werden 2 Stufen unterschieden:
     * Stufe 1: Der Benutzer lernt neue Buchstaben kennen. Deshalb besteht die Übung lediglich aus den neu dazugelernten Buchstaben.
     * Stufe 2: Der Benutzer übt die bereits gelernten Buchstaben. Die Übung besteht aus allen bisher gelernten Buchstaben.
     * Rückgabe mittels getStufe().
     * Setzen mittels setStufe().
     */
    private int Stufe;

    /* Die Aufgabe wird auf dem Bildschirm dargestellt und soll abgetippt werden.
    *  Rückgabe mittels getAufgabe().
    *  Setzen mittels setAufgabe().
     */
    private String aufgabe = "";

    /*
     * Konstruktor für die Klasse Uebung.
     * Parameter: Level, Stufe, Tastatur
     */
    public Uebung(int Level, int Stufe, String Tastatur) {
        setLevel(Level);
        setStufe(Stufe);
        setTastatur(Tastatur);
        setTasten();
        setAufgabe();
    }


    /*
     * Die Methode öffnet eine Text-Datei in Abhängigkeit der gewählten Tastatur.
     * Aus der Datei wird ein Set von Tasten entspechend dem Level ausgelesen.
     */
    public void Buchstabenset() {
        String filePath = null;

        if (Tastatur.equals("QWERTZ")) {
            filePath = "src/main/java/com/example/finger_system/Module/QWERTZ.txt";
        }/*
        else if(Tastatur.equals("QWERTY")) {
            filePath = "src/main/java/com/example/finger_system/Module/QWERTY.txt";
        }
        else if (Tastatur.equals()  {
            filePath = "src/main/java/com/example/finger_system/Module/_______.txt";
        }*/

        File file = new File(filePath);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line = reader.readLine();
            //Einlesen der Datei bis zum n-ten Level
            for (int i = 0; (i < Level) && (line != null); i++) {
                String[] buffer = line.split(" ");
                //Bei Stufe 2 werden die vorherigen Levels in Tasten zusammengefasst
                if (Stufe == 2) {
                    if (Tasten == null) {
                        Tasten = buffer[buffer.length - 1];
                    } else {
                        Tasten += buffer[buffer.length - 1];
                    }
                }
                //Bei Stufe 1 wird nur das letzte Level in Tasten  gespeichert
                else {
                    Tasten = buffer[buffer.length - 1];
                }
                line = reader.readLine();
            }


        } catch (
                FileNotFoundException e) {
            System.out.println(filePath + " nicht gefunden");
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

    //Die Methode gibt das Level der Übung zurück.
    public int getLevel() {
        return Level;
    }


    //Die Methode setzt das Level der Übung.
    public void setLevel(int Level) {
        this.Level = Level;
    }

    //Die Methode gibt die Stufe der Übung zurück.
    public int getStufe() {
        return Stufe;
    }

    //Die Methode setzt die Stufe der Übung.
    public void setStufe(int Stufe) {
        this.Stufe = Stufe;
    }

    //Die Methode gibt die Tastatur der Übung zurück.
    @Override
    public String getTastatur() {
        return Tastatur;
    }

    //Die Methode setzt die Tastatur der Übung.
    public void setTastatur(String Tastatur) {
        this.Tastatur = Tastatur;
    }


    //Die Methode gibt das Set von Tasten zurück, aus dem die Übung zusammengestellt wird.
    public String getTasten() {
        return Tasten;
    }

    /*
     *   Die Methode gibt ein Set von Tasten zurück, aus dem die Übung zusammengestellt wird.
     */
    public void setTasten() {
        Buchstabenset();
    }

    //Die Methode gibt die Tasten der Übung über die Konsole aus.
    public void prtTasten() {
        System.out.println(Tasten);
    }

    //Die Methode erstellt eine Aufgabe durch zufälliges Verwenden der Set-Methoden.
    private void setAufgabe() {
        while(aufgabe.length() < 30)    {
            /*
            switch((int) (Math.random() * 4)) {
                case 0:
                    einerSet();
                    break;
                case 1:
                    doppelSet();
                    break;
                case 2:
                    tripleSet();
                    break;
                case 3:
                */
                    zufallsSet();
                  /*
                  break;
            }
            */
            if(aufgabe.length() < 30) {
                aufgabe += " ";
            }
        }

    }

    //Die Methode gibt die Aufgabe der Übung zurück.
    public String getAufgabe() {
        return aufgabe;
    }

    //Die Methode fügt der Aufgabe dreimal einen einzelnen Buchstaben zu.
    private void einerSet()   {
        int j = (int) (Math.random() * Tasten.length());
        for(int i = 0; i < 3; i++){
            aufgabe += Tasten.charAt(j);
        }
    }

    //Die Methode fügt der Aufgabe dreimal ein Zweierset des Buchstabens zu.
    private void doppelSet() {
        int j = (int) (Math.random() * Tasten.length());
        for(int i = 0; i < 3; i++){
            aufgabe += Tasten.charAt(j) + Tasten.charAt(j);
        }
    }

    //Die Methode fügt der Aufgabe dreimal ein Dreierset des Buchstabens zu.
    private void tripleSet() {
        int j = (int) (Math.random() * Tasten.length());
        for(int i = 0; i < 3; i++){
            aufgabe += Tasten.charAt(j) + Tasten.charAt(j) + Tasten.charAt(j);
        }
    }

    //Die Methode fügt der Aufgabe 10 zufällige Buchstaben aus den Tasten zu.
    private void zufallsSet()   {
        int j;
        for(int i = 0; i < 10; i++){
            j = (int) (Math.random() * Tasten.length());
            aufgabe += Tasten.charAt(j);
        }
    }

}