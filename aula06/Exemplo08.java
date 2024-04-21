// NotasTurma.java
// Recebe valores de entrada e armazena as notas em arrays que estão contidas em arrays de alunos

package aula06;

import java.util.Scanner;

public class Exemplo08
{
    public static void main(String[] args)
    {
        final int ALUNOS = 5;
        final int PROVAS = 2;

        int lin, col;
        double media;

        double[][] notas = new double[ALUNOS][PROVAS];
        Scanner entrada = new Scanner(System.in);

        for (lin = 0; lin < ALUNOS; lin++)
        {
            System.out.printf("Digite as notas do %do aluno: ", lin+1);
            for (col = 0; col < PROVAS; col++) 
                notas[lin][col] = entrada.nextDouble();
        }

        System.out.println();
        System.out.println("Notas e media");

        for (lin = 0; lin < ALUNOS; lin++)
        {
            System.out.printf("\nAluno %d:", lin+1);
            media = 0;
            for (col = 0; col < PROVAS; col++)
            {
                System.out.printf(" %2.2f |", notas[lin][col]);
                media += notas[lin][col];
            }
            System.out.printf("  Media %2.2f ", media/PROVAS);
        }
    }
}