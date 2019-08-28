package tarea1_analisis_de_algoritmos;

import java.util.ArrayList;

public class Cajita 
{
    private int f_x, f_y, tipo_figura;
    
    Cajita(int x, int y, int p_tipo_figura)
    {
        f_x = x;
        f_y = y;
        p_tipo_figura = tipo_figura;
    }

    private int getX()
    {
        return f_x;
    }
    private int getY()
    {
        return f_y;
    }
}
