package tarea1_analisis_de_algoritmos;

public class Tablero 
{
    private int param_x;
    private int area;

    Tablero(int p_x)
    {
        param_x = p_x;
        area = p_x * p_x;
    }

    private int getX()
    {
        return param_x;
    }

    private int getArea()
    {
        return area;
    }

}
