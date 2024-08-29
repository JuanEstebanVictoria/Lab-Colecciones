package Punto12;

import java.util.ArrayList;
import java.util.List;

public class Punto12 {

    public static void main(String [] args){

        Punto12 arbol = new Punto12();

        arbol.raiz = arbol.new Nodo(5);
        arbol.raiz.izq = arbol.new Nodo(3);
        arbol.raiz.der = arbol.new Nodo(7);
        arbol.raiz.izq.izq = arbol.new Nodo(2);
        arbol.raiz.izq.der = arbol.new Nodo(4);
        arbol.raiz.der.izq = arbol.new Nodo(6);
        arbol.raiz.der.der = arbol.new Nodo(8);
        List<Integer> ordenar = arbol.obtenerOrdenados();
        System.out.println("El orden de elementos de manera ascendente es: " + ordenar);

    }



    /** Clase interna para el nodo **/

    class Nodo{
        int valor;
        Nodo izq;
        Nodo der;

        public Nodo(int valor){
            this.valor = valor;
            izq = der = null;
        }
    }

    Nodo raiz;

    /** Función para recocrer el arbol de manera recursiva y en orden**/
    public void ordenar(Nodo nodo, List<Integer> numeros){
        if(nodo != null){
            ordenar(nodo.izq, numeros);
            numeros.add(nodo.valor);
            ordenar(nodo.der, numeros);
        }
    }

    public List<Integer> obtenerOrdenados(){
        List<Integer> listaOrdenados = new ArrayList<>();
        ordenar(raiz, listaOrdenados);
        return listaOrdenados;
    }
}
