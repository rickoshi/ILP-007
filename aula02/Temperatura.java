// Atividade 1 - Temperatura
// Faça um programa em Java que leia uma temperatura em Fahrenheit, calcule e exiba seu valor em Celsius. 
// Fórmula: C = (F-32) * 5 / 9.

import java.util.Scanner;

public class Temperatura { 
    public static void main(String arts[]) {
        Scanner input = new Scanner(System.in);
        double celcius;
        double fahrenheit;

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        fahrenheit = input.nextFloat();

        celcius = (fahrenheit-32) * 5.0 / 9.0;

        System.out.printf("A temperatura em graus Celcius e %.2f", celcius);
        input.close();
    }
}
