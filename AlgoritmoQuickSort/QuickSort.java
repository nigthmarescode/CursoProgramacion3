package AlgoritmoQuickSort;

public class QuickSort {

    // Arreglo inicial con los datos a ordenar
    private static int vec[] = { 20, 12, 28, 24, 8, 4, 16 };

    public static void main(String[] args) {
        System.out.println("Vector original");
        imprimirVector(vec); // Muestra el vector antes de ordenar
        ordenacionRapida(vec); // Llama al método que aplica QuickSort
        System.out.println("\nVector ordenado");
        imprimirVector(vec); // Muestra el vector ya ordenado
    }

    // Método que inicia la ordenación rápida
    public static void ordenacionRapida(int vec[]) {
        final int N = vec.length;
        quickSort(vec, 0, N - 1); // Llama a quickSort indicando los límites del arreglo
    }

    // Método recursivo que aplica el algoritmo QuickSort
    public static void quickSort(int vec[], int inicio, int fin) {
        if (inicio >= fin) // Caso base: si el rango es inválido, termina
            return;

        int pivote = vec[inicio]; // Se elige el primer elemento como pivote
        int elemIzq = inicio + 1; // Índice que recorre desde la izquierda
        int elemDer = fin;        // Índice que recorre desde la derecha

        // Recorre el arreglo para ubicar elementos menores y mayores al pivote
        while (elemIzq <= elemDer) {
            // Avanza por la izquierda mientras los elementos sean menores al pivote
            while (elemIzq <= fin && vec[elemIzq] < pivote) {
                elemIzq++;
            }
            // Retrocede por la derecha mientras los elementos sean mayores o iguales al pivote
            while (elemDer > inicio && vec[elemDer] >= pivote) {
                elemDer--;
            }
            // Si los índices aún no se cruzan, intercambia los elementos
            if (elemIzq < elemDer) {
                int temp = vec[elemIzq];
                vec[elemIzq] = vec[elemDer];
                vec[elemDer] = temp;
            }
        }

        // Coloca el pivote en su posición final
        if (elemDer > inicio) {
            int temp = vec[inicio];
            vec[inicio] = vec[elemDer];
            vec[elemDer] = temp;
        }

        // Llamadas recursivas para ordenar las sublistas izquierda y derecha
        quickSort(vec, inicio, elemDer - 1);
        quickSort(vec, elemDer + 1, fin);
    }

    // Método auxiliar para imprimir el contenido del vector
    public static void imprimirVector(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }
}
