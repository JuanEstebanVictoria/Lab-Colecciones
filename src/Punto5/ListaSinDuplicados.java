package Punto5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ListaSinDuplicados {
    public static void main(String[] args) {
        //LinkedHashSet no permite duplicados
        Set<String> lista = new LinkedHashSet<>();

        lista.add("Cuaderno");
        lista.add("Lapiz");
        lista.add("Borrador");
        lista.add("Cuaderno");
        lista.add("Computador");

        Iterator<String> iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
