package interfacesJava;

import abstratasJava.Humano;
import abstratasJava.SerVivo;

public class Main {
    
    public static void main(String[] args){
        Carro meuCarro = new Astra();  // a const meuCarro é do tipo Carro e instancia a classe Astra
        Carro meuCarro2 = new Golf();

        SerVivo meuHumano = new Humano(); // estou criando uma const meuHumano que é do tipo serVivo e instancia a minha classe Humano, que usa o contrato da classe abstrata SerVivo

        Carro meuCarrinho = null;


        // Tratamento de exceção no Java 
        // NullPointerException
        // ArrayIndexOutOfBoundsException
        // RuntimeException
        // IOException 

        try {
            meuCarrinho.acelerar();
            
        } catch (NullPointerException err) {
            System.out.println("O carro está furado e não possui nada");
        }

    }

}
