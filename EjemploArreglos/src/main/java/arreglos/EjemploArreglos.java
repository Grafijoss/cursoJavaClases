package arreglos;

public class EjemploArreglos {

    public static void main(String[] args) {
        // 1. Declarar una variavle de tipo arreglo, arreglo0 de int
        int edades[];

        // 2. Vamos a  instanciar el arreglo de int
        edades = new int[3];

        // 3. Inicializamos los valores de los elementos de los arreglos
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        // 4. Imprimimos los valores
        System.out.println("arreglo enteros indice 0 = " + edades[0]);
        System.out.println("arreglo enteros indice 1 = " + edades[1]);
        System.out.println("arreglo enteros indice 2 = " + edades[2]);

        // 1. Declarar un arreglo de tipo Object
        Persona personas[] = new Persona[4];

        // 3. Inicializamos los valores de los elementos de los arreglos
        personas[0] = new Persona("Juli");
        personas[1] = new Persona("Juan");
        personas[2] = new Persona("Jose");
        personas[3] = new Persona("Jorge");

        // 4. Imprimimos los valores
        System.out.println("arreglo personas indice 0 = " + personas[0].getNombre());
        System.out.println("arreglo personas indice 1 = " + personas[1].getNombre());
        System.out.println("arreglo personas indice 2 = " + personas[2].getNombre());
        System.out.println("arreglo personas indice 3 = " + personas[3].getNombre());
        
        // Arreglo utilizando notación simplificada
        
        String familia[] = {"Alicia", "Alfredo", "Juliana", "Juan", "Jose", "Jorge"};
        
        for(int i = 0; i < familia.length; i++) {
            System.out.println("Este es el indice = " + i + " del nombre " + familia[i]); 
        }

    }

}
