package com.joss.ventas;

public class Orden {

    private int idOrden;
    private Producto productos[]; // El arreglo es de objetos de tipo Producto
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10; // Final es una constante debe estar en mayusculas

    public Orden() {
        this.idOrden = ++contadorOrdenes; // Primero le asigna el valor a idOrden y depues suma en 1 contadorOrdenes
        // Inicializamos el arreglo
        productos = new Producto[MAX_PRODUCTOS];
        // MAX_PRODUCTOS Es el maximo de items que puede tener el arreglo puede tener menos
        // Los itemes a los que no se les asigne un valor tendran un valor por defecto dependiendo el tipo
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS) {
            productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos: " + MAX_PRODUCTOS);
        }

    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i]; // Los elementos del arreglo son de tipo Producto
            total += producto.getPrecio(); // Total = total + producto.getPrecio()
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Total de la orden: $" + this.calcularTotal());
        System.out.println("Productos de la orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]); // El metodo toString retorna las variables de la clase sin invocarlo
        }
    }

}
