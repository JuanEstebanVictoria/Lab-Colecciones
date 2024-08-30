package Punto11;

import Punto7.Persona;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {

    public static List<Producto> quicksort(List<Producto> productos) {

        if (productos.size() <= 1) {
            return productos;
        }


        Producto pivote = productos.get(0);


        List<Producto> menores = new ArrayList<>();
        List<Producto> iguales = new ArrayList<>();
        List<Producto> mayores = new ArrayList<>();


        for (Producto producto : productos) {
            if (producto.precio < pivote.precio) {
                menores.add(producto);
            } else if (producto.precio > pivote.precio) {
                mayores.add(producto);
            } else {
                iguales.add(producto);
            }
        }


        List<Producto> resultado = new ArrayList<>();
        resultado.addAll(quicksort(menores));
        resultado.addAll(iguales);
        resultado.addAll(quicksort(mayores));

        return resultado;
    }

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto( 1200));
        productos.add(new Producto( 800));
        productos.add(new Producto( 500));
        productos.add(new Producto( 300));


        List<Producto> productosOrdenados = quicksort(productos);

        
        for (Producto producto : productosOrdenados) {
            System.out.println(producto);
        }
    }
}