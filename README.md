# ListasJava

Implementación de listas en Java (ArrayList y LinkedList) con una práctica de operaciones sobre listas.

## 📁 Estructura del proyecto

- `IList.java` — Interfaz con las operaciones de la lista.
- `ArrayList.java` — Implementación basada en arreglo.
- `LinkedList.java` — Implementación basada en nodos enlazados.
- `Node.java` — Nodo usado por la LinkedList.
- `Main.java` — Programa principal con los 3 ejercicios.
- `README.md` — Este archivo.

## 📝 Ejercicios resueltos

1. **Eliminar elementos repetidos** de una lista.
   - Entrada: `A-B-A-C-B-D-C`
   - Salida: `A-B-C-D`

2. **Rotar una posición a la derecha** los elementos.
   - Entrada: `A-B-C-D`
   - Salida: `D-A-B-C`

3. **Concatenar dos listas**.
   - Lista1: `A-B-C-D`
   - Lista2: `E-F-G-H`
   - Resultado: `A-B-C-D-E-F-G-H`

## ⚙️ Cómo compilar y ejecutar

```bash
javac *.java
java Main