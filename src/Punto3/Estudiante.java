package Punto3;

public class Estudiante extends Persona{
    private String matricula;

    public Estudiante(String nombre, String apellido, int edad, String genero, String matricula) {
        super(nombre, apellido, edad, genero);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", genero='" + getGenero() + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
