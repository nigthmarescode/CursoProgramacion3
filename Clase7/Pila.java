package Clase7;

//import java.util.Stack;

public class Pila {
    public static void main(String[] args) {

        /*
        //Creacion de una pila de numeros enteros
        Stack<String> pila = new Stack<>();

        //Verificar si la pila esta vacia .isEmpty()
        System.out.println(pila.isEmpty()); //true

        //Agregar elementos a la pila .push()
        pila.push("(");
        pila.push(")");
        pila.push("(");
        pila.push(")");

        //Imprimir la pila
        System.out.println("Pila: " + pila);

        //Mostrar el elemento que esta en el tope de la pila sin removerlo .peek()
        System.out.println("Elemento en el tope de la pila: " + pila.peek());

        //Remover el elemento que esta en el tope de la pila .pop()
        System.out.println("Elemento removido: " + pila.pop());

        //Imprimir la pila despues de remover el elemento del tope
        System.out.println("Pila despues de remover el elemento del tope: " + pila);

        //Buscar y mostrar la posicion del elemento dentro de la pila .search()
        System.out.println(pila.search(10));
        System.out.println(pila.search(9));
        System.out.println(pila.search(4));
        System.out.println(pila.search(8));
        System.out.println(pila.search(50));

        //Verificar si la pila esta vacia .isEmpty()
        System.out.println(pila.isEmpty()); //false
        */
        //Validar parentesis
        
        //Lamar el metodo para validar los parentesis
        OperacionesPila objOp = new OperacionesPila();
        String[] signos = {"(", "(", ")", ")"};

        System.out.println(objOp.validarParentesis(signos));
    }

}
