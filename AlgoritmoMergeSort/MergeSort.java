package AlgoritmoMergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String args[]) {
        int vec[] = { 45, 17, 23, 67, 21 };

        System.out.println("Vector original");
        imprimirVector(vec);

        System.out.println("\nVector ordenado");
        ordenacionMergeSort(vec); // Aplica el algoritmo MergeSort
        imprimirVector(vec);
    }

    // Método principal del algoritmo MergeSort
    public static void ordenacionMergeSort(int vec[]) {
        if (vec.length <= 1) // Caso base: si el vector tiene 1 elemento, ya está ordenado
            return;

        int mitad = vec.length / 2; // Divide el vector a la mitad
        int izq[] = Arrays.copyOfRange(vec, 0, mitad); // Mitad izquierda
        int der[] = Arrays.copyOfRange(vec, mitad, vec.length); // Mitad derecha

        // Ordena recursivamente ambas mitades
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);

        // Combina las dos mitades ordenadas
        combinarVector(vec, izq, der);
    }

    // Une dos subarreglos ordenados en un solo arreglo ordenado
    public static void combinarVector(int v[], int izq[], int der[]) {
        int i = 0; // Índice para la mitad izquierda
        int j = 0; // Índice para la mitad derecha

        for (int k = 0; k < v.length; k++) {
            if (i >= izq.length) { // Si ya se terminó la izquierda, toma de la derecha
                v[k] = der[j];
                j++;
                continue;
            }
            if (j >= der.length) { // Si ya se terminó la derecha, toma de la izquierda
                v[k] = izq[i];
                i++;
                continue;
            }
            // Compara y toma el menor de ambos lados
            if (izq[i] < der[j]) {
                v[k] = izq[i];
                i++;
            } else {
                v[k] = der[j];
                j++;
            }
        }
    }

    // Muestra los elementos del vector en consola
    public static void imprimirVector(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }
}
