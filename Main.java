import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello World");
        int minhaIdade = 20;
        String meuNome = "Víctor Santucci";
        var meuApelido = "Santtzx";

       // tipoVariável nomeDaVariável = valorVariável

       // TIpos primitivos dentro do Java 
       // números inteiros = 100, 200, 300, 9797, 9696, 0109 ( byte, short, int, long )
       // números decimais = float e double
       // cadeia de caracteres = char e string
       // valor verdadeiro ou falso = boolean 
    
       byte numero1 = 124;
       short numero2 = 255;
       String str = "Víctor";

       // Condicional

       if ( str.isBlank() ) {
        System.out.println("Verdadeiro");
      }
      else if ( str == "Fernanda" ) {
         System.out.println("Verdadeiro");
      }
      else {
       System.out.println("Falso");
      }


      // Array estático

      int[] colecaoDeInteiros = {1, 2, 3, 4, 5, 6}; 

      System.out.println(colecaoDeInteiros[0]);

      int[] meusNumeros = new int[30]; 


      // ArrayList

      ArrayList<String> nomes = new ArrayList<>();
      nomes.add("Víctor");

      System.out.println(nomes.get(1)); // Pegar o determinado índice

      nomes.remove(0);
      nomes.remove("Víctor"); // Pegar o objeto pelo valor   


      // Loops 

      // For convencional

      for( int i = 0; i < nomes.size(); i++ ) {
        System.out.println(nomes.get(i));
      }

      // For que itera diretamente sobre os valores

      for (String nome : nomes) {
        System.out.println(nome);
      }

      // Loop e repetição While 

      int contador = 0;

      while(contador < 10 ){
        System.out.println("Estou no While");
         contador++;
    } 

    // Casting ( mudança de tipos em Java)

        double resultado = 0.0; 

        int resultadoInt = (int) resultado;


        int meuInt = 10;
        double meuDouble = meuInt;

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString);

        // Transformando uma String em um inteiro 


        // Para compilação de códigos em Java 

        // comando no terminal: javac ( nome do arquivo ) => javac Main.java
        // rodar o código compilado: java Main ( nome do arquivo )

       
    

    }
 
}





