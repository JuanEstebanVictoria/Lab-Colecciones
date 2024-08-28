package Punto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Persona> personas= new ArrayList<>();

        personas.add(new Persona("ana",28,"masculino"));
        personas.add(new Persona("rosa",34,"femenino"));
        personas.add(new Persona("juan",22,"masculino"));
        personas.add(new Persona("sofia",30,"femenino"));


        Collections.sort(personas);
        System.out.println("lista odenada por nombre:"+"\n");
        for (Persona persona : personas){
            System.out.println(persona);
        }

        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return Integer.compare(p1.getEdad(), p2.getEdad());
            }
        });


        System.out.println("Por edad: "+"\n");
        for (Persona p : personas){
            System.out.println(p);
        }
    }



}