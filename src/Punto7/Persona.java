package Punto7;

public class Persona implements  Comparable<Persona>{

    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }
    public int compareTo(Persona persona){
        return Integer.compare(this.edad, persona.getEdad());
    }
    public int getEdad() {
        return edad;
    }
}
