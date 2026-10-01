public class Node<E> {
    E info;
    Node<E> next;

    public Node(E info) {
        this.info = info;
        this.next = null;
    }
}