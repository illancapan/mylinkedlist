import myListI.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Size: " + list.size()); // Output: Size: 3
        System.out.println("Contains 2: " + list.contains(2)); // Output: Contains 2: true
        System.out.println("Element at index 1: " + list.get(1)); // Output: Element at index 1: 2

        list.remove(1);
        System.out.println("Size after removing index 1: " + list.size()); // Output: Size after removing index 1: 2

        list.clear();
        System.out.println("Size after clear: " + list.size()); // Output: Size after clear: 0

    }
}