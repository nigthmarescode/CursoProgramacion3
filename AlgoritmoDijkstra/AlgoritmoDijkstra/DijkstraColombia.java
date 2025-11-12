package AlgoritmoDijkstra;

import java.util.*;

// Implementación sencilla del algoritmo de Dijkstra usando listas de adyacencia
public class DijkstraColombia {

    // Clase que representa una conexión (arista) entre dos ciudades
    static class Arista {
        int destino; // ciudad a la que se dirige
        int peso; // distancia o costo del recorrido

        Arista(int destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    // Algoritmo de Dijkstra: calcula las distancias más cortas desde un nodo
    // inicial
    public static int[] dijkstra(List<List<Arista>> grafo, int inicio) {
        int n = grafo.size();
        int[] dist = new int[n]; // guarda la distancia mínima a cada ciudad
        boolean[] visitado = new boolean[n]; // marca las ciudades ya procesadas

        Arrays.fill(dist, Integer.MAX_VALUE); // inicializa todas las distancias como "infinitas"
        dist[inicio] = 0; // la distancia desde la ciudad inicial hasta sí misma es 0

        // Cola de prioridad que selecciona siempre el nodo con la menor distancia
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[] { inicio, 0 }); // formato: {nodo, distancia}

        // Recorre el grafo hasta visitar todas las ciudades alcanzables
        while (!pq.isEmpty()) {
            int[] actual = pq.poll();
            int nodo = actual[0];

            if (visitado[nodo])
                continue; // si ya fue visitado, lo saltamos
            visitado[nodo] = true;

            // Recorremos las conexiones del nodo actual
            for (Arista arista : grafo.get(nodo)) {
                int vecino = arista.destino;
                int peso = arista.peso;

                // Si encontramos un camino más corto hacia el vecino, actualizamos la distancia
                if (dist[nodo] + peso < dist[vecino]) {
                    dist[vecino] = dist[nodo] + peso;
                    pq.offer(new int[] { vecino, dist[vecino] });
                }
            }
        }

        // Retorna las distancias mínimas desde el nodo inicial a todos los demás
        return dist;
    }
}