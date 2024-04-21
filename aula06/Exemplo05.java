// InitArray05.java
// Criação e demonstração de arrays bidimensionais (matrizes)

package aula06;

public class Exemplo05 
{
    public static void main(String[] args)
    {
        int a[][] = new int[2][3];
        // System.out.println(a);       // [[I@3cd1f1c8
        // System.out.println(a[1]);    // [I@3a4afd8d
        System.out.println(a[0][0]);    // 0
        System.out.println(a[1][1]);    // 0

        int b[][] = { { 1, 2 , 3 }, {4 , 5 , 6 } };
        // System.out.println(b);       // [[I@372f7a8d
        // System.out.println(b[1]);    // [I@2f92e0f4
        System.out.println(b[0][0]);    // 1
        System.out.println(b[0][1]);    // 2
        System.out.println(b[0][2]);    // 3
        System.out.println(b[1][0]);    // 4
        System.out.println(b[1][1]);    // 5
        System.out.println(b[1][2]);    // 6
    }
}

/*
 * Arrays Bidimensionais
 * Tabelas com linhas e colunas:
 * – m linhas por n colunas
 */

/*
 * Arrays de arrays
 * Declarando um array bidimensional a[2 linhas][3 colunas]
 * int a[][] = new int [2][3];
 * 
 * Declarando e inicializando um array bidimensional b[2][3]
 * int b[][] = { { 1, 2 , 3 }, {4 , 5 , 6 } };
 * 1, 2 e 3 inicializam b[0][0], b[0][1] e b[0][2].
 * 4, 5 e 6 inicializam b[1][0], b[1][1] e b[1][2].
 * 
 * Comprimentos de linhas diferentes.
 * int b[][] = { { 1, 2 }, { 3, 4, 5 } };
 * A linha 0 contém elementos 1 e 2.
 * A linha 1 contém elementos 3, 4 e 5.
 */

/*
 * Representação gráfica de matrizes
 * Matrizes em Java são criadas como um vetor de vetores
 * O primeiro vetor é criado para referenciar outro vetor
 * Ele possui como valor armazenado o endereço de memória do vetor que possui os valores
 * O vetor referenciado contém os valores que podem ser usados (int, String)
 * 
 * Ex: Se imprimirmos apenas o primeiro índice do vetor da matriz, recebemos o endereço do vetor referência
 * int a[][] = new int[2][3];
        System.out.println(a[1]);
 * // Output
 * [[I@372f7a8d
 * 
 * int b[][] = { { 1, 2 , 3 }, {4 , 5 , 6 } };
        System.out.println(b[1]);
 * // Output
 * [I@2f92e0f4
 * 
 * Para referenciarmos os valores da matriz, ao invés dos endereços de cada vetor que a compõe, especificamos dois valores do vetor
 * O primeiro valor referencia a linha: qual vetor que será escolhido
 * O segundo valor referencia a coluna: qual valor dentro do vetor será apontado
 * 
 * Podemos definir graficamente a matriz int b[][] como:
 *               i=0    i=1   i=2
 *   Array 0  {   1  ,   2  ,  3  }, // Essa é uma array, ela armazena 3 valores
 *   Array 1  {   4  ,   5  ,  6  }; // Essa é outra array, que também armazena 3 valores
 * 
 * Quando combinamos os valores que determinam o array selecionado (linha), e o índice (coluna),
 * Referenciamos o valor escolhido na matriz:
 *          [0]   [1]   [2]
 *   [0]  {  1  ,  2  ,  3  },
 *   [1]  {  4  ,  5  ,  6  };
 * 
 * b[0][1] = 2;
 * b[1][2] = 6;
 * 
 * b = [[I@2f92e0f4
 * b[1] = [I@2f92e0f4
 */