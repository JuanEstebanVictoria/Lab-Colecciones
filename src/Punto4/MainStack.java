package Punto4;

public class MainStack {
    public static void main(String[] args) {
        TypedStack stack = new TypedStack();

        stack.push(10);
        stack.push(20);

        try {
            stack.push("Hola");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Extraer elementos
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10

        // Inserta una cadena,ahora que la pila está vacía
        stack.push("Hola");

        try {
            stack.push(30.5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
