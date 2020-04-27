
public class PruebaPersonas {
    // sout

    public static void main(String[] args) {

        // Creación de un objeto de tipo persona
        Persona persona1;

        // Instanciando (creando) in objeto de tipo persona;
        persona1 = new Persona();
        
        // Accedemos almetodo desplegar nombres de la clase persona
        persona1.desplegarNombre();
        
        // Modificamos los valores de los atributos
        persona1.nombre = "Claudia";
        persona1.apellido = "Rios";
        
        System.out.println("");
        
        // Volvemos a imprimir los valores
        persona1.desplegarNombre();
        
        System.out.println("");
        
        Persona persona2 = new Persona();
        persona2.nombre = "Jose";
        persona2.apellido = "Montenegro";
        
        persona2.desplegarNombre();
        
        
        

    }
}
