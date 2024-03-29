// CalculadoraDivZero.java
// Altere o exemplo anterior para que a calculadora exiba um erro caso seja feita uma divisão por zero.

package aula03;

import java.util.Scanner;

public class Exemplo07
{
    public static void main(String[] args)
    {
        Scanner iNum = new Scanner(System.in);  // Entrada para números
        Scanner iStr = new Scanner(System.in);  // Entrada para operador
        
        System.out.println("Digite uma expressao: ");
        double x = iNum.nextDouble();
        String s = iStr.nextLine();
        double y = iNum.nextDouble();

        char op = s.charAt(0); // Converte o operador de String para caracter
        switch (op)
        {
            case '+': System.out.println("Valor = " + (x+y)); break;
            case '-': System.out.println("Valor = " + (x-y)); break;
            case '*': System.out.println("Valor = " + (x*y)); break;
            case '/': if (y == 0)
                          System.out.println("Impossivel dividir por zero!");
                      else
                          System.out.println("Valor = " + (x/y)); break;
            default: System.out.println("Operador invalido: " + op); break;
        }
        iNum.close();
        iStr.close();
    }
}