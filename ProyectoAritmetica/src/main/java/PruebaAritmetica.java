public class PruebaAritmetica {
    
    // psvm
    // sout
    public static void main(String[] args) {
        
        // Creamos un objeto de tipo aritmetica
        Aritmetica aritmetica = new Aritmetica();
        aritmetica.a = 10;
        aritmetica.b = 20;
        int resultado = aritmetica.sumar();
        System.out.println("resultado = " + resultado);
        
        Aritmetica aritmetica2 = new Aritmetica(8, 8);
        System.out.println("resultado2 = " + aritmetica2.sumar());
        
    }
}
