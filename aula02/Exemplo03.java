// AdicaoVersao02.java
// Programa de adição que exibe a soma de dois numeros reais.

package aula02;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        double soma;

        System.out.print("Digite o primeiro numero: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo numero: ");
        num2 = input.nextDouble();

        soma = num1 + num2;

        System.out.printf("A soma e %5.2f\n", soma);

        input.close();
    }
}

/*
Tipos primitivos do Java
Tipo        Primitivo   Tamanho         Escala
Inteiro     byte        1 byte          -128 a 127
            short       2 bytes         -32.768 a 32.767
            int         4 bytes         2.147.483.648 e 2.147.483.647
            long        8 bytes         -9,223,372,036,854,775,808 e 9,223,372,036,854,775,807

Ponto       float       4 bytes         1.40239846e-46 e 3.40282347e+38
flutuante   double      8 bytes         4.94065645841246544e-324 e 1.7976931348623157e+308

Caractere   char        2 bytes         0 e 65535

Booleano    boolean     1 bit           false e true
*/

/*
Operadores aritméticos
Adição          +
Subtração       -
Multiplicação   *
Divisão         /
Resto/Módulo    %

Precedência
*, /, %
+, -
*/

/*
Formatação de reais
A saída padrão de um valor float/double possuirá muitas casas decimais. Podemos utilizar a formatação para melhor o aspecto visual.
O primeiro valor é o total de caracteres mínimo (parte inteira + vírgula + casas decimais)
O segundo valor é o número de casas decimais 

System.out.printf("A soma e %f\n", soma);
// A soma e 10,000000
// A soma e 0,600000

System.out.printf("A soma e %5.2f\n", soma);
// A soma e 10,00
// A soma e  0,60
*/