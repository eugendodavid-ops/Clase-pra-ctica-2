public class ArrayList<E> implements IList<E> {

    private Object[] elementos;
    private int size;

    public ArrayList() {
        elementos = new Object[10];
        size = 0;
    }

    @Override
    public void add(E e) {
        if (size == elementos.length) {
            Object[] nuevo = new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                nuevo[i] = elementos[i];
            }
            elementos = nuevo;
        }
        elementos[size] = e;
        size++;
    }

    @Override
    public void add(E e, int index) {
        if (index < 0 || index > size) return;

        if (size == elementos.length) {
            Object[] nuevo = new Object[elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                nuevo[i] = elementos[i];
            }
            elementos = nuevo;
        }

        for (int i = size; i > index; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[index] = e;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        if (index < 0 || index >= size) return null;

        E eliminado = (E) elementos[index];

        for (int i = index; i < size - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[size - 1] = null;
        size--;
        return eliminado;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index < 0 || index >= size) return null;
        return (E) elementos[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementos[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // ============================================================
    // EJERCICIO 1: Eliminar elementos repetidos
    // ============================================================
    @Override
    public void eliminarRepetidos() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (elementos[i].equals(elementos[j])) {
                    remove(j);
                    j--;
                }
            }
        }
    }

    // ============================================================
    // EJERCICIO 2: Rotar una posición a la derecha
    // ============================================================
    @Override
    public void rotarDerecha() {
        if (size <= 1) return;

        Object ultimo = elementos[size - 1];

        for (int i = size - 1; i > 0; i--) {
            elementos[i] = elementos[i - 1];
        }

        elementos[0] = ultimo;
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