// Calculadora.java
// Uso da estrutura de decisão múltipla para implementar uma simples calculadora;
// O usuário digita uma expressão da forma "val1", "operador", "val2" e o programa fornece-lhe seu valor como resposta
// Os valores podem ser reais e os operadores aceitos são: +, -, * e /.

package aula03;

import java.util.Scanner;

public class Exemplo06
{
    public static void main(String[] args)
    {
        Scanner iNum = new Scanner(System.in);  // Entrada para números
        Scanner iStr = new Scanner(System.in);  // Entrada para operador
        
        System.out.println("Digite uma expressao: ");
        double x = iNum.nextDouble();
        String s = iStr.nextLine();
        double y = iNum.nextDouble();
        // Por possuir entradas seguidas, o user precisa utilizar a expressão adequadamente.

        char op = s.charAt(0); // Converte o operador de String para caracter
        switch (op)
        {
            case '+': System.out.println("Valor = " + (x+y)); break;
            case '-': System.out.println("Valor = " + (x-y)); break;
            case '*': System.out.println("Valor = " + (x*y)); break;
            case '/': System.out.println("Valor = " + (x/y)); break;
            default: System.out.println("Operador invalido: " + op); break;
        }
        iNum.close();
        iStr.close();
    }
}

/*
 * Estrutura de decisão múltipla
 * Usada quando precisamos escolher uma entre várias alternativas previamente definidas
 * 
 * switch(exp)
 * {
 *  case const1: comando1;
 *      break;
 *  case const2: comando2;
 *      break;
 *  ...
 *  case constn: comandon;
 *      break;
 *  default: comando;
 * }
 * 
 */