package com.example.finger_system.Module;

public abstract class Modul {
    private int Level;

    private int Stufe;

    private String Tastatur;

    private String Tasten;

    /* Die Funktion gibt ein Set von Tasten zurück, aus dem die Übung zusammengestellt wird.
       Als Parameter werden das Level und die Tastatur eingegeben.
     */
    public abstract void Buchstabenset();

    public abstract int getLevel();

    public abstract void setLevel(int Level);

    public abstract int getStufe();

    public abstract void setStufe(int Stufe);

    public abstract String getTastatur();

    public abstract void setTastatur(String Tastatur);
    public abstract void setTasten();
}