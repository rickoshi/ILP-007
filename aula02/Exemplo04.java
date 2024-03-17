// LeituraString.java
// Programa que lê e exibe cadeia de caracteres

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        String frase; // Não é um tipo primitivo

        System.out.println("Digite uma frase:");
        frase = input.nextLine();

        System.out.printf("A frase lida e %s\n", frase);
        input.close();
    }
}

/*
Entrada de cadeia de caracteres - String
Variável com o tipo String;
método da variável Scanner "nextLine()";
formato de saída String "%s";
*/