
public class Persona {

    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;
    
    private Persona() {
        // super(); // se manda a llamar automaticamente
        this.idPersona = ++contadorPersonas;
    }
    
    // constructor de sobrecarga
    public Persona(String nombre, int edad) {
        this(); // llamamos al constructos vacio
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    @Override
    public String toString() {
        return "Persona{" + " idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
