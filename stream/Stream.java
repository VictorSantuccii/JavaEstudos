package stream;

import java.util.Arrays;
import java.util.List;

public class Stream {
    
    public static void main (String[] args ){

        // Lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usando Stream API para filtrar e imprimir números pares
        numeros.stream()
                .filter(n -> n % 2 == 0) // Filtra apenas os números pares
                .forEach(System.out::println); // Imprime cada número par

    }

    /*  É importante relembrar que utilizamos esse :: para evitar de fazer uma função
    lambda apenas para referenciarmos nosso método de System.out.println, dessa forma:
    
        .forEach(item -> System.out.println(item)); 
        

    */

    
}
