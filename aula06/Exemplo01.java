// InitArray.java
// Cria um vetor e imprime o índice e o valor do índice de acordo com o tamanho do vetor

package aula06;

public class Exemplo01 {
    public static void main(String[] args) {
        int a[];            // Declara um array
        a = new int[10];    // Aloca espaço para o array
        
        // Imprime tamanho do vetor
        System.out.println("Tamanho do vetor a[]: " + a.length);

        // Imprime títulos das colunas
        System.out.printf("%s %8s\n", "Indice", "Valor");

        // Imprime cada elemento do vetor
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%6d %8s\n", i, a[i]);

        // Por ser criado sem nenhum valor, todos os valores dentro do vetor serão default
        // Int[] = 0; String[] = null; boolean[] = false; char[] = '\u0000';
/*
 * Output
 * Tamanho do vetor a[]: 10
 * Indice    Valor
 *      0        0
 *      1        0
 *      2        0
 *      3        0
 *      4        0
 *      5        0
 *      6        0
 *      7        0
 *      8        0
 *      9        0
 */
        }
    }
}

/*
 * O que são Arrays?
 * Arrays ou vetores são objetos que contêm uma coleção de elementos do mesmo tipo
 * Cada elemento pode ser acessado ou referenciado individualmente por um índice numérico
 * Esse valor inteiro representa a posição do elemento dentro do vetor
 * Elementos podem ser de tipo primitivo, objetos ou outros arrays
 */

/*
 * Arrays
 * Índice:
 * – Número da posição entre colchetes.
 * – Deve ser inteiro positivo ou expressão de inteiro.
 * – Primeiro elemento tem o índice zero:
 * a = 5;
 * b = 6;
 * c[ a + b ] += 2;
 * Adiciona 2 ao elemento c[ 11 ].
 */

/*
 * Cuidado com o tipo do índice
 * Utilizar um valor de tipo long como um índice de array resulta em um erro de compilação.
 * Um índice deve ser um valor int ou um valor de um tipo que possa ser convertido para int
 * — byte, short ou char, mas não long.
 */

/*
 * Declarando e criando arrays
 * São criados dinamicamente com a palavra-chave new
 * int c[] = new int[ 12 ];
 * Equivalente a:
 * int c[];  // declaração
 * c = new int[ 12 ]; // criação 
 * Também podemos criar arrays de objetos:
 * String b[] = new String[ 100 ];
 * // int c[] é equivalente a int[] c
 */

/*
 * Erro comum de programação
 * Especificar o número de elementos entre os colchetes da declaração
 * Ex. int c[ 12 ];// Erro
 * Múltiplas variáveis em única declaração:
 * Ex.:
 * int[] a, b, c; // 3 vetores (a, b, c)
 * int a[], b, c; // Um vetor (a) e dois inteiros (b, c)
 */