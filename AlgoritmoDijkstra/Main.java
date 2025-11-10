import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int numOfVertices = 6;
        int[][] adjMat = new int[6][6];
        Graph graph = new Graph(adjMat, numOfVertices);

        // agrega bordes al grafo
        graph.addEdge(0, 4, 21);
        graph.addEdge(0, 3, 18);
        graph.addEdge(2, 1, 7);
        graph.addEdge(1, 4, 6);
        graph.addEdge(4, 5, 10);
        graph.addEdge(4, 3, 11);
        graph.addEdge(5, 3, 7);

        // llama al algoritmo de Dijkstra para encontrar la distancia más corta
        int[] dist = AlgoritmoDijkstra.dijkstrasShortestPath(graph, 0);
        System.out.print(Arrays.toString(dist));
    }
}