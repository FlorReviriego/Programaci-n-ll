package biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
      
        // Creamos libros probando ambos constructores y un dato inválido (título vacío)
        Libro libro1 = new Libro("", "Robert C. Martin", "9780132350884");
        Libro libro2 = new Libro("Efectivo con Java", "Ana Restrepo", "9781234567897", 3, 22000.0);
        Libro libro3 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "9780307474728", 2, 18500.0);

        // Probamos el setter con un valor inválido (-100.0)
        libro1.setPrecioReposicion(-100.0);

        System.out.println();

        // Mostramos la ficha de cada libro en su propia variable
        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        // Probamos las operaciones de préstamo y devolución
        libro1.prestar();  // Éxito (tenía 1 copia, queda en 0)
        libro1.prestar();  // Falla porque ya no hay copias (devuelve false)
        libro1.devolver(); // Devuelve la copia

        // Actualizamos precio de forma válida e imprimimos el cambio
        double precioAnterior = libro1.getPrecioReposicion();
        if (libro1.setPrecioReposicion(18000.0)) {
            System.out.println("Precio de reposición actualizado de \"" + libro1.getTitulo() + "\": $" + precioAnterior + " -> $" + libro1.getPrecioReposicion());
        }
    }
}
