package myListI;

public class MyLinkedList<E> implements MyListI<E> {
    private Node<E> head; // Nodo inicial de la lista
    private int size;     // Contador de elementos en la lista

    // Constructor
    public MyLinkedList() {
        this.head = null; // La lista comienza vacía
        this.size = 0;    // Tamaño inicial es 0
    }

    @Override
    public int size() {
        return size; // Retorna el número de elementos
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Retorna true si la lista está vacía
    }

    @Override
    public boolean contains(Object o) {
        Node<E> current = head; // Nodo actual comenzando desde la cabeza
        while (current != null) {
            if (current.getData().equals(o)) {
                return true; // Se encontró el elemento
            }
            current = current.getNextNode(); // Moverse al siguiente nodo
        }
        return false; // Elemento no encontrado
    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e); // Crear un nuevo nodo
        if (head == null) { // Si la lista está vacíaxzl
            head = newNode; // El nuevo nodo se convierte en la cabeza
        } else {
            Node<E> current = head; // Nodo actual comenzando desde la cabeza
            while (current.getNextNode() != null) {
                current = current.getNextNode(); // Moverse al siguiente nodo
            }
            current.setNextNode(newNode); // Enlazar el nuevo nodo al final de la lista
        }
        size++; // Incrementar el contador de tamaño
        return true; // Se agregó el elemento
    }

    @Override
    public void clear() {
        head = null; // Desconectar todos los nodos
        size = 0;    // Restablecer el contador de tamaño
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<E> current = head; // Nodo actual comenzando desde la cabeza
        for (int i = 0; i < index; i++) {
            current = current.getNextNode(); // Moverse al nodo en la posición index
        }
        return current.getData(); // Retornar el dato del nodo
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }

        if (index == 0) { // Si se elimina el primer nodo
            head = head.getNextNode(); // Cambiar la cabeza
        } else {
            Node<E> current = head; // Nodo actual comenzando desde la cabeza
            Node<E> prev = null; // Nodo anterior
            for (int i = 0; i < index; i++) {
                prev = current; // Guardar el nodo anterior
                current = current.getNextNode(); // Moverse al siguiente nodo
            }
            prev.setNextNode(current.getNextNode()); // Desvincular el nodo actual
        }

        size--; // Decrementar el contador de tamaño
        return true; // Se eliminó el elemento
    }
}
