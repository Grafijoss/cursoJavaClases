public class PruebaAritmetica {
    
    // psvm
    // sout
    public static void main(String[] args) {
        
        // Variable local
        int operandoA = 6;
        int operandoB = 2;
        
        // Creamos un objeto de la clase aritmetica enviando argumentos
        Aritmetica objeto1 = new Aritmetica(operandoA, operandoB);
        
        // Imprimir valoresde lo operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
        
        // Imprimir resuoltado de suma
        System.out.println("\nResultado Suma + " + objeto1.sumar());
        
        // Imprimir resuoltado de suma
        System.out.println("\nResultado restar + " + objeto1.restar());
        
        // Imprimir resuoltado de suma
        System.out.println("\nResultado multiplicar + " + objeto1.multiplicar());
        
        // Imprimir resuoltado de suma
        System.out.println("\nResultado dividir + " + objeto1.dividir());
        
    }
}
