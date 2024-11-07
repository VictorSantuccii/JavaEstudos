package abstratasJava;

public abstract class SerVivo {
    protected int idade;

    public SerVivo(int idade){
        this.idade = idade;
    }
    
    public abstract void respirar(); // Método que não terá implementação e será vazio

    public void dormir(){  // Método com implementação 
        System.out.println("Dormindo...");
    }
}
