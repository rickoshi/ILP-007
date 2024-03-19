// Atividade 04 - Triângulo
// Dados 3 valores, verifique se os mesmos formam um triangulo ou não. Caso afirmativo, informe se é escaleno, isósceles ou equilátero.

package aula03;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double v1, v2, v3;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        v1 = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        v2 = input.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        v3 = input.nextDouble();


        if (v1 + v2 > v3 && v1 + v3 > v2 && v2 + v3 > v1){
            System.out.print("Triangulo ");
            if (v1 == v2 && v1 == v3 && v2 == v3)
                System.out.print("equilatero");
            else
                if (v1 == v2 || v1 == v3 || v2 == v3)
                    System.out.print("isósceles");
                else
                    System.out.print("escaleno");
                }   // Essas chaves são muito importantes, elas agrupam o bloco aninhado inteiro.
        else
            System.out.println("Nao e trinangulo");
        input.close();
    }
}