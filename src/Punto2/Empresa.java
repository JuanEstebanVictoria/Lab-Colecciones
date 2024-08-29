package Punto2;

import java.util.Scanner;
import java.util.TreeSet;

public class Empresa {
    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Producto p1 = new Producto("001", "Laptop", 1500.0);
        Producto p2 = new Producto("002", "Smartphone", 800.0);
        Producto p3 = new Producto("003", "Tablet", 300.0);

        empresa.agregarProducto(p1);
        empresa.agregarProducto(p2);
        empresa.agregarProducto(p3);

        empresa.mostrarProductos();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el código del producto que desea buscar: ");
        String codigoIngresado = scanner.nextLine();

        Producto buscado = empresa.buscarProductoPorCodigo(codigoIngresado);
        if (buscado != null) {
            System.out.println("Producto encontrado: " + buscado);
        } else {
            System.out.println("Producto no encontrado.");
        }
        scanner.close();
    }
}
