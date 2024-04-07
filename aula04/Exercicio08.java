/* Atividade - ContaCorrente
 * Atributos (variáveis de instância)
 * – Número da conta
 * – Titular
 * – Saldo
 * Métodos (operações/ tarefas)
 * – Construtor: inicializa titular, número da conta e saldo (sempre maior ou igual a zero);
 * – Depósito (atualizar saldo acrescido da quantia depositada);
 * – Saque (atualizar saldo decrescido da quantia sacada);
 * – Exibir dados da conta
 */

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
            System.out.println("\nValor de deposito invalido!");
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
            System.out.println("\nSaldo insuficiente!");
        }
        else
        {
            this.saldo = this.saldo - vlr;
        }
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
    
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void verDados()
    {
        System.out.printf("===============================\n");
        System.out.printf("Conta  : %07d\n", getConta());
        System.out.printf("Titular: %s\n", getTitular());
        System.out.printf("Saldo  : R$%.2f\n", getSaldo());
        System.out.printf("===============================\n");
    }
}