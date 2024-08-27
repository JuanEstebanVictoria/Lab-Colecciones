package Punto7;

import java.util.ArrayList;
import java.util.List;

public class MayorEdadRecursividad {

    public static void main(String[] args) {

        List<Persona>personas= new ArrayList<>();
        Persona p1= new Persona(20);
        Persona p2= new Persona(12);
        Persona p3= new Persona(91);
        Persona p4= new Persona(11);

        personas.add(p1); personas.add(p2); personas.add(p3); personas.add(p4);

        List<Persona> mayores = DeterminarMayoresEdad(personas);

        for(Persona p : mayores){
            System.out.println("Mayores de edad: "+p.getEdad());
        }
    }
    public  static List<Persona> DeterminarMayoresEdad(List<Persona> personas){

        if(personas.isEmpty()){
            return  new ArrayList<>();
        }
        Persona primera = personas.get(0);
        List<Persona> otras =  personas.subList(1, personas.size());
        List<Persona> aux = DeterminarMayoresEdad(otras);

        if(primera.compareTo(new Persona(18))>=0){
            aux.add(0,primera);
        }
        return  aux;
    }
}
