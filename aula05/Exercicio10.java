/*
* Ativ.: Conta Corrente com Limite de Cheque Especial
* Altere a classe conta corrente considerando um novo atributo: Limite
* Considere este atributo no construtor da classe;
* Durante a operação de saque atualize saldo considerando que:
* – Só é permitido sacar se a quantia estiver dentro do saldo mais limite do cliente;
* – Caso a quantia não esteja coberta pelo limite, informe que não foi possível realizar o saque por falta de recursos;
* 
* Sobrecarga:
* – Codifique um segundo construtor que receba número da conta, titular e saldo. Neste caso, o Limite padrão é de R$1000,00.
* – Codifique um terceiro construtor que receba apenas o número da conta e titular. Neste caso, saldo e limite devem ser inicializados com 0
*/

package aula05;

public class Exercicio10
{
    // Atributos da classe
    private int conta;
    private String titular;
    private double saldo;
    private double limite;
    
    // Métodos construtores
    public Exercicio10(int conta, String titular, double saldo, double limite)
    {
        setConta(conta);
        setTitular(titular);
        setSaldo(saldo);
        if (limite < 0) {
            System.out.println("Limite invalido");
            this.limite = 0;
        }
        else {
            this.limite = limite;
        }
    }

    public Exercicio10(int conta, String titular, double saldo)
    {
        setConta(conta);
        setTitular(titular);
        setSaldo(saldo);
        this.limite = 1000;
    }

    public Exercicio10(int conta, String titular)
    {
        setConta(conta);
        setTitular(titular);
        this.saldo = 0;
        this.limite = 0;
    }

    // Setters
    private void setConta(int conta)
    {
        if (conta < 0){
            System.out.println("Numero de conta invalido!");
        }
        else {
        this.conta = conta;
        }
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    private void setSaldo(double saldo)
    {
        if (saldo < 0)
        {
            System.out.println("\nSaldo invalido!");
            this.saldo = 0.0;
        }
        else
        {
            this.saldo = saldo;
        }
    }

    // Getters
    public int getConta() {
        return conta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    // Métodos da classe
    public void deposito(double vlr)
    {
        if (vlr < 0)
        {
            System.out.println("\nValor de deposito invalido!");
        }
        else
        {
            this.saldo = this.saldo + vlr;
        }
    }

    public void saque(double vlr)
    {
        if (vlr < 0) {
            System.out.println("\nValor inválido!");
        }
        else if (vlr <= this.saldo) {
            this.saldo = this.saldo - vlr;
        }
            else if (vlr > this.saldo && vlr <= this.saldo + this.limite) {
                vlr = vlr - this.saldo;
                this.saldo = 0;
                System.out.printf("\nLimite usado: R$%.2f\n", (getLimite() - getLimite() + vlr));
                this.limite = this.limite - vlr;
            }
                else {
                    System.out.println("\nNao foi possivel realizar o saque por falta de recursos!");
                }
    }

    public void verDados()
    {
        System.out.printf("===============================\n");
        System.out.printf("Conta  : %07d\n", getConta());
        System.out.printf("Titular: %s\n", getTitular());
        System.out.printf("Saldo  : R$%.2f\n", getSaldo());
        System.out.printf("Limite : R$%.2f\n", getLimite());
        System.out.printf("===============================\n");
    }
}