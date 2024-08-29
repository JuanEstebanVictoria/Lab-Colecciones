package Punto16;

public class Persona {

    private String nombre;
    private String genero;

    public Persona(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String toString() {

        return nombre + "(" + genero + ")";
    }
}
