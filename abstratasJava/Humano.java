package abstratasJava;

public class Humano extends SerVivo{

    public Humano(){
        super(42);
    }
    @Override
    public void respirar() {  // Aqui na chamada da nossa classe abstrata, só precisaremos chamar o método respirar, já quje o método dormir já está implementado
        System.out.println(this.idade);
        System.out.println("Inalando e exalando CO2 e Oxigênio");
        
    }
    
}
