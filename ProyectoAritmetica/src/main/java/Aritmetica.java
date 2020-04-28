public class Aritmetica {
    
    int a;
    int b;
    
    public Aritmetica() {  // El constructor vacio es obligatorio si hay uno con argumentos
        
        System.out.println("Ejecutando el constructor vacio");
    }
    
     public Aritmetica(int a, int b) {  // Con argumentos
         
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando el constructor con argumentos");
    }
    
     /*
    public int sumar() {
        int resultado = a + b;
        return resultado;
    }
    */
     
    public int sumar() {
      return this.a + this.b;
    }
    
    public int restar() {
      return this.a - this.b;
    }
    
    public int multiplicar() {
      return this.a * this.b;
    }
    
    public int dividir() {
      return this.a / this.b;
    }
}
