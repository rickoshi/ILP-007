/* MediaSalarial.java
 * 3. Faça um programa que leia e armazene o salário de uma amostra de 15 trabalhadores. 
 * Calcule a média salarial e indique a estatística de: quantas pessoas estão abaixo dessa média, quantas estão acima e quantas estão na média.
*/
package aula12;

import java.util.Scanner;

public class Exercicio03
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[15];
        double somaSalarios = 0;

        for (int i = 0; i < salarios.length; i++) 
        {
            System.out.print("Salario do trabalhador " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
            somaSalarios += salarios[i];
        }

        double mediaSalarial = somaSalarios / salarios.length;

        int abaixoMedia = 0, acimaMedia = 0, naMedia = 0;
        for (double salario : salarios)
        {
            if (salario < mediaSalarial)
                abaixoMedia++;
            else if (salario > mediaSalarial)
                acimaMedia++;
            else
                naMedia++;
        }

        System.out.println("Media dos salarios: " + mediaSalarial);
        System.out.println("Trabalhadores abaixo da media: " + abaixoMedia);
        System.out.println("Trabalhadores acima da media: " + acimaMedia);
        System.out.println("Trabalhadores na media: " + naMedia);
        scanner.close();
    }
}