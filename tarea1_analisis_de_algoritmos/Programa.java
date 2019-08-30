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
    private ArrayList<TipoFigura> matriz = new ArrayList<>();
    private ArrayList<TipoFigura> lista_final_lamina = new ArrayList<>();
    private int totales_finales_lamina = 0;
    private int diametro = 0;
    private int total_id = 0;
    private boolean bandera = true;
    
    /*
        Empieza programa con la clase main
    */
    Programa() 
    {
        //Pido datos
        String cadena=JOptionPane.showInputDialog("Digite su diametro del tablero");
        JOptionPane.showMessageDialog(null, cadena);
        setDiametro(convertIntoInt(cadena));
        
        //Evaluo que solo lados pares entran
        while(getDiametro()%2 != 0)
        {
            //hago la salida del programa y vuelvo a preguntar de nuevo
            cadena=JOptionPane.showInputDialog("Digite su diametro del tablero");
            JOptionPane.showMessageDialog(null, cadena);       
        }
        
        //Inicio programa
        crearTablero(getDiametro());
        
        //Obtengo los puntos en la diagonal
        obtPuntosDiagonales();
        
        imprimir();    
        
        obtPuntosDiagonales();
        
        //Empieza para organizar de una vez el crear una figura o mejor dicho
        //un tipo de figura de tal forma que se eleve de vuelta a el mundo visto
        //en todo momento dentro del codigo.
        crearTipoFigura();
        
        //
        

    }

    /*
     ..
    */
 
    /*
        Al crear el tipo de figura, me base en la clase TipoFigura
    */
    private void crearTipoFigura()
    {
        //se hace modulo 10
        //totales_finales_lamina %= 10;
        
        //Creo lamina con su indice y largo y ancho
        //Comienzo creando desde la esquina izquierda superior
        while(bandera)
        {
            //El marcado de ids son las cuales se entran para encontrar despues
            //si no o si si, por lo que el id empieza desde 0
            
            //TipoFigura t_figura = new TipoFigura(0, getDiametro(), getDiametro());
        }
        
        //
        
        
    }
    
    /*
        Funcion para obtener los puntos de una matriz de una diagonal que cae
        Obtengo las coordenadas x y y de donde se encuentran los puntos
    */
    private ArrayList<List> obtPuntosDiagonales()
    {
        int largo_matriz = matriz.size();
        ArrayList<List> puntos_diagonal = new ArrayList<>();
        int contador = 0;    
        
        
        //obtengo variable de los x y y de donde estan ubicado
        
        
        for (int i = 0; i < largo_matriz; i++) {
            for (int j = 0; j < largo_matriz; j++) {
                
                //duda, como obtengo los puntos en corrida secuencial?
                if(j==puntos_diagonal.get(contador).getY()){
                    //Se corre una fila para abajo
                    i++;
                }
                
                if(i==puntos_diagonal.get(contador).getX()){
                    i++;
                    j=0;                    
                }
                //Hacer pruebas
            }
        }
        System.out.println("Se obtuvieron puntos");
        return puntos_diagonal;
    }
    
    
    
    /*
        Se inicializa el tablero donde se coloca las posiciones 
        de las figuras. 
    */
    private void crearTablero(int diametro)
    {
        //Inicializo tablero con x de lado y ancho
        Tablero tablero = new Tablero(diametro);
        
        
        for(int i=0; getMatriz().size() > i; i++)
        {
            for(int j=0; getMatriz().size() > j; j++)
            {
                //Cajita figura = new Cajita(i, j, 0);
                TipoFigura figura = new TipoFigura(0, i, j);//logica para poner 
                //ids de forma que identifique el espacio que corresponde(HASH)
                
                
                setMatriz(figura);
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

    /*
        Metodo para representar el modo de hacer los cortes de la lamina
    */
    private void doItCut()
    {
        System.out.println("Se hace el corte en la lamina");
         }
    
    /*
        msj
    */
    private void imprimir()
    {
        System.out.println("Tarea de Analisis de Algoritmos de tal forma"
                + "         que toma el tiempo estimado en el que se resuelve"
                + "         el ejercicio, se obtiene el area sobrante del "
                + "         tablero para obtener el tiempo mas minimo.");
    }

    /*
        Gets y Sets
    */
    
    public ArrayList<TipoFigura> getMatriz() {
        return matriz;
    }

    public void setMatriz(TipoFigura p_matriz) {
        this.matriz.add(p_matriz);
    }

    public ArrayList<TipoFigura> getLista_final_lamina() {
        return lista_final_lamina;
    }

    public void setLista_final_lamina(ArrayList<TipoFigura> lista_final_lamina) {
        this.lista_final_lamina = lista_final_lamina;
    }

    public int getTotales_finales_lamina() {
        return totales_finales_lamina;
    }

    public void setTotales_finales_lamina(int totales_finales_lamina) {
        this.totales_finales_lamina = totales_finales_lamina;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getTotal_id() {
        return total_id;
    }

    public void setTotal_id(int total_id) {
        this.total_id = total_id;
    }

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }
    
}
