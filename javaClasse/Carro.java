package javaClasse;

// Definindo a classe Carro
public class Carro {

    // Atributos (ou variáveis de instância)
    private String modelo;
    private String cor;
    private int ano;

    // Construtor para inicializar os atributos
    public Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    // Sobrescrevendo o método toString() para exibir as informações de forma mais legível
    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Cor: " + cor + ", Ano: " + ano;
    }


    // Método para acelerar o carro
    public void acelerar() {
        System.out.println(modelo + " está acelerando!");
    }

    // Método para exibir informações do carro
    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    // Métodos getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
