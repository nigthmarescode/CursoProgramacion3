package ArbolesBinarios;

public class Main {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertarEjemplo();

        System.out.println("Recorrido Preorden: " + arbol.preorden());
        System.out.println("Recorrido Inorden: " + arbol.inorden());
        System.out.println("Recorrido Postorden: " + arbol.postorden());
        System.out.println("¿El árbol está balanceado?: " + arbol.estaBalanceado());
        System.out.println("Profundidad del árbol: " + arbol.calcularProfundidad());
        System.out.println("Anchura del árbol: " + arbol.calcularAnchura());
    }
}

