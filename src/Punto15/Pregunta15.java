package Punto15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Pregunta15 {

    public static void main(String [] args){

        HashMap<String, Integer> listaHashMap = new HashMap<>();

        listaHashMap.put("abc", 33);
        listaHashMap.put("hKJ", 3);
        listaHashMap.put("XYZ", 40);
        listaHashMap.put("def", 13);
        listaHashMap.put("PQR", 22);
        listaHashMap.put("uvw", 66);

        Pregunta15 solucion = new Pregunta15();
        Map<String, Integer> mapaMinusculas = solucion.seleccionar(listaHashMap, listaHashMap.entrySet().iterator());

        System.out.println("Llaves que inicias por minusculas: " + mapaMinusculas);
    }



    public Map<String, Integer> seleccionar(Map<String, Integer> mapa, Iterator<Map.Entry<String, Integer>> iterator) {

        Map<String, Integer> mapaSeleccionado = new HashMap<>();

        if (!iterator.hasNext()){
            return mapaSeleccionado;
        }

        /** Obtiene la siguiente entrada del mapa**/

        Map.Entry<String, Integer> llave = iterator.next();

        if(Character.isLowerCase(llave.getKey().charAt(0))){
            mapaSeleccionado.put(llave.getKey(), llave.getValue());

        }

        mapaSeleccionado.putAll(seleccionar(mapa, iterator));

        return mapaSeleccionado;
    }
}
