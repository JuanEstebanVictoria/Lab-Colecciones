package Punto9;

import java.util.Stack;
import java.util.function.Predicate;
public class CondicionYPila {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        pila.push(3);
        pila.push(4);
        pila.push(1);
        pila.push(7);
        pila.push(6);
        pila.push(10);

        Predicate<Integer>condicion = x-> x>5;

        Stack<Integer> pilaFiltrada = filtrarPila(pila, condicion);

        System.out.println("Los numeros que cumplen la condicion son: "+pilaFiltrada);
    }
    public static <T> Stack<T> filtrarPila(Stack<T>pila, Predicate<T>condicion){
        if(pila.isEmpty()){
            return  new Stack<>();
        }
        T primerElemento = pila.pop();
        Stack<T> pilaFiltrada = filtrarPila(pila, condicion);

        if(condicion.test(primerElemento)){
            pilaFiltrada.push(primerElemento);
        }
        return pilaFiltrada;
    }
}
