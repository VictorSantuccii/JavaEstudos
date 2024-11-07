package javaClasse;

public class exportCarro {
    public static void main(String[] args) {

        // Corrigido para passar todos os parâmetros necessários
        Carro meuCarro = new Carro("Fusca", "Azul", 1975);
        Carro meuCarro1 = new Carro("Sandero", "Preto", 2020);
        Carro meuCarro2 = new Carro("Vectra", "Prata", 2008);

        // Chamando o método acelerar para cada carro
        meuCarro.acelerar();
        meuCarro1.acelerar();
        meuCarro2.acelerar();

        // Chamando o método exibirInfo para exibir as informações do primeiro carro
        meuCarro.exibirInfo();

        System.out.println( meuCarro2.getCor()); // Acessando o carro Prata

        meuCarro1.setCor("Rosa");

        System.out.println( meuCarro1.getCor()); // Pegando a cor do carro que eu acabei de mudar 

        // Se você quer visualizar o resultado do método `toString()`, precisa sobrescrever o método `toString()` na classe Carro
        System.out.println(meuCarro);  // Agora, isso mostrará a referência do objeto ou o resultado de toString(), se implementado

    }
}
