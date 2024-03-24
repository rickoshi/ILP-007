/* Atividade 06 - Caixa
Um comerciante precisa informatizar o caixa de sua loja. Codifique um programa que:
Leia uma série de valores correspondendo aos preços das mercadorias compradas por um cliente (o valor zero finaliza a entrada);
Calcule o valor total;
Aplique o desconto conforme tabela ao lado;
Mostre o valor a ser pago pelo cliente.
*/

package aula03;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0, soma  = 0;
        // Uma variável para receber o input (A cada loop receberá um valor diferente) e uma variável para armazenar e somar com o valor anterior

        System.out.println("Digite os valores de cada item. Ao digitar \"0\", a entrada dos valores sera finalizada");
        do {
            total += soma;
            soma = input.nextDouble();
        }
        while (soma != 0);

        /*
         * Tabela de desconto:
         *    Total           Desconto      Total (%)
         *  < R$50,00            5%           95%
         * <= R$100,00          10%           90%
         * <= R$200,00          15%           85%
         *  > R$200,00          20%           80%
         */
        double desconto = (total < 50 ? 0.95 :
            (total <= 100 ? 0.90 :
                (total <= 200 ? 0.85 : 0.80)));
        // O programa faz uso do operador ternário, porém condições if-else também podem ser usadas

        System.out.printf("Valor total = R$%.2f\n", total);
        System.out.printf("Desconto = %.0f%%\n", (desconto*100));
        System.out.printf("Valor total com desconto = R$%.2f\n", total * desconto);

/* Condição if-else que atribui os valores a variável "desconto" de acordo com a condição do valor "total"
if (total < 50) {
    desconto = 0.95;
}
    else if (total <= 100){
        desconto = 0.90;
    }
        else if (total <= 200) {
            desconto = 0.85;
        }
        else 
            desconto = 0.80;
*/
        input.close();
    }
}