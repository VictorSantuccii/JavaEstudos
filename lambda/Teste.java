package lambda;

public class Teste {

    interface FactorialNumber {
        
        boolean test( int a, int b);
    }

    interface IsEven {
        boolean test(int n);
    }
    
    public static void main(String[] args) {

        IsEven isEven = (n) -> n % 2 == 0;

        int numero = 4;

        FactorialNumber isFactor = (a, b) -> (b % a)  == 0;

        if (isEven.test(numero)) {
            System.out.println(numero + " é par");
        } else {
            System.out.println(numero + " não é par");
        }
       if (isFactor.test(9, 5)){
        System.out.println("5 é fator de 9");
       }
       else {
        System.out.println("5 não é fator de 9");
       }
    }

    
}
