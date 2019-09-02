package tarea1_analisis_de_algoritmos;

public class TipoFigura extends Programa
{
    private int id, largo, ancho;
    
    TipoFigura(int p_id, int p_largo, int p_ancho)
    {
        this.id = p_id;
        this.largo = p_largo;
        this.ancho = p_ancho;
    }
    
    TipoFigura()
    {
        this.id = 0;
        this.largo = 0;
        this.ancho = 0;     
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
 
    
}
