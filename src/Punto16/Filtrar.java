package Punto16;

import java.util.Stack;
import java.util.function.Predicate;

public class Filtrar {

    public static void main(String[] args) {

        Stack<Persona> pilaPersonas = new Stack<>();
        pilaPersonas.push(new Persona("Yuliano", "M"));
        pilaPersonas.push(new Persona("Allison", "F"));
        pilaPersonas.push(new Persona("Estudillo", "M"));
        pilaPersonas.push(new Persona("Ana", "F"));
        pilaPersonas.push(new Persona("Isabella", "F"));
        pilaPersonas.push(new Persona("Copete", "M"));

        Predicate<Persona> femenino = persona -> persona.getGenero().equals("F");

        Stack<Persona> pilaFemenina = filtrarPila(pilaPersonas, femenino);

        System.out.println("Pila original: " + pilaPersonas);
        System.out.println("Pila filtrada: " + pilaFemenina);

    }

    public static Stack<Persona> filtrarPila(Stack<Persona> pila, Predicate<Persona> condicion) {
        Stack<Persona> pilaFiltrada = new Stack<>();
        return filtroPilaRecursivo(pila, pilaFiltrada, condicion);
    }

    private static Stack<Persona> filtroPilaRecursivo(Stack<Persona> pila, Stack<Persona> pilaFiltrada, Predicate<Persona> condicion) {

        if (pila.isEmpty()) {
            return pilaFiltrada;
        }
        /** Saca el primer elemneto de la pila**/
        Persona persona = pila.pop();

        if (condicion.test(persona)) {
            pilaFiltrada.push(persona);
        }

        pilaFiltrada = filtroPilaRecursivo(pila, pilaFiltrada, condicion);

        pila.push(persona);

        return pilaFiltrada;
    }
}
