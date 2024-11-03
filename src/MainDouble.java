import myDoublyLinkedListI.MyDoublyLinkedListI;

public class MainDouble {
    public static void main(String[] args) {

        MyDoublyLinkedListI<Integer> list = new MyDoublyLinkedListI<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();// muestra la lista: 1 <--> 2 <--> 3


        System.out.println("Size: " + list.size());

        System.out.println("CONSTAINS 2: " + list.contains(2));

        System.out.println("Elementos en el indice 1: " + list.get(1));

        list.remove(1);// Muestra la lista: 1 <--> 3
        list.printList();
        System.out.println("Size despues de remover el indice 1: " + list.size());

//        limpiar
        list.clear();
        list.printList();// Muestra la lista: (vacía)
        System.out.println("Size despues de limpiar: " + list.size());
    }
}
