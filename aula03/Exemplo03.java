// MediaAninhada.java
// Como fazer uma solução aninhada? Qual seria a 1ª condição a ser testada?

// reprovado:       media < 4
// aprovado:        media >= 7
// recuperação:   4 <= media < 7

package aula03;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite as duas notas: ");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        media = (n1 + n2) / 2;

        if (media > 4) {
            if (media >= 7) {
                System.out.println("Aprovado com nota: " + media);
            }
            else
            System.out.println("Recuperacao com nota: " + media);
        }
        else 
        System.out.println("Reprovado com nota: " + media);

        input.close();
    }
}

// Para fazer uma condicional aninhada, é necessário inverter o sinal, para que a primeira condição também satisfaça as outras duas
// É possível fazer a aninhção tanto para a condição de reprovado (> 4) quando para aprovado (<= 7), porém o mesmo não acontece para recuperação, visto que sua condição precisa satisfazer dois valores, que são opostos (aprovação alto e reprovação baixo)
// Ex: Ambos valores de aprovação/recuperação possuem nota maior/igual que 4, e sendo media um desses valores, a condição é true e o if-else fica aninhado. Dentro da condição aninhada, será testado entre a aprovação ou recuperação

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