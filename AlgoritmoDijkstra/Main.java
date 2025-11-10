public class Main {
    public static void main(String[] args) {
        int[][] graph = {
                { 0, 2, 0, 4, 0 },
                { 2, 0, 5, 0, 0 },
                { 0, 5, 0, 8, 0 },
                { 4, 0, 8, 0, 3 },
                { 0, 0, 0, 3, 0 }
        };

        AlgoritmoDijkstra.dijkstra(graph, 0);
    }
}