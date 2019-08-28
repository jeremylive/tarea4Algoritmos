package tarea1_analisis_de_algoritmos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Programa
{
    //Variable globales
    ArrayList<Cajita> matriz = new ArrayList<>();
    ArrayList<Cajita> lista_final_lamina = new ArrayList<>();
    int totales_finales_lamina = lista_final_lamina.size();

    /*
        Empieza programa con la clase main
    */
    public void main(String[] args) 
    {
        //Pido datos
        String cadena=JOptionPane.showInputDialog("Digite su diametro del tablero");
        JOptionPane.showMessageDialog(null, cadena);
        int diametro = convertIntoInt(cadena);
        
        //Evaluo que solo lados pares entran
        while(diametro%2 != 0)
        {
            //hago la salida del programa y vuelvo a preguntar de nuevo
            cadena=JOptionPane.showInputDialog("Digite su diametro del tablero");
            JOptionPane.showMessageDialog(null, cadena);       
        }
        
        //Inicio programa
        crearTablero(diametro);
        
        //Continuo prorama
        crearTipoFigura();
        
        //
        
    }
    
    /*
        Al crear el tipo de figura, me base en la clase TipoFigura
    */
    private void crearTipoFigura()
    {
        //se hace modulo 10
        totales_finales_lamina %= 10;
        
        //inserto
        
    }
    
    /*
        Se inicializa el tablero donde se coloca las posiciones 
        de las figuras. 
    */
    private void crearTablero(int diametro)
    {
        for(int i=0; matriz.size() > i; i++)
        {
            for(int j=0; matriz.size() > j; j++)
            {
                Cajita figura = new Cajita(i, j, 0);
                matriz.add(figura);
            }
        }
        Lamina p_lamina = new Lamina(matriz);
    }
     
    /*
        Se crea funcion para transformas String a Integer
    */
    private int convertIntoInt(String param)
    {
        return Integer.parseInt(param);
    }

}
