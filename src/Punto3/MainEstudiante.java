package Punto3;

import java.util.HashMap;
import java.util.Map;

public class MainEstudiante {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Daniel","Martinez", 25, "Masculino", "MAT006");
        Estudiante e2 = new Estudiante("Ana", "Jimenez",30, "Femenino", "MAT002");
        Estudiante e3 = new Estudiante("Camila","Araujo",20, "Femenino", "MAT008");
        Estudiante e4 = new Estudiante("David", "Ballesteros",28, "Masculino", "MAT004");


        Map<String, Estudiante> mapaEstudiantes = new HashMap<>();
        mapaEstudiantes.put(e1.getMatricula(), e1);
        mapaEstudiantes.put(e2.getMatricula(), e2);
        mapaEstudiantes.put(e3.getMatricula(), e3);
        mapaEstudiantes.put(e4.getMatricula(), e4);

        System.out.println("Matrículas almacenadas en el mapa:");
        for (String matricula : mapaEstudiantes.keySet()) {
            System.out.println(matricula);
        }

        /*String matriculaBuscada = "MAT003";
        Estudiante estudiante = mapaEstudiantes.get(matriculaBuscada);

        if (estudiante != null) {
            System.out.println("Estudiante encontrado: " + estudiante);
        } else {
            System.out.println("Estudiante no encontrado para la matrícula: " + matriculaBuscada);
        }*/
    }
}


