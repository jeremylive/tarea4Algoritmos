package tarea1_analisis_de_algoritmos;

import java.awt.EventQueue;
import java.awt.Graphics;

public class Main {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Programa frame = new Programa();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    
}
