package aula04;
import java.util.Scanner;

public class Exercicio08_Teste {
    public static void main(String[] args) {
        Exercicio08 cc1 = new Exercicio08(12345, "Joao da Silva", 0);
        cc1.verDados();
        
        Exercicio08 cc2;
        cc2 = new Exercicio08(54321, "Maria dos Santos", 500);
        cc2.verDados();
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.printf("\nValor para deposito em c1: ");
        double vlr = entrada.nextDouble();
        cc1.deposito(vlr);
        cc1.verDados();
        
        System.out.printf("\n Valor de saque em c2: ");
        cc2.saque(entrada.nextDouble());
        cc2.verDados();
        
    }
}
