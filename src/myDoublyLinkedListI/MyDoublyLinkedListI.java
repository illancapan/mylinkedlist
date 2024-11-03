package myDoublyLinkedListI;

public class MyDoublyLinkedListI<E> implements MyDoublyListI<E> {

    private DoublyNode<E> head;
    private DoublyNode<E> tail;
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        DoublyNode<E> current = head; //INICIAR DESDE EL PRIMER NODO
        while (current != null) {
            if (current.getData().equals(o)) {//COMPARA EL DATO DEL NODO CON EL OBJETO BUSCADO
                return true; //ELEMENTO ENCONTRADO
            }
            current = current.getNextNode();//MOVERSE AL SIGUIENTE NODO
        }
        return false;
    }

    @Override
    public boolean add(E e) {
        DoublyNode<E> newNode = new DoublyNode<>(e);


//        VERIFICO SI LA LISTA ESTA VACIA
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNextNode(newNode); //ENLAZAR EL NODO ACTUAL 'TAIL' AL NUEVO NODO
            newNode.setPrevNode(tail); // ENLAZAR EL NUEVO NODO AL NODO ACTUAL 'TAIL'
            tail = newNode;             // ACTUALIZAR EL 'TAIL' AL NUEVO NODO
        }
        size++;
        return true;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Indice fuera de rango.");
        }
        DoublyNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNextNode();
        }
        return current.getData();
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(("indice fuera de rango"));
        }
        DoublyNode<E> current = head;

        if (index == 0) {// si se elimina el primer nodo
            head = head.getNextNode();
            if (head != null) {
                head = head.getNextNode();
            } else {
                tail = null;
            }
        } else {
            for (int i = 0; i < index; i++) {
                current = current.getNextNode();
            }
            DoublyNode<E> previous = current.getPrevNode();
            DoublyNode<E> next = current.getNextNode();
            if (previous != null) {
                previous.setNextNode(next);
            }
            if (next != null) {
                next.setPrevNode(previous);
            }else {
                tail = previous;
            }

        }
        size--;
        return true;
    }


    public void printList() {
        DoublyNode<E> current = head;

        System.out.print("Lista: ");
        while (current != null) {
            System.out.print(current.getData());
            if (current.getNextNode() != null) {
                System.out.print(" <--> "); // muestra la conexion entre nodos
            }
            current = current.getNextNode();
        }
        System.out.println(); // nueva linea al final
    }
}
