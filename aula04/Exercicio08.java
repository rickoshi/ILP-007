package aula04;

public class Exercicio08 
{
    private int conta;
    private String titular;
    private double saldo;
    
    public Exercicio08(int conta, String titular, double saldo)
    {
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void deposito(double vlr)
    {
        if (vlr <= 0)
        {
            System.out.println("Valor de deposito invalido!");
        }
        else
        {
            this.saldo = this.saldo + vlr;
        }
    }

    public void saque(double vlr)
    {
        if (vlr > this.saldo)
        {
            System.out.println("Saldo insuficiente!");
        }
        else
        {
            this.saldo = this.saldo - vlr
        }
    }

    public verDados()
    {
        System.out.println("Conta  : " + getConta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo  : " + getSaldo());
    }












    public int getConta() {
        return conta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}











