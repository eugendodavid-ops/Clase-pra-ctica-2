public class Main {

    private static void imprimir(String etiqueta, IList<?> lista) {
        System.out.print(etiqueta);
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // EJERCICIO 1: Eliminar repetidos
        System.out.println("=== EJERCICIO 1: Eliminar repetidos ===");
        IList<String> listaConRepetidos = new LinkedList<>();
        listaConRepetidos.add("A");
        listaConRepetidos.add("B");
        listaConRepetidos.add("A");
        listaConRepetidos.add("C");
        listaConRepetidos.add("B");
        listaConRepetidos.add("D");
        listaConRepetidos.add("C");

        imprimir("Original:      ", listaConRepetidos);
        listaConRepetidos.eliminarRepetidos();
        imprimir("Sin repetidos: ", listaConRepetidos);
        System.out.println();

        // EJERCICIO 2: Rotar a la derecha
        System.out.println("=== EJERCICIO 2: Rotar a la derecha ===");
        IList<String> listaRotar = new LinkedList<>();
        listaRotar.add("A");
        listaRotar.add("B");
        listaRotar.add("C");
        listaRotar.add("D");

        imprimir("Original: ", listaRotar);
        listaRotar.rotarDerecha();
        imprimir("Rotada:   ", listaRotar);
        System.out.println();

        // EJERCICIO 3: Concatenar dos listas
        System.out.println("=== EJERCICIO 3: Concatenar listas ===");
        IList<String> lista1 = new LinkedList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        lista1.add("D");

        IList<String> lista2 = new LinkedList<>();
        lista2.add("E");
        lista2.add("F");
        lista2.add("G");
        lista2.add("H");

        imprimir("Lista1:      ", lista1);
        imprimir("Lista2:      ", lista2);
        lista1.concatenar(lista2);
        imprimir("Concatenada: ", lista1);
    }
}