package SeleccionSort;

import java.util.Arrays;

class SelectionSort {

    // Método que ordena un arreglo usando el algoritmo de selección
    void selectionSort(int array[]) {
        int size = array.length;

        // Recorre el arreglo elemento por elemento
        for (int step = 0; step < size - 1; step++) {
            int min_idx = step; // Índice del elemento mínimo encontrado

            // Busca el elemento más pequeño en la parte no ordenada del arreglo
            for (int i = step + 1; i < size; i++) {
                if (array[i] < array[min_idx]) {
                    min_idx = i; // Actualiza el índice del nuevo mínimo
                }
            }

            // Intercambia el elemento mínimo con el primero de la parte no ordenada
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }

    // Método principal para probar el algoritmo
    public static void main(String args[]) {
        int[] data = { 20, 12, 10, 15, 2 };

        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data); // Llama al método de ordenamiento

        System.out.println("Arreglo ordenado en orden ascendente:");
        System.out.println(Arrays.toString(data)); // Muestra el resultado
    }
}
