package Punto10;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Predicate;

public class Cola {

    public static void main(String[] args) {

        Queue<Producto>productos = new LinkedList<>();
        productos.add(new Producto(10));
        productos.add(new Producto(2));
        productos.add(new Producto(3));
        productos.add(new Producto(9));
        productos.add(new Producto(20));
        productos.add(new Producto(11));

        Queue<Producto>filtrados = devolverCola(productos);


        for(Producto producto: filtrados ){
            System.out.println(producto.getPrecio());
        }

    }

    public static Queue<Producto> devolverCola(Queue<Producto>productos) {

        if (productos.isEmpty()) {
            return new LinkedList<>();
        }
        Producto actual= productos.poll();

        Queue<Producto>colaFiltrada= devolverCola(productos);

        if(actual.getPrecio()<10){
            colaFiltrada.add(actual);
        }
        return colaFiltrada;

    }
}
