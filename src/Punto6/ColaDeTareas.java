package Punto6;

import java.util.PriorityQueue;
import java.util.Queue;

public class ColaDeTareas {
    public static void main(String[] args) {
        // Crear una PriorityQueue de Tarea
        Queue<Tarea> colaDeTareas = new PriorityQueue<>();


        colaDeTareas.add(new Tarea("Hacer la compra", 1));
        colaDeTareas.add(new Tarea("Terminar el proyecto", 5));
        colaDeTareas.add(new Tarea("Sacar cita medica", 6));
        colaDeTareas.add(new Tarea("Pagar las facturas", 3));


        while (!colaDeTareas.isEmpty()) {
            System.out.println("Procesando: " + colaDeTareas.poll());
        }
    }
}
