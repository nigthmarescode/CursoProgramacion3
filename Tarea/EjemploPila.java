package Tarea;

import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();

        // add() - agrega elementos
        pila.add("A");
        pila.add("B");
        pila.add("C");
        System.out.println("Pila inicial: " + pila);

        // size() - cantidad de elementos
        System.out.println("Tamaño de la pila: " + pila.size());

        // contains()
        System.out.println("¿La pila contiene 'B'? " + pila.contains("B"));

        // elementAt()
        System.out.println("Elemento en índice 1: " + pila.elementAt(1));

        // firstElement() y lastElement()
        System.out.println("Primer elemento: " + pila.firstElement());
        System.out.println("Último elemento: " + pila.lastElement());

        // remove(Object o)
        pila.remove("B");
        System.out.println("Después de eliminar 'B': " + pila);

        // removeElementAt()
        pila.removeElementAt(0);
        System.out.println("Después de eliminar índice 0: " + pila);

        // clear()
        pila.clear();
        System.out.println("¿La pila está vacía? " + pila.isEmpty());

        // addAll()
        Stack<String> otra = new Stack<>();
        otra.add("X");
        otra.add("Y");
        pila.addAll(otra);
        System.out.println("Después de addAll(): " + pila);

        // clone()
        Stack<String> copia = (Stack<String>) pila.clone();
        System.out.println("Copia clonada: " + copia);
    }
}

/*
1. add(E e) → agrega un elemento al final del vector (equivalente a push() en una pila).

2. addAll(Collection c) → agrega todos los elementos de otra colección.

3. capacity() → devuelve la capacidad actual del vector (cuántos elementos puede almacenar antes de redimensionarse).

4. clear() → elimina todos los elementos de la pila.

5. clone() → devuelve una copia superficial del vector/pila.

6. contains(Object o) → verifica si un elemento existe en la pila.

7. elementAt(int index) → devuelve el elemento en el índice indicado.

8. firstElement() → devuelve el primer elemento (parte de abajo de la pila).

9. lastElement() → devuelve el último elemento (parte de arriba de la pila).

10. isEmpty() → dice si la pila está vacía.

11. remove(Object o) → elimina la primera aparición de un objeto.

12. removeElementAt(int index) → elimina el elemento en el índice indicado.

13. size() → devuelve el número de elementos en la pila.

14. toString() → devuelve una representación en texto de la pila.

15. trimToSize() → ajusta la capacidad del vector al tamaño actual.
*/