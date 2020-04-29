package matrices;

public class EjemploMatricesPrueba {

    public static void main(String[] args) {
        // 1. Declaramos una matriz de tipo int
        int edades[][];
        // 2.  Instanciamos la matriz de int
        edades = new int[3][2];
        // 3. Instanciar los valores a la matriz
        edades[0][0] = 30; 
        edades[0][1] = 15; 
        edades[1][0] = 20; 
        edades[1][1] = 45; 
        edades[2][0] = 5; 
        edades[2][1] = 38; 
        // 4. Imprimir valores
        System.out.println("edades en el indice 0 0 = " + edades[0][0]);
        System.out.println("edades en el indice 0 1 = " + edades[0][1]);
        
        // 1. Declaramos e instanciamos una matriz de tipo persona
        
        Persona padres[][] = new Persona[1][2];
        
        // 2. Vamos a inicializar valores
       
        padres[0][0] = new Persona("Alfredo");
        padres[0][1] = new Persona("Alicia");
        
        // 3. Imprimimos los valores
        
        System.out.println("padres indice 0 0 = " + padres[0][0].getNombre());
        System.out.println("padres indice 0 1 = " + padres[0][1].getNombre());
        
        for(int renglon = 0; renglon < padres.length; renglon++){
            for(int columna = 0; columna < padres[renglon].length; columna++){
                System.out.println("padres indice = " + renglon + "-" + columna + " columna es el nombre: " + padres[renglon][columna].getNombre() );
            }
        }
        
                
    }
}
