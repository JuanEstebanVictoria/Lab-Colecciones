package Punto8;

import Punto1.Main;

import java.util.HashMap;
import java.util.Map;

public class FiltrarMapa {
    public static void main(String[] args) {
        Map<Integer, String> mapa= new HashMap<>();
        mapa.put(1,"juan");
        mapa.put(2,"pedro");
        mapa.put(3,"luis");
        mapa.put(4,"robinson");

        Map<Integer, String>mapaFiltrado = filtrar(mapa);

        for(Map.Entry<Integer,String>entrada: mapaFiltrado.entrySet()){
            System.out.println(entrada.getKey()+" , "+ entrada.getValue());
        }

    }

    private static Map<Integer, String> filtrar(Map<Integer, String> mapa) {

        if(mapa.isEmpty()){
            return new HashMap<>();
        }

        Map.Entry<Integer, String> entry = mapa.entrySet().iterator().next();

        mapa.remove(entry.getKey());

        Map<Integer, String> filtrado = filtrar(mapa);

        if(entry.getKey()%2==0)
        {
            filtrado.put(entry.getKey(), entry.getValue());
        }

        return filtrado;



    }
}
