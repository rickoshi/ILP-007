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

        for (lin = 0; lin < ALUNOS; lin++)
        {
            // A cada loop, a variável media é reiniciada
            media = 0;
            System.out.printf("Digite as notas do aluno %d: ", lin+1);
            for (col = 0; col < PROVAS-1; col++)
            {
                // Entrada de valores das notas, que são colocados no array
                notas[lin][col] = entrada.nextDouble();
                // Cada valor é acrescentado na variável media (o laço repete 2 vezes, então 2 valores são acrescentados)
                media += notas[lin][col];
            }
            // A média é calculada utilizando o número de provas-1, visto que a última coluna do array irá guardar a média do aluno
            media /= PROVAS-1;
            // Por ser reiniciada para 0 a cada loop, a variável media do aluno é armazenada no array na linha do aluno
            notas[lin][2] = media;
            // Finalmente, a média de cada aluno é somada na variável para depois calcular a média da turma 
            mediaTurma += media;
        }

        // Calculo da média dividindo a soma das médias dos alunos (realizado no loop for) por ALUNOS (5)
        mediaTurma /= ALUNOS;

        System.out.println();
        System.out.println("Notas e media");
        System.out.printf("Media da turma: %2.2f", mediaTurma);

        for (lin = 0; lin < ALUNOS; lin++)
        {
            // Por utilizar index=0, a lin + 1 indica o número do aluno, e não seu índice
            System.out.printf("\nAluno %d:", lin+1);
            for (col = 0; col < PROVAS-1; col++){
                System.out.printf(" %2.2f |", notas[lin][col]);
            }

            // A impressão da média do aluno utiliza o valor armazenado na coluna 2 do array
            System.out.printf(" Media do aluno %d: %2.2f", lin+1, notas[lin][2]);
            // condições para verificar se a média do aluno é maior, menor ou igual a média da turma
            if (notas[lin][2] > mediaTurma)
                System.out.print(" - Acima da media da turma");
            else if (notas[lin][2] < mediaTurma)
                System.out.print(" - Abaixo da media da turma");
                else
                    System.out.print(" - Na media da turma");
        }
    }
}