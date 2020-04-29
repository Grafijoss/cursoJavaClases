package com.joss.ventas;

import java.util.Date;

public class Producto {

    // las variables estaticas solo se modifican por medio de metodos
    private int idProducto;
    private String nombre;
    private Date fechaOrden;

    public Date getFechaOrden() {
        return fechaOrden;
    }
    private double precio;
    private static int contadorProductos;
    // Las variables estaticas se leen primero que las dinamicas
    // Las variables estaticas perteneces solo a la clase no al objeto

    // Constructor vacio
    private Producto() {
        // Asignamos el valo a la variable estatica
        this.idProducto = ++contadorProductos; // Primero se asigna el valor y despues suma uno al contadorProductos
    }

    // Constructor de sobrecarga con dos argumentos
    public Producto(String nombre, double precio, Date fechaOrden) {
        this(); // Iniciamos el constructor privado sin argumentos
        this.nombre = nombre;
        this.precio = precio;
        this.fechaOrden = fechaOrden;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    /* Este metodo se llama en el constructor privado al inciar la clase
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
     */
    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    // este metodo retorna la información de todas las variables de la clase 
    @Override // Sobreescribe toString que se hereda de la clase object
    public String toString() {
        return "Producto{" + "idProducto= " + idProducto + ", nombre= " + nombre + ", precio= " + precio + ", fechaOrden= " + fechaOrden + '}';
    }

}
