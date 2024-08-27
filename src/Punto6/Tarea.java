package Punto6;

public class Tarea implements Comparable<Tarea> {
    private String descripcion;
    private int importancia;

    public Tarea(String descripcion, int importancia) {
        this.descripcion = descripcion;
        this.importancia = importancia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImportancia() {
        return importancia;
    }

    @Override
    public int compareTo(Tarea otraTarea) {
        // Las tareas con mayor importancia (número más alto) tendrán mayor prioridad
        return Integer.compare(otraTarea.getImportancia(), this.importancia);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", importancia=" + importancia +
                '}';
    }
}
