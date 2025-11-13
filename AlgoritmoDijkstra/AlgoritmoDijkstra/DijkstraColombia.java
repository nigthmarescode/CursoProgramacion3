package AlgoritmoDijkstra;

import java.util.*;

// Clase que contiene el algoritmo de Dijkstra
public class DijkstraColombia {
    // Método que aplica el algoritmo de Dijkstra
    public static int[] dijkstra(List<List<Arista>> grafo, int origen) {
        int n = grafo.size();
        int[] dist = new int[n];
        boolean[] visitado = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[origen] = 0;

        // Bucle principal del algoritmo
        for (int i = 0; i < n - 1; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) {
                if (!visitado[j] && (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }

            if (u == -1)
                break; // si ya no hay nodos alcanzables

            visitado[u] = true;

            // Actualizamos las distancias de los vecinos
            for (Arista arista : grafo.get(u)) {
                int nuevoDist = dist[u] + arista.peso;
                if (nuevoDist < dist[arista.destino]) {
                    dist[arista.destino] = nuevoDist;
                }
            }
        }

        return dist;
    }
}