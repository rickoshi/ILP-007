// FatorialUsandoFor.java
// Fatorial usando FOR

package aula03;

import java.util.Scanner;

public class Exemplo11 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, i, f = 1;
        do
        {
            System.out.println("Digite um numero n >= 0:");
            n = input.nextInt();
            input.close();
        } while(n<0);

        for(i = n; i > 0; i--)
            f *= i; // *= é a própria variável multiplicada por outro valor
        System.out.println("Fatorial: " + f);
    }
}

/*
 * Repetição com contador
 * for (inicialização; condição; alteração)
 * {
 *   comando;
 * }
 * 
 * inicialização:   Atribui valor inicial ao contador
 * condição:        verifica se a contagem continua ou chegou ao fim
 * alteração:       modifica o valor do contador
 */

/* 
 * Se "for" for usado sem {}, é atribuido apenas um comando para o laço
 * for (inicialização; condição; alteração)
 *   comando1; comando2; comando3
 * Apenas o comando1 será repetido, o comando2 e comando3 serão executados apenas uma vez
 * 
 * for (inicialização; condição; alteração)
 *   {comando1; comando2;} comando3
 * O comando1 e comando2 serão executados repetidamente, e o comando3 unicamente
 */

/*
 * Operadores Incremento e Decremento
 * x = x + 1;  ➔ x++;  ou ++x;
 * x = x - 1;  ➔ x--;  ou --x
 * Diferenças são percebidas quando usamos este operador dentro de expressões:
 * – Forma prefixa: a variável é alterada antes de ser usada na expressão;
 * – Forma posfixa: a variável é alterada depois de ser usada na expressão;
 * 
 * Exemplo
 * Supondo x = 5, a expressão y = ++x; seria equivalente a:
 * x = x + 1 = 6
 * y = x = 6
 * Caso a expressão fosse y = x++; com x=5, teríamos:
 * y = x = 5
 * x = x + 1 = 6
 */