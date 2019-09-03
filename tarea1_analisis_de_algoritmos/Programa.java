package tarea1_analisis_de_algoritmos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;


public class Programa
{
    //Variable globales
    private ArrayList<TipoFigura> matriz = new ArrayList<>();
    private ArrayList<TipoFigura> lista_final_lamina = new ArrayList<>();
    private ArrayList<List> puntos_diagonal = new ArrayList<>();
    private int totales_finales_lamina = 0;
    private int diametro = 0;
    private int total_id = 0;
    private int largo_matriz = 0;
    private int contador = 0;  
    private boolean bandera = true;
    private Lamina lamina = new Lamina();
    private String list_tipo = "";
    private int canti1, canti2, canti3 = 0;
    private int[] list_cant = {};
    
    /*
        Empieza programa con la clase main
    */
    Programa() 
    {
        String cadena, cant1, cant2, cant3 = "";
        Random random = new Random(2);
        
        do {
            cadena=JOptionPane.showInputDialog("Digite su diametro de la lamina");
            setDiametro(convertIntoInt(cadena)); 
            JOptionPane.showMessageDialog(null, "Info: tipo de figura nxm. tipo1 4x4, tipo2 8x8, tipo3 32x32");
            cant1=JOptionPane.showInputDialog("Digite cuantas figutas quiere del tipo 1");
            cant2=JOptionPane.showInputDialog("Digite cuantas figutas quiere del tipo 2");
            cant3=JOptionPane.showInputDialog("Digite cuantas figutas quiere del tipo 3");
        }while(getDiametro()%2 != 0);
        canti1 = convertIntoInt(cant1);
        canti2 = convertIntoInt(cant2);
        canti3 = convertIntoInt(cant3);
        list_cant[0] = canti1;
        list_cant[1] = canti2;
        list_cant[2] = canti3;

        crearTablero(getDiametro());

        while(canti1 != 0 & canti2 != 0 && canti3 != 0)
        {
            
        }
        
        if(canti3 == 0)
        {
            if(canti2 == 0)
            {
                if(canti1 == 0)
                {

                }
            }
        }
        
        if(canti2 == 0)
        {
            if(canti1 == 0)
            {
                
            }
        }


        //obtPuntosDiagonales();
        //crearTipoFigura();
    }
    
    /*
        Funcion que recorta las cantidades para ir acorde con lo que pidio el cliente
    */
    
    /*
        Funcion
    */
    

    /*
     Funcion que coloca las figuras dentro de la lamina
    */
    private void recorteLamina()
    {
        
    }
        
    /*
        Al crear el tipo de figura, me base en la clase TipoFigura
    */
    private void crearTipoFigura()
    {
        //Creo lamina con su indice y largo y ancho
        //Comienzo creando desde la esquina izquierda superior
        //puede tener varias formas distintas
        while(bandera)
        {
            //El marcado de ids son las cuales se entran para encontrar despues
            //si no o si si, por lo que el id empieza desde 0
            
            //TipoFigura t_figura = new TipoFigura(0, getDiametro(), getDiametro());
        }
        
        //
        int punto_diagonal = 0;
        
        for (int i = 0; i < largo_matriz; i++) 
        {
            if(i<punto_diagonal)
            {
                for (int j = 0; j < largo_matriz; j++) 
                {
                    //como saber dodne parar
                    if(j==puntos_diagonal.get(contador).getY()){
                        //Se corre una fila para abajo
                        i++;
                        
                        //creo Figura con las dimenciones obtenidas
                    }

                    if(i==puntos_diagonal.get(contador).getX()){
                        i++;
                        j=0;                    
                    }
                    //Hacer pruebas
                }
            }
        }
        
    }
    
    /*
        Funcion para obtener los puntos de una matriz de una diagonal que cae
        Obtengo las coordenadas x y y de donde se encuentran los puntos
    */
    private ArrayList<List> obtPuntosDiagonales()
    {
        puntos_diagonal = new ArrayList<>();
        largo_matriz = matriz.size();
        contador = 0;    
                
        for (int i = 0; i < largo_matriz; i++) 
        {
            for (int j = 0; j < largo_matriz; j++) 
            {
                if(j==puntos_diagonal.get(contador).getY()){
                    i++;
                }
                
                if(i==puntos_diagonal.get(contador).getX()){
                    i++;
                    j=0;                    
                }
            }
        }
        return puntos_diagonal;
    }
    
    /*
        Maximo comun divisor
    */
    public static int MCD(int A,int B)
    {
        int Dividendo;
        int Divisor;
        int Resto;

        
        System.out.println("Introduce el valor de A y B");
        if(A > B)
            {
                Dividendo = A;
                Divisor = B;
            }
        else
            {
                Dividendo = B;
                Divisor = A;
            }
        Resto = Dividendo  %  Divisor;
        do
            {
                Dividendo = Divisor;
                Divisor = Resto;
                Resto = Dividendo  %  Divisor;
            }
        while (Resto!= 0);

        System.out.println("El MCD de A y B es" +Divisor);
        
        return Divisor;

    }
    
    
    /*
        Se inicializa el tablero donde se coloca las posiciones 
        de las figuras. 
    */
    private void crearTablero(int diametro)
    {
        for(int i=0; diametro > i; i++)
        {
            for(int j=0; diametro > j; j++)
            {
                TipoFigura tipoFigura = new TipoFigura(0, i, j);                    
                setMatriz(tipoFigura);
            }
        }
        Lamina p_lamina = new Lamina(getMatriz());
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

    public ArrayList<List> getPuntos_diagonal() {
        return puntos_diagonal;
    }

    public void setPuntos_diagonal(ArrayList<List> puntos_diagonal) {
        this.puntos_diagonal = puntos_diagonal;
    }

    public int getLargo_matriz() {
        return largo_matriz;
    }

    public void setLargo_matriz(int largo_matriz) {
        this.largo_matriz = largo_matriz;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }


    public Lamina getLamina() {
        return lamina;
    }

    public void setLamina(Lamina lamina) {
        this.lamina = lamina;
    }
    
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
