public interface IList<E> {
    void add(E e);
    void add(E e, int index);
    E remove(int index);
    E get(int index);
    int size();
    void clear();
    boolean isEmpty();

    // ==== Métodos nuevos de la práctica ====
    void eliminarRepetidos();
    void rotarDerecha();
    void concatenar(IList<E> otra);
}