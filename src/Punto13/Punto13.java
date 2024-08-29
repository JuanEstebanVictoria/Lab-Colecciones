package Punto13;

import java.util.ArrayList;
import java.util.List;

public class Punto13 {

    public static void main(String args[]){

        List<Integer> numeros = List.of(22, 2, 30, 3, 9, 15, 88, 12);

        List<Integer> numerosPares = filtrarNumeros(numeros, 0);

        System.out.println("Los numeros pares son: " + numerosPares);
    }

    public static List<Integer> filtrarNumeros(List<Integer> numeros, int i){

        if(i == numeros.size()){
            return new ArrayList<>();
        }

        List<Integer> pares = filtrarNumeros(numeros, i + 1);

        if(numeros.get(i) % 2 == 0){
            pares.add(0, numeros.get(i));
        }

        return pares;
    }
}
