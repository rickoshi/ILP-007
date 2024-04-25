/*
 * Atividade – Média da Turma
 * Altere o programa anterior, de modo que o mesmo calcule a média da turma.
 * Durante a impressão das notas, além de exibir a média de cada aluno, deve ser informado se o aluno ficou, acima, abaixo ou na média da turma.
 * Exemplo:
 * –  Supondo que a média da turma seja 8.2:
 * – Aluno 1:    6.0    10.0  –  Média: 8.0 – Abaixo da média
 * Se necessário, altere as dimensões do array.
 */

package aula06;

import java.util.Scanner;

public class Exercicio11
{
    public static void main(String[] args)
    {
        final int ALUNOS = 5;
        // Dimensão do array alterada para comportar a média de cada aluno
        final int PROVAS = 3;

        int lin, col;
        double media;
        double mediaTurma = 0;

        double[][] notas = new double[ALUNOS][PROVAS];
        Scanner entrada = new Scanner(System.in);

        // Entrada de valores das notas
        for (lin = 0; lin < ALUNOS; lin++)
        {
            media = 0;
            System.out.printf("Digite as notas do aluno %d: ", lin+1);
            for (col = 0; col < PROVAS-1; col++) 
            {
                notas[lin][col] = entrada.nextDouble();
                media += notas[lin][col];
            }
            media /= PROVAS-1;
            notas[lin][2] = media;
            mediaTurma += media;
        }

        mediaTurma /= ALUNOS;

        System.out.println();
        System.out.println("Notas e media");
        System.out.printf("Media da turma: %2.2f", mediaTurma);

        for (lin = 0; lin < ALUNOS; lin++)
        {
            System.out.printf("\nAluno %d:", lin+1);
            for (col = 0; col < PROVAS-1; col++){
                System.out.printf(" %2.2f |", notas[lin][col]);
            }

            System.out.printf(" Media do aluno %d: %2.2f", lin+1, notas[lin][2]);
            if (notas[lin][2] > mediaTurma)
                System.out.print(" - Acima da media da turma");
            else if (notas[lin][2] < mediaTurma)
                System.out.print(" - Abaixo da media da turma");
                else
                    System.out.print(" - Na media da turma");
        }
    }
}