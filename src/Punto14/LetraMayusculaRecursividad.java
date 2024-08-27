package Punto14;

import java.util.ArrayList;
import java.util.List;

public class LetraMayusculaRecursividad {

    public static void main(String[] args) {

        String cad1= "Achergjew";
        String cad2= "iehfjodmw";
        String cad3= "nihfienf";
        String cad4= "Lfdiuen";
        String cad5= "QQoub";

        List<String>lista = new ArrayList<>();
        lista.add(cad1); lista.add(cad2); lista.add(cad3); lista.add(cad4); lista.add(cad5);

        List<String> listaFinal = empiezanMayuscula(lista);

        for (int i =0; i<listaFinal.size(); i++){
            System.out.println("Estas inician con mayuscula: "+ listaFinal.get(i));
        }

    }

    public static List<String>empiezanMayuscula(List<String>lista){

        if(lista.isEmpty()){
            return new ArrayList<>();
        }
        String primera = lista.get(0);
        List<String>otras = lista.subList(1, lista.size());
        List<String>aux= empiezanMayuscula(otras);
        {
            if (primera.charAt(0) < 90){
                aux.add(0, primera);
            }
        }
        return aux;
    }

}
