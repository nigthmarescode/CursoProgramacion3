public class Libro {
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Precio: $" + precio);
    }

    public double getPrecio() {
        return precio;
    }

    public double calcularPrecioTotal(Libro[] libros) {
        double total = 0.0;
        for (int i = 0; i < libros.length; i++) {
            total += libros[i].getPrecio();
        }
        return total;
    }

    public static void filtrarPorPrecio(Libro[] libros, double valor) {
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getPrecio() > valor) {
                libros[i].mostrarInfo();
            }
        }
    }

}