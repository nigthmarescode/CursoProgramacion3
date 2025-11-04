package ArbolesBinarios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {
    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // ==============================
    // MÉTODOS DE RECORRIDO
    // ==============================

    public ArrayList<Integer> preorden() {
        ArrayList<Integer> resultado = new ArrayList<>();
        preordenRec(raiz, resultado);
        return resultado;
    }

    private void preordenRec(Nodo nodo, ArrayList<Integer> lista) {
        if (nodo == null)
            return;
        lista.add(nodo.valor);
        preordenRec(nodo.izquierdo, lista);
        preordenRec(nodo.derecho, lista);
    }

    public ArrayList<Integer> inorden() {
        ArrayList<Integer> resultado = new ArrayList<>();
        inordenRec(raiz, resultado);
        return resultado;
    }

    private void inordenRec(Nodo nodo, ArrayList<Integer> lista) {
        if (nodo == null)
            return;
        inordenRec(nodo.izquierdo, lista);
        lista.add(nodo.valor);
        inordenRec(nodo.derecho, lista);
    }

    public ArrayList<Integer> postorden() {
        ArrayList<Integer> resultado = new ArrayList<>();
        postordenRec(raiz, resultado);
        return resultado;
    }

    private void postordenRec(Nodo nodo, ArrayList<Integer> lista) {
        if (nodo == null)
            return;
        postordenRec(nodo.izquierdo, lista);
        postordenRec(nodo.derecho, lista);
        lista.add(nodo.valor);
    }

    // ==============================
    // BALANCE DEL ÁRBOL
    // ==============================

    public boolean estaBalanceado() {
        return verificarBalance(raiz) != -1;
    }

    private int verificarBalance(Nodo nodo) {
        if (nodo == null)
            return 0;

        int alturaIzq = verificarBalance(nodo.izquierdo);
        if (alturaIzq == -1)
            return -1;

        int alturaDer = verificarBalance(nodo.derecho);
        if (alturaDer == -1)
            return -1;

        if (Math.abs(alturaIzq - alturaDer) > 1)
            return -1;

        return Math.max(alturaIzq, alturaDer) + 1;
    }

    // ==============================
    // PROFUNDIDAD (altura)
    // ==============================

    public int calcularProfundidad() {
        return calcularAltura(raiz);
    }

    private int calcularAltura(Nodo nodo) {
        if (nodo == null)
            return 0;
        int alturaIzq = calcularAltura(nodo.izquierdo);
        int alturaDer = calcularAltura(nodo.derecho);
        return Math.max(alturaIzq, alturaDer) + 1;
    }

    // ==============================
    // ANCHURA (máx. número de nodos por nivel)
    // ==============================

    public int calcularAnchura() {
        if (raiz == null)
            return 0;

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        int maxAnchura = 0;

        while (!cola.isEmpty()) {
            int nodosNivel = cola.size();
            maxAnchura = Math.max(maxAnchura, nodosNivel);

            for (int i = 0; i < nodosNivel; i++) {
                Nodo actual = cola.poll();
                if (actual.izquierdo != null)
                    cola.add(actual.izquierdo);
                if (actual.derecho != null)
                    cola.add(actual.derecho);
            }
        }

        return maxAnchura;
    }

    // ==============================
    // MÉTODO DE EJEMPLO
    // ==============================

    public void insertarEjemplo() {
        raiz = new Nodo(1);
        raiz.izquierdo = new Nodo(2);
        raiz.derecho = new Nodo(3);
        raiz.izquierdo.izquierdo = new Nodo(4);
        raiz.izquierdo.derecho = new Nodo(5);
        raiz.derecho.derecho = new Nodo(6);
        // raiz.derecho.derecho.derecho = new Nodo(7); // Desbalancea el árbol
    }
}
