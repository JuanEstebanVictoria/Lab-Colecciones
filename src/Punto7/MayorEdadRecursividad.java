package Punto7;

import java.util.ArrayList;

public class MayorEdadRecursividad {

    public static void main(String[] args) {

        ArrayList<Persona>personas= new ArrayList<>();
        ArrayList<Persona>lista= new ArrayList<>();
        int i =0;
        Persona p1= new Persona("Juan",20);
        Persona p2= new Persona("Pedro",21);
        Persona p3= new Persona("Luis",91);

        personas.add(p1); personas.add(p2); personas.add(p3);
        System.out.println(DeterminarMayoresEdad(personas, lista, i));

    }

    public  static ArrayList<Persona> DeterminarMayoresEdad(ArrayList<Persona> personas, ArrayList<Persona>lista, int i){

        if(personas.get(i).getEdad()<18 && i<=personas.size()-1){
            lista.add(personas.get(i));
            return DeterminarMayoresEdad(personas,lista,i = i+1 );
        }else {
            return DeterminarMayoresEdad(personas, lista, i=1+1);
        }

    }
}
