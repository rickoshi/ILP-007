// InitArray02.java
// Cria um vetor e imprime o índice e o valor do índice de acordo com o tamanho do vetor
// Utiliza uma constante para indicar o tamanho do vetor (TAM = a.length)

package aula06;

public class Exemplo02
{
    public static void main(String[] args)
    {
        final int TAM = 10; // Declara constante, com letras maiúsculas e valor imutável durante a execução
        int a[] = new int[TAM]; // Cria o array

        // A cada repetição, é atribuido um valor (indice*2 +2) para o índice
        for(int i = 0; i < TAM; i++)
            a[i] = 2 + 2 * i;

        System.out.println("Tamanho do vetor a[]: " + TAM);
        System.out.printf("%s %8s\n", "Indice", "Valor");
        for (int i = 0; i < TAM; i++)
            System.out.printf("%6d %8d\n", i, a[i]);

        /*
         * Output
         * Tamanho do vetor a[]: 10
         * Indice    Valor
         *      0        2
         *      1        4
         *      2        6
         *      3        8
         *      4       10
         *      5       12
         *      6       14
         *      7       16
         *      8       18
         *      9       20
         */
    }
}

/*
 * Definindo constantes
 * Utilizando a palavra 'final' antes do tipo da constante
 * - O valor da constante é imutável durante a execução do programa
 * Também são chamadas
 * – constantes identificadas
 * – variáveis de leitura (read-only).
 * Tornam programas mais legíveis
 * – Ex.: constante TAM indica tamanho do vetor;
 * - Geralmente declarada com letras maiúsculas
 */

/*
 * Cuidados com constantes
 * Atribuir um valor a uma constante depois de a variável ter sido inicializada é um erro de compilação.
 * Tentar utilizar uma constante antes de ela ser inicializada é um erro de compilação
 */