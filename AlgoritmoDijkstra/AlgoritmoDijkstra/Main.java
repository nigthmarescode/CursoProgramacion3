package AlgoritmoDijkstra;

import java.util.*;
import static AlgoritmoDijkstra.DijkstraColombia.*;

public class Main {
    public static void main(String[] args) {

        // Lista de ciudades del grafo
        String[] ciudades = { "Cali", "Bogotá", "Medellín", "Barranquilla", "Cartagena" };

        // Creamos el grafo como lista de adyacencia
        List<List<Arista>> grafo = new ArrayList<>();
        for (int i = 0; i < ciudades.length; i++) {
            grafo.add(new ArrayList<>());
        }

        // Conexiones entre ciudades (peso = distancia aproximada en km)
        grafo.get(0).add(new Arista(1, 460)); // Cali -> Bogotá
        grafo.get(0).add(new Arista(2, 420)); // Cali -> Medellín
        grafo.get(2).add(new Arista(1, 415)); // Medellín -> Bogotá
        grafo.get(1).add(new Arista(3, 1000)); // Bogotá -> Barranquilla
        grafo.get(2).add(new Arista(4, 640)); // Medellín -> Cartagena
        grafo.get(3).add(new Arista(4, 120)); // Barranquilla -> Cartagena

        // Nodo inicial: Cali (índice 0)
        int inicio = 0;
        int[] distancias = dijkstra(grafo, inicio);

        // Mostrar distancias desde Cali
        System.out.println("Distancias desde Cali:");
        for (int i = 0; i < ciudades.length; i++) {
            System.out.println(ciudades[i] + ": " + distancias[i] + " km");
        }

        // ==========================
        // Ordenamos las distancias (punto 3 del enunciado)
        // ==========================
        int[] distOrdenadas = distancias.clone();
        Arrays.sort(distOrdenadas);

        System.out.println("\nRecorridos ordenados (de menor a mayor):");
        for (int d : distOrdenadas) {
            if (d != Integer.MAX_VALUE)
                System.out.println(d + " km");
        }

        System.out.println(
                "\nEl recorrido más corto desde Cali termina en: " + ciudades[4] + " (" + distancias[4] + " km)");
    }
}