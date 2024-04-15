package aula05;

public class Exercicio10_Teste 
{
    public static void main(String[] args) 
    {
        Exercicio10 cc1, cc2, cc3;
        // Contrutor completo
        cc1 = new Exercicio10(1234567, "Alejandro", 1000, 200);
        cc1.verDados();

        // Construtor com número da conta, titular e saldo. Limite padrão de R$1000,00.
        cc2 = new Exercicio10(7654321, "Fernando", 2000);
        cc2.verDados();

        // Construtor com número da conta e titular. Saldo e limite inicializados com 0.
        cc3 = new Exercicio10(1357246, "Roberto");
        cc3.verDados();

        cc1.saque(100);
        cc1.verDados();
        cc1.saque(1000);
        cc1.verDados();
        cc1.saque(100);
        cc1.verDados();
        cc1.saque(100);
        cc1.verDados();
    }
}

/*
 * Saída
 * ===============================
 * Conta : 1234567
 * Titular: Alejandro
 * Saldo : R$1000,00
 * Limite : R$200,00
 * ===============================
 * ===============================
 * Conta : 7654321
 * Titular: Fernando
 * Saldo : R$2000,00
 * Limite : R$1000,00
 * ===============================
 * ===============================
 * Conta : 1357246
 * Titular: Roberto
 * Saldo : R$0,00
 * Limite : R$0,00
 * ===============================
 * ===============================
 * Conta : 1234567
 * Titular: Alejandro
 * Saldo : R$900,00
 * Limite : R$200,00
 * ===============================
 * 
 * Limite usado: R$100,00
 * ===============================
 * Conta : 1234567
 * Titular: Alejandro
 * Saldo : R$0,00
 * Limite : R$100,00
 * ===============================
 * 
 * Limite usado: R$100,00
 * ===============================
 * Conta : 1234567
 * Titular: Alejandro
 * Saldo : R$0,00
 * Limite : R$0,00
 * ===============================
 * 
 * Nao foi possivel realizar o saque por falta de recursos!
 * ===============================
 * Conta : 1234567
 * Titular: Alejandro
 * Saldo : R$0,00
 * Limite : R$0,00
 * ===============================
 */