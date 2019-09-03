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
    private String list_tipo = "";
    private int[] list_cant = new int[3];
    private int[] puntos_diagonal = {};
    private int[][] espejo = {}; 
    private int totales_finales_lamina = 0;
    private int diametro = 0;
    private int total_id = 0;
    private int largo_matriz = 0;
    private int contador = 0;  
    private int canti1, canti2, canti3 = 0;
    private Random random = new Random();
    private int tipo_random = 0;
    private int x_global, y_global = 0;
    private int cont1,cont11,cont2,cont22,cont3,cont33 = 0;
    private int desecho = 0;
    private int lleva_cuenta = 0;
    /*
        Empieza programa con la clase main
    */
    Programa() 
    {
        String cadena, cant1, cant2, cant3 = "";
        
        cadena=JOptionPane.showInputDialog("Digite su diametro de la lamina");
        setDiametro(convertIntoInt(cadena)); 
        JOptionPane.showMessageDialog(null, "Info: tipo de figura nxm. tipo1 4x4, tipo2 8x8, tipo3 32x32");
        cant1=JOptionPane.showInputDialog("Digite cuantas figutas quiere del tipo 1");
        cant2=JOptionPane.showInputDialog("Digite cuantas figutas quiere del tipo 2");
        cant3=JOptionPane.showInputDialog("Digite cuantas figutas quiere del tipo 3");
        System.out.println("continue.");
        canti1 = convertIntoInt(cant1);
        canti2 = convertIntoInt(cant2);
        canti3 = convertIntoInt(cant3);
        list_cant[0] = canti1;
        list_cant[1] = canti2;
        list_cant[2] = canti3;

        
        
        while(canti1 != 0 & canti2 != 0 && canti3 != 0)
        {
            tipo_random = random.nextInt(3)+1;
            if(tipo_random != 3)
            {
                if(tipo_random != 2)
                {
                    TipoFigura nueva_figura1 = new TipoFigura(1, 2, 2);
                    
                    matriz.add(nueva_figura1);
                    matriz.get(contador).setId(1);
                    contador++;
                    canti1-=1;
                    if(contador == 1)
                    {
                        for (int i = x_global; i < x_global+2; i++) {
                            for (int j = y_global; j < y_global+2; j++) {
                                espejo[i][j] = 1;
                                if(y_global >= getDiametro())
                                {
                                    int num = y_global-getDiametro();
                                    if(num < 2){
                                        System.out.println("Se desecharon 4 cuadritos");
                                        desecho += 4;
                                    }
                                    break;
                                }
                            }
                        }
                        
                        
                    }else{
                        for (int i = x_global; i < x_global+2; i++) {
                            for (int j = y_global; j < y_global+2; j++) {
                                espejo[i][j] = 1;
                                if(y_global >= getDiametro())
                                {
                                    int num = y_global-getDiametro();
                                    if(num < 2){
                                        System.out.println("Se desecharon 4 cuadritos");
                                        desecho += 4;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    x_global += 2;
                    y_global += 2;
                }

            }
            TipoFigura nueva_figura2 = new TipoFigura(1, 4, 2);

            matriz.add(nueva_figura2);
            matriz.get(contador).setId(3);
            contador++;
            canti2-=1;
            if(contador == 1)
            {
                for (int i = x_global; i < x_global+2; i++) {
                    for (int j = y_global; j < y_global+4; j++) {
                        espejo[i][j] = 2;
                        if(y_global >= getDiametro())
                        {
                            int num = y_global-getDiametro();
                            if(num < 2){
                                System.out.println("Se desecharon 8 cuadritos");
                                desecho += 4;
                            }
                            break;
                        }
                    }
                }

            }else{
                for (int i = x_global; i < x_global+2; i++) {
                    for (int j = y_global; j < y_global+4; j++) {
                        espejo[i][j] = 2;
                        if(y_global >= getDiametro())
                        {
                            int num = y_global-getDiametro();
                            if(num < 2){
                                System.out.println("Se desecharon 8 cuadritos");
                                desecho += 4;
                            }
                            break;
                        }
                    }
                }
            }
            x_global += 2;
            y_global += 4;
        }

        TipoFigura nueva_figura3 = new TipoFigura(1, 8, 4);
       
        matriz.add(nueva_figura3);
        matriz.get(contador).setId(3);
        contador++;
        canti3-=1;
        if(contador == 1)
        {
            for (int i = x_global; i < x_global+4; i++) {
                for (int j = y_global; j < y_global+8; j++) {
                    espejo[i][j] = 3;
                    if(y_global >= getDiametro())
                    {
                        int num = y_global-getDiametro();
                        if(num < 2){
                            System.out.println("Se desecharon 8 cuadritos");
                            desecho += 8;
                        }
                        break;
                    }
                }
            }

        }else{
            for (int i = x_global; i < x_global+4; i++) {
                for (int j = y_global; j < y_global+8; j++) {
                    espejo[i][j] = 3;
                    if(y_global >= getDiametro())
                    {
                        int num = y_global-getDiametro();
                        if(num < 2){
                            System.out.println("Se desecharon 8 cuadritos");
                            desecho += 8;
                        }
                        break;
                    }
                }
            }
        }
        x_global += 4;
        y_global += 8;        
        //
        /*
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
        */
        imprimirMatriz();

        //obtPuntosDiagonales();
        //crearTipoFigura();
    }
    
    void imprimirMatriz()
    {
        for (int i = 0; i < getDiametro(); i++) {
            for (int j = 0; j < getDiametro(); j++) {
                System.out.println(espejo[i][j]+" ");
            }
        }
    }
    
    /**
     * 
     * FALTO QUE CON LOS PUNTOS DE LA DIAGONAL DENTRO DE LA MATRIZ SE PUDIERA HACER UN STOP
     * 
     */
    
    
        /*
        Maximo comun divisor
   
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
     */
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


    
    public ArrayList<TipoFigura> getMatriz() {
        return matriz;
    }

    public void setMatriz(TipoFigura p_matriz) {
        this.matriz.add(p_matriz);
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


    /*
    
    
    
    
    */
    
    
}
