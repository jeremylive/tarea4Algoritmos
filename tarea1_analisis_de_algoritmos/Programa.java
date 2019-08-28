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
    
    ArrayList<Cajita> matriz = new ArrayList<Cajita>();
    int totales_finales_lamina = 0;
    List<integer> lista_final_lamina = new ArrayList<Integer>();
    
    public void main(String[] args) {
        String cadena=JOptionPane.showInputDialog("Digite su diametro del tablero");
        JOptionPane.showMessageDialog(null, cadena);
        int diametro = convertIntoInt(cadena);
        
        if(diametro%2 != 1){
            
        }
        
        crearTablero(diametro);
        
    }
    
    private void crearTipoFigura()
    {
        //se hace modulo 10
        totales_finales_centrales %= 10;
        
        //inserto
        
    }
    
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
     
    private int convertIntoInt(String param)
    {
        return Integer.parseInt(param);
    }

}
