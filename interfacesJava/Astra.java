package interfacesJava;

public class Astra implements Carro {

    @Override
    public void acelerar() {
        System.out.println("Acelerando a 50km/h");
        
    }

    @Override
    public void freiar() {
        System.out.println("Freando o Astra");
        
    }

    @Override
    public void parar() {
        System.out.println("Estacionando o Astra");
    }
    
}
