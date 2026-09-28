package gestioninventario;
public class MainInventario {
    public static void main(String[] args) {
        Producto productoUno = new Producto("Teclado mecánico", "P-001", 45000.0, 12);
        Producto productoDos = new Producto("Mouse inalámbrico", "P-002", 18500.0, 25);
        Producto productoTres = new Producto("Monitor 24 pulgadas", "P-003", 160000.0, 7);

        //ficha del primer producto
        productoUno.mostrarFicha();

        //ventas y reposiciones
        productoUno.venderUnidades(3);
        productoUno.venderUnidades(50); // Caso de error por stock insuficiente
        productoUno.reponerStock(20);

        // Actualizamos el precio 
        productoUno.actualizarPrecio(39900.0);

        System.out.println();

        // Demostración de Aliasing 
        Producto copia = productoUno;
        copia.stock = 29;

        System.out.println("Stock de productoUno tras modificar copia: " + productoUno.stock + " (mismo objeto en el Heap)");
    }
}
