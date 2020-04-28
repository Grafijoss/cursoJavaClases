
public class SobrecargaConstructores {
    
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);
        System.out.println("persona = " + persona);
        
        Empleado empleado1 = new Empleado("Carla", 30, 4000); // ctrl + space para ver los constructores
        System.out.println("empleado1 = " + empleado1);
    }
    
}
