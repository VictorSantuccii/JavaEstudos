package interfacesJava;

public class Golf implements Carro{

    @Override
    public void acelerar() {
        System.out.println("Acelerando a 50km/h");
        
    }

    @Override
    public void freiar() {
        System.out.println("Freando o Golf");
        
    }

    @Override
    public void parar() {
        System.out.println("Estacionando o Golf");
        
    }
    
}
