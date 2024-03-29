// InversoVersao2.java
// Esta solução funciona corretamente?
// Problemas...
// Se n for negativo? Validar entrada...
// E se n for igual a zero? Usar a repetição com pós-condição.

package aula03;

import java.util.Scanner;

public class Exemplo09
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;  // Variável declarada fora do bloco de repetição. Global: pode ser utilizada em toda a função main, mas outras funções podem alterar seu valor
        do  // Repetição para validar entrada. Enquanto a entrada for menor que 0, o sistema pedirá outra
        {
            System.out.println("Digite um numero natural:");
            num = input.nextInt();
        } while(num<0);

        do // Repetição para exibir o último dígito e atribuir uma divisão por 10 para variável "num"
        {
            System.out.println(num%10); // Sempre exibirá um valor, mesmo que seja 0
            num /= 10;      // Operador de atribuição aritmético. num = num / 10
        } while(num!=0);
        input.close();
    }
}

/* 
 * Repetição com pós-condição.
 * do
 * {
 *    <bloco de instruções> ...
 * } while (<condição>);
*/

// Pode ser estranho para especificar a condição após a execução de instruções, porém o processo é intuitivo. Sempre se executa a instrução pelo menos 1 vez antes de tudo, depois verifica se a condição é verdadeira