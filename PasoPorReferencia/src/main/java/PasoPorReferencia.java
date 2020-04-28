
public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona = new Persona();
        
        persona.nombre = "Jose";
        System.out.println("Valor nombre = " + persona.obtenerNombre());
        
        modificarPersona(persona);
        
        System.out.println("Valor modificado = " + persona.obtenerNombre());
        
        
    }

    private static void modificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Claudia");
    }
}
