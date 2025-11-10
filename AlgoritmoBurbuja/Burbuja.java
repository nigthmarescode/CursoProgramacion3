package AlgoritmoBurbuja;

public class Burbuja {

    public static void main(String arg[]) {
        // Arreglo inicial con números desordenados
        int vec[] = { 6, 8, 3, 5, 4, 9, 0, 2, 1, 7 };

        // Muestra el vector original
        System.out.print("Vector sin ordenar: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }

        // Algoritmo de ordenamiento burbuja
        for (int i = 0; i < vec.length - 1; i++) {
            for (int j = 0; j < (vec.length - 1 - i); j++) {
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (vec[j] > vec[j + 1]) {
                    int aux = vec[j];
                    vec[j] = vec[j + 1];
                    vec[j + 1] = aux;
                }
            }
        }

        // Muestra el vector ya ordenado
        System.out.print("\nVector ordenado: ");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + " ");
        }
    }
}
