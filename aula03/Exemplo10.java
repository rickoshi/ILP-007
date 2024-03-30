// Fatorial.java
// Dado um número natural, exibir seu fatorial.
// n! = n* (n-1) * (n-2) * (n-3) * ... * 2 * 1 

package aula03;

import java.util.Scanner;

public class Exemplo10
{
    public static void main(String[] args)
    {        
        Scanner input = new Scanner(System.in);
        int numero, contador, fatorial = 1;     // Variáveis são inicializadas para poderem receber seus próprios valores mais tarde
        do
        {   // Repetição para validar entrada
            System.out.println("Digite um numero n >= 0:");
            numero = input.nextInt();
        } while(numero<0);
        contador = numero;

        while (contador > 0) {
            fatorial = fatorial * contador;
            contador = contador - 1;
        }
        System.out.println("Fatorial: " + fatorial);
        input.close();
    }
}

/*
 * Valores das variaveis conforme execução (numero = 4)
 * numero   contador    fatorial                Instrução
 *   1         1           1            numero, contador, fatorial = 1;
 *   4         1           1            numero = input.nextInt();
 *   4         4           1            contador = numero;
 *   4         3           4            fatorial = fatorial * contador; contador--;
 *   4         2          12            fatorial = fatorial * contador; contador--;
 *   4         1          24            fatorial = fatorial * contador; contador--;
 *   4         0          24            fatorial = fatorial * contador; contador--;
 */

// Uma variável (numero) recebe a entrada do usuário e se manterá com esse mesmo valor até o fim. Em outras operações ou funções, o valor pode mudar se as entradas forem constantes
// Outra variável (contador), de controle/contadora, define a quantidade de vezes que o laço será executado. Nesse caso, a cada repetição seu valor é reduzido em 1, até a condição mínima (contador>0)
// A ultima variável (fatorial), acumuladora, recebe os valores e os adiciona/multiplica a cada repetição

/*
 * Uso de duas variáveis para o fatorial
 * A variável "a" recebe a entrada e atua como controle, e "b" é acumuladora e recebe o total
 * int a, b = 1;
 * a = input.nextInt();
 * while(a>0)
 * {
 *   b = b * a;
 *   a--;
 * }
 * System.out.printf("a = %d, b = %d", a, b);
 * 
 * // No final, a variável "a" é zerada
 * Input
 * 4
 * Output
 * a = 0, b = 24
 */