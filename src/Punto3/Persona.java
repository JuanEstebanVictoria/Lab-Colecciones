package Punto3;

class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;

    public Persona(String nombre, String apellido, int edad, String genero) {
        this.nombre = nombre;
        this.apellido= apellido;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public int compareTo(Persona otra) {

        int comparacion = this.nombre.compareTo(otra.nombre);
        if (comparacion != 0) {
            return comparacion;
        }
        return Integer.compare(this.edad, otra.edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero='" + genero + '\'' +
                '}';
    }
}
