package Punto17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ListaProductos {

    public static void main(String [] args){

        Map<String, Double> productosHashMap = new HashMap<>();
        productosHashMap.put("Manzana", 2.000);
        productosHashMap.put("Pandebonos", 3.000);
        productosHashMap.put("Cuajada", 2.000);

        System.out.println("HashMap: " +  productosHashMap);

        Map<String, Double> productosLinkedHashMap = new LinkedHashMap<>();
        productosLinkedHashMap.put("Salchichon", 15.000);
        productosLinkedHashMap.put("Arroz", 2.600);
        productosLinkedHashMap.put("Platano", 4.000);

        System.out.println("LinkedHashMap: " + productosLinkedHashMap);

        Map<String, Double> productosTreeMap = new TreeMap<>();
        productosTreeMap.put("Milo", 3.500);
        productosTreeMap.put("Azucar", 2.200);
        productosTreeMap.put("Chontaduro", 3.000);

        System.out.println("TreeMap: " + productosTreeMap);
    }

    /**
     Diferencias

     Orden de elementos:
     HashMap no tiene orden de lementos
     LinkedHashMap mantiene el orden de insercción (o de acceso)
     TreeMap mantiene un orden natural o personalizado de las claves

     Estructura interna:
     HashMap tabla hash
     LinkedHashMap tabla hash doblemnte enlazada
     TreeMap arbol rojo-negro

     Perminte claves null:
     HashMao si
     LinkedHashMap si
     TreeMap no

     Uso habitual:
     HashMap cuando no se necesita un orden y se prioriza el rendimiento
     LinkedHashMap Cuando se necesita manterner el orden de inserción o acceso
     TreeMao Cuando se requiere un orden específico de las claves
     **/
}
