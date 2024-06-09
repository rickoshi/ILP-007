// Caso 2 - Captura de exceção sem tratamento
// TesteException02.java
// Uso dos blocos blocos try{} e catch(){}
// O bloco catch(){} fica vazio, e por isso o erro não é tratado

package aula14;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        int a, b, c;
        try {
            System.out.println("Digite dois valores:");
            Scanner entrada = new Scanner(System.in);
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = a / b;
            System.out.println("c = " + c);
            entrada.close();
        }
        catch (Exception e) 
        {

        }
        
        /*
         * Digite dois valores:
         * 12
         * 2
         * c = 6
         * 
         * Digite dois valores:
         * a
         * 
         * Digite dois valores:
         * 1
         * 0
         */

        // Não há nenhuma mensagem de erro, o programa apenas para a execução
        // Captura mas não trata
    }
}

/*
 * Captura de exceção sem tratamento
 * try{
 * ... Bloco de código
 * }
 * catch ( Exception e) {
 * deixar em branco
 * }
 */