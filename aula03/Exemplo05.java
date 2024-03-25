// AbsolutoTernario.java
// Exemplo de operador condicional ternário
// Dado um número real n, imprimir seu valor absoluto (módulo) usando operador condicional ternário.

package aula03;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double n = input.nextDouble();

        System.out.println("Modulo de n = " + (n<0 ? -n : n));
        input.close();
    }
}

/* 
 * Operador condicional ternário
 * Representar decisões simples de maneira mais compacta
 * 
 * Sintaxe:
 * condição ? expressão1 : expressão2
 * 
 * Avalia a condição;
 * se for verdadeira, o resultado é o valor da expressão1;
 * senão, o resultado é o valor da expressão2.
 */