// MediaAlternativa.java
// Uma solução que testa 1º quem está reprovado, depois os aprovados, por último, de recuperação?

// reprovado:   media < 4
// aprovado:    media >= 7
// recuperação: 4 <= media < 7 

package aula03;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite as duas notas: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        media = (n1 + n2) / 2;

        if (media < 4) {
            System.out.println("Reprovado com nota: " + media);
        }
        else if (media >= 7) {
            System.out.println("Aprovado com nota: " + media);
        }
            else
                System.out.println("Recuperacao com nota: " + media);

        input.close();
    }
}

/*
 * Estrutura de decisão simples
 * if (condição)
 *     comando1;
 * else 
 *     comando2;
 * 
 * if( m >= 7.0 ) 
 *     System.out.println(“Aprovado”);
 * else 
 *     System.out.println(“Reprovado”);
 */

/*
 * Condicional aninhada
 * if( condição1 )
 *     if (condição2)
 *         Comando1;
 *     else
 *         Comando2;
 * else 
 *     Comando3;
 */

/*
 * Condicional encadeada
 * if( condição1 )
 *     Comando1;
 * else
 *     if (condição2)
 *         Comando2;
 *     else 
 *         Comando3;
 */
