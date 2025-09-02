public class Main {
    public static void main(String[] args) throws Exception {
        // Arreglo de libros
        Libro[] libros = new Libro[5];

        libros[0] = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 20000.0);
        libros[1] = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 15000.0);
        libros[2] = new Libro("La Sombra del Viento", "Carlos Ruiz Zafón", 18000.0);
        libros[3] = new Libro("El Amor en los Tiempos del Cólera", "Gabriel García Márquez", 22000.0);
        libros[4] = new Libro("Ficciones", "Jorge Luis Borges", 12000.0);

        // Mostrar información de cada libro
        for (int i = 0; i < libros.length; i++) {
            libros[i].mostrarInfo();
        }
        System.out.println("-----------------------------------");
        System.out.println("El total a pagar de los libros es: " + libros[0].calcularPrecioTotal(libros));
        System.out.println("-----------------------------------");
        System.out.println("Libros con precio mayor a 15000:");
        System.out.println("-----------------------------------");
        Libro.filtrarPorPrecio(libros, 15000);

    }
}