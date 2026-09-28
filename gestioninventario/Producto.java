package gestioninventario;

public class Producto {
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;
  
    public Producto(String nombre, String codigo, double precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para vender unidades
    public void venderUnidades(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidades de " + nombre + ". Stock restante: " + stock);
        } else if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser mayor a cero.");
        } else {
            System.out.println("Error: stock insuficiente para vender " + cantidad + " unidades de " + nombre + ".");
        }
    }

    // Método para reponer stock
    public void reponerStock(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
            System.out.println("Reposición registrada: +" + cantidad + " unidades. Stock actual: " + stock);
        } else {
            System.out.println("Error: la cantidad a reponer debe ser mayor a cero.");
        }
    }

    // Método para actualizar precio usando 'this.precio' 
    public void actualizarPrecio(double precio) {
        double precioAnterior = this.precio;
        this.precio = precio;
        System.out.println("Precio actualizado de " + nombre + ": $" + precioAnterior + " -> $" + this.precio);
    }

    // Método para mostrar la ficha del producto
    public void mostrarFicha() {
        System.out.println("=== Ficha de producto ===");
        System.out.println("Código:  " + codigo);
        System.out.println("Nombre:  " + nombre);
        System.out.println("Precio:  $" + precio);
        System.out.println("Stock:   " + stock);
        System.out.println("==========================");
    }
}
