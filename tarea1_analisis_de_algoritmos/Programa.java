package tarea1_analisis_de_algoritmos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Programa 
{
    
    ArrayList matriz = new ArrayList();
    
    public void main(String[] args) {
        String cadena=JOptionPane.showInputDialog("Digite su diametro del tablero");
        JOptionPane.showMessageDialog(null, cadena);
        int diametro = convertIntoInt(cadena);
        crearTablero(diametro);
        
    }
    private void crearTablero(int diametro)
    {
        
    }
     
    private int convertIntoInt(String param)
    {
        return Integer.parseInt(param);
    }

}
