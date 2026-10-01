public class LinkedList<E> implements IList<E> {

    private Node<E> first;
    private int size;

    public LinkedList() {
        first = null;
        size = 0;
    }

    public void add(E e) {
        Node<E> newNode = new Node<>(e);

        if (first == null) {
            first = newNode;
        } else {
            Node<E> current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    public void add(E e, int index) {
        if (index < 0 || index > size) return;

        Node<E> newNode = new Node<>(e);

        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> current = first;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) return null;

        Node<E> removed;

        if (index == 0) {
            removed = first;
            first = first.next;
        } else {
            Node<E> current = first;

            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            removed = current.next;
            current.next = removed.next;
        }

        size--;
        return removed.info;
    }

    public E get(int index) {
        Node<E> current = first;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.info;
    }

    public int size() {
        return size;
    }

    public void clear() {
        first = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // ============================================================
    // EJERCICIO 1: Eliminar elementos repetidos
    // ============================================================
    @Override
    public void eliminarRepetidos() {
        Node<E> actual = first;
        while (actual != null) {
            Node<E> anterior = actual;
            Node<E> comparador = actual.next;
            while (comparador != null) {
                if (comparador.info.equals(actual.info)) {
                    anterior.next = comparador.next;
                    size--;
                } else {
                    anterior = comparador;
                }
                comparador = comparador.next;
            }
            actual = actual.next;
        }
    }

    // ============================================================
    // EJERCICIO 2: Rotar una posición a la derecha
    // ============================================================
    @Override
    public void rotarDerecha() {
        if (first == null || first.next == null) return;

        Node<E> penultimo = first;
        while (penultimo.next.next != null) {
            penultimo = penultimo.next;
        }

        Node<E> ultimo = penultimo.next;
        penultimo.next = null;
        ultimo.next = first;
        first = ultimo;
    }

    // ============================================================
    // EJERCICIO 3: Concatenar dos listas
    // ============================================================
    @Override
    public void concatenar(IList<E> otra) {
        if (otra == null) return;
        for (int i = 0; i < otra.size(); i++) {
            this.add(otra.get(i));
        }
    }
}