public class Aritmetica {
    
    int a;
    int b;
    
    public Aritmetica() {  // El constructor vacio es obligatorio si hay uno con argumentos
        
        System.out.println("Ejecutando el constructor vacio");
    }
    
     public Aritmetica(int arg1, int arg2) {  // Con argumentos
         
        a = arg1;
        b = arg2;
        System.out.println("Ejecutando el constructor con argumentos");
    }
    
    public int sumar() {
        int resultado = a + b;
        return resultado;
    }
}
