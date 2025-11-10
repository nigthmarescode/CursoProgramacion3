package InsercionSort;

import java.util.Arrays;

class InsertionSort {

    // Método que ordena un arreglo usando el algoritmo de inserción
    void insertionSort(int array[]) {
        int size = array.length;

        // Recorre el arreglo desde la segunda posición
        for (int step = 1; step < size; step++) {
            int key = array[step]; // Elemento actual a insertar
            int j = step - 1;

            // Desplaza los elementos mayores que "key" una posición a la derecha
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Inserta "key" en su posición correcta
            array[j + 1] = key;
        }
    }

    // Método principal para probar el algoritmo
    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };

        InsertionSort is = new InsertionSort();
        is.insertionSort(data); // Llama al método de ordenamiento

        System.out.println("Arreglo ordenado en orden ascendente:");
        System.out.println(Arrays.toString(data)); // Muestra el resultado
    }
}

