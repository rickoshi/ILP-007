// Inverso.java
// Dado um número natural, exibir seus dígitos invertidos.
// Ex: 8315 => 5138
// Como? Divisão sucessiva por 10 (while n!=0).

package aula03;

import java.util.Scanner;

public class Exemplo08
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero natural:");
        int num = input.nextInt();

        while (num != 0)
        {
            System.out.println(num%10); // a cada repetição, mostra último digíto de "num"
            num = num/10;               // a cada repetição, "num" "perde" o último dígito 
        }

        input.close();
    }
}

/*
 * Repetição com precondição
 * while (condição) // Condição verdadeira para executar o comando
 * comando;         // Executado repetidamente
 */

/*
 * Exemplo para "num" = 1234
 * Repetição    1234%10      1234/10
 *    1°       output:4      num=123
 *    2°       output:3      num=12
 *    3°       output:2      num=1
 *    4°       output:1      num=0
 */