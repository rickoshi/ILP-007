// MediaEncadeada.java
// Faça um programa que leia as 2 notas de um aluno, calcule e exiba a média aritmética das notas e se o mesmo foi aprovado (M>=7),  reprovado (M < 4) ou está de recuperação (4<= M < 7). 
// Possível solução (Encadeada)

package aula03;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        double n1, n2, media;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite as duas notas: ");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        media = (n1 + n2) / 2;

        if (media >= 7)
            System.out.println("Aprovado com nota " + media);
        else if (media >= 4)
                System.out.println("Recuperacao com nota " + media);
            else
                System.out.println("Reprovado com nota " + media);

        entrada.close();
    }
}

/*
 * Operadores relacionais
 * Operador     Resultado
 *  x == y      V se x igual a y
 *  x != y      V se x diferente de y
 *  x < y       V se x menor que y
 *  x > y       V se x maior que y
 *  x <= y      V se x menor ou igual a y
 *  x >= y      V se x maior ou igual a y
 */

/*
 * Operadores lógicos
 * Operador     Resultado
 *   !x         V se x for falso
 *  x && y      V se x e y ambos verdadeiros
 *  x || y      V se x ou y (ou ambos) verdadeiros
 */

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