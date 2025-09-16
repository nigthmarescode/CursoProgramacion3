package Clase7;

import java.util.Stack;

public class OperacionesPila {

    Stack<String> pilaSignos;

    public boolean validarParentesis(String[] s) {

        pilaSignos = new Stack<>();

        // Almacenar en la pila el arreglo de signos
        for (int i = 0; i < s.length; i++) {
            pilaSignos.push(s[i]);

        }

        int tam = pilaSignos.size();
        int cont1 = 0, cont2 = 0;
        // Recorrer la pila
        for (int i = 0; i < tam; i++) {
            if (pilaSignos.peek().equals("(")) {
                cont1 += 1;
            } else {
                cont2 += 1;
            }
            pilaSignos.pop();

            /*
             * else if(pilaSignos.peek().equals(")")){
             * cont2 += 1;
             * }
             */

        }

        return cont1 == cont2 ? true : false;
    }

    /*
     * Tarea: Iplementar todos los metodos de la clase vector
     * https://docs.oracle.com/javase/8/docs/api/java/util/Stack.htm
     * Realizar ejemplos practicos para validar su funcionamiento
     */
}
