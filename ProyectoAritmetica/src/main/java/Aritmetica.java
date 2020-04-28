public class Aritmetica {
    
    int a;
    int b;
    
    public Aritmetica() {  // El constructor debe llamarse igual que la clase
        
        System.out.println("Ejecutando el constructor vacio");
    }
    
    public int sumar() {
        int resultado = a + b;
        return resultado;
    }
}
