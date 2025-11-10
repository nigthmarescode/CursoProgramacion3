public class Grafo {

    int[][] adjMatrix; // matriz de adyacencia para representar los bordes
    int numOfvertices;

    Graph(int[][] mat, int v)
    {
        this.adjMatrix = mat;
        this.numOfvertices = v;
    }

    void addEdge(int src, int dest, int edgeWeight) {
        adjMatrix[src][dest] = edgeWeight;
        adjMatrix[dest][src] = edgeWeight;
    }

}
