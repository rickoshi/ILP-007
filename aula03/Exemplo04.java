// Absoluto.java
// Exemplo de condicional simples
// Dado um número real n, imprimir seu valor absoluto (módulo).

package aula03;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double n = input.nextDouble();  // Na declaração a variável também pode ser iniciada com input

        if (n < 0) {
            n = -n;
        }
        System.out.println("Modulo de n = " + n);
        input.close();
    }
}