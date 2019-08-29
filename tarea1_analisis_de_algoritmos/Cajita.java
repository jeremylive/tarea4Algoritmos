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
    
    Cajita()
    {
        
    }

    public int getF_x() {
        return f_x;
    }

    public void setF_x(int f_x) {
        this.f_x = f_x;
    }

    public int getF_y() {
        return f_y;
    }

    public void setF_y(int f_y) {
        this.f_y = f_y;
    }

    public int getTipo_figura() {
        return tipo_figura;
    }

    public void setTipo_figura(int tipo_figura) {
        this.tipo_figura = tipo_figura;
    }
    
    
}
