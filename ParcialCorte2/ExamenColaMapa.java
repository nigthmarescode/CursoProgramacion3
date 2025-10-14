package ParcialCorte2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExamenColaMapa {
    static class ColaCircularEnteros {
        private int[] datos;
        private int cabeza;
        private int cola;
        private int tam;

        public ColaCircularEnteros(int capacidad) {
            datos = new int[capacidad];
            cabeza = 0;
            cola = 0;
            tam = 0;
        }

        public boolean estaVacia() {
            return tam == 0;
        }

        public boolean estaLlena() {
            return tam == datos.length;
        }

        public void encolar(int x) {
            if (estaLlena())
                throw new IllegalStateException("Cola llena");
            datos[cola] = x;
            cola = (cola + 1) % datos.length;
            tam++;
        }

        public int desencolar() {
            if (estaVacia())
                throw new IllegalStateException("Cola vacia");
            int v = datos[cabeza];
            cabeza = (cabeza + 1) % datos.length;
            tam--;
            return v;
        }
    }

    // (50 pts) Calcula el balance de parentesis encolando +1 y -1
    public static int balanceConCola(String s) {
        /* TODO: usar ColaCircularEnteros para encolar y luego sumar */

        // +1 por '(' y -1 por ')', el resultado es la suma de todos los elementos
        ColaCircularEnteros cola = new ColaCircularEnteros(s.length());
        // Encolar +1 por '(' y -1 por ')'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cola.encolar(1);
            } else if (s.charAt(i) == ')') {
                cola.encolar(-1);
            }
        }
        int balance = 0;
        while (!cola.estaVacia()) {
            balance += cola.desencolar();
        }
        return balance;
    }

    public static int registrarIntento(Map<String, Integer> intentos, String nombre) {
        /* TODO: incrementar si existe o iniciar con 1 si no existe */

        if (intentos.containsKey(nombre)) { // Verificar si la clave ya existe
            intentos.put(nombre, intentos.get(nombre) + 1); // Incrementar el valor existente
            return intentos.get(nombre); // Retornar el nuevo valor
        } else {
            intentos.put(nombre, 1); // Iniciar con 1 si no existe
            return 1;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de paréntesis: ");
        String cadena = sc.nextLine();
        System.out.println("Balance cola: " + balanceConCola(cadena));

        Map<String, Integer> intentos = new HashMap<String, Integer>();

        System.out.println("Intentos (Ana): " + registrarIntento(intentos, "Ana"));
        System.out.println("Intentos (Ana): " + registrarIntento(intentos, "Ana"));
        System.out.println("Intentos (Andres): " + registrarIntento(intentos, "Andres"));

        sc.close();
    }
}
