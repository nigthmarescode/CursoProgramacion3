package AlgoritmoDijkstra;

// Clase que representa una conexión (arista) entre dos ciudades
public class Arista {
    int destino;
    int peso; // distancia o costo del trayecto

    public Arista(int destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }
}