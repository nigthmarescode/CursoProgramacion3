public class AlgoritmoDijkstra {
    public static int getClosestVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIdx = -1;
        for (int i = 0; i < distance.length; i++) {
            if (distance[i] < min)
                if (visited[i] == false) {
                    min = distance[i];
                    minIdx = i;
                }
        }
        return minIdx;
    }

    public static int[] dijkstrasShortestPath(Graph g, int src) {
        // matriz final de distancias más cortas
        int[] distance = new int[g.numOfvertices];
        // matriz para indicar si se ha encontrado la distancia más corta del vértice
        boolean[] visited = new boolean[g.numOfvertices];

        // inicializando las matrices
        for (int i = 0; i < g.numOfvertices; i++) {
            distance[i] = Integer.MAX_VALUE; // la distancia inicial es infinita
            visited[i] = false; // no se ha encontrado la distancia más corta para ningún nodo todavía
        }
        distance[src] = 0;

        for (int i = 0; i < g.numOfvertices; i++) {
            int closestVertex = getClosestVertex(distance, visited); // obtiene el nodo más cercano
            if (closestVertex == Integer.MAX_VALUE) // si el nodo más cercano está a una distancia infinita, significa
                                                    // que no se puede alcanzar ningún otro nodo. Entonces devuelve
                return distance;

            visited[closestVertex] = true;
            for (int j = 0; j < g.numOfvertices; j++) {
                if (visited[j] == false) // la distancia más corta del nodo j no debe haber sido finalizada
                {
                    if (g.adjMatrix[closestVertex][j] != 0) {
                        int d = distance[closestVertex] + g.adjMatrix[closestVertex][j];
                        if (d < distance[j]) // la distancia a través del nodo más cercano es menor que la distancia
                                             // inicial
                            distance[j] = d;
                    }
                }
            }
        }
        return distance;
    }
}
