package ventas;

// import com.joss.ventas.Producto;
import com.joss.ventas.*; // Importamos todas las clases del paquete de ventas
import java.util.Date; // Importamos la clase Date

public class Ventas {

    public static void main(String[] args) {
        // Crear varios objetos de tipo producto
        Producto producto1 = new Producto("Camisa", 50, new Date()); // Crtl + space Genera automaticamente los atributos
        Producto producto2 = new Producto("Pantalon", 100, new Date());
        
        // Creamos un objeto de tipo orden
        Orden orden1 = new Orden();
        // Agregamos los productos a la orden
        orden1.agregarProducto(producto1); // Orden recibe como argumento un objeto de tipo Producto
        orden1.agregarProducto(producto2);
        
        // Imprimir esta orden
        orden1.mostrarOrden();
        
    }
}
