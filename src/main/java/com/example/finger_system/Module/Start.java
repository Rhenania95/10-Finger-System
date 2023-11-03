package com.example.finger_system.Module;

public class Start {
    public static void main(String[] args) {
        //Wir erzeugen einen neuen Thread, der parallel zum main abläuft.
        //Multithreads multi = new Multithreads();
        Thread modul = new Thread(new Runnable() {
        @Override
            public void run() {
            Uebung u = new Uebung(2, 2, "QWERTZ");
            System.out.println(u.getAufgabe());
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        });

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int sec = 15;
                sec *= 1000;
                try {
                    Thread.sleep(sec);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        modul.start();
        timer.start();
        while (timer.isAlive());
        modul.stop();
        System.out.println("Ende");
    }
}
