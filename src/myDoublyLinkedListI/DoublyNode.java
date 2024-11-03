package myDoublyLinkedListI;

public class DoublyNode<E> {
    private E data;
    private DoublyNode<E> nextNode;
    private DoublyNode<E> prevNode;

    public DoublyNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DoublyNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyNode<E> nextNode) {
        this.nextNode = nextNode;
    }

    public DoublyNode<E> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyNode<E> prevNode) {
        this.prevNode = prevNode;
    }
}
