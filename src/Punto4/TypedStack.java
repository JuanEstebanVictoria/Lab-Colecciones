package Punto4;

import java.util.Stack;

public class TypedStack {
    private Stack<Object> stack;

    public TypedStack() {
        this.stack = new Stack<>();
    }

    // Inserta un elemento en la pila
    public void push(Object item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            Object topItem = stack.peek();
            if (item.getClass() == topItem.getClass()) {
                stack.push(item);
            } else {
                throw new IllegalArgumentException("El tipo del objeto no coincide con el tipo del elemento en la cima de la pila.");
            }
        }
    }

    // Extrae un elemento de la pila
    public Object pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return stack.pop();
    }

    //Muestar  el elemento en la cima de la pila sin extraerlo
    public Object peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        return stack.peek();
    }

    //verifica si la pila está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    //Obtener el tamaño de la pila
    public int size() {
        return stack.size();
    }
}
