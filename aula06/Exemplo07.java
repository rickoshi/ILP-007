// InitArray07.java
// Método para exibir Array bidimensional
// Utiliza o laço for-each para percorrer o Array bidimensional

package aula06;

public class Exemplo07
{
    public static void main(String[] args)
    {
        int a1[][] = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println("Impressao por linha");
        exibeArray(a1);
    } 

    public static void exibeArray(int array[][])
    {
        // Loop for-each
        for (int[] arrayLinha : array) {
            for (int numero : arrayLinha) {
                System.out.printf("%d ", numero);
            }
            System.out.println();
        }
        
        /*
         * // Loop for
         * int lin, col;
         * for (lin = 0; lin < v.length; lin++) {
         *      for (col = 0; col < v[lin].length; col++) {
         *          System.out.printf("%d ", v[lin][col]);
         *      }
         *      System.out.println();
         * }
         */
    }
}

/*
 * O for-each pega as posições do vetor base (array[][]) e atribui os valores a uma variável de referência (int[] arrayLinha)
 * No for-each interno, o compilador atribuirá cada elemento do arrayLinha a outra variável (int numero)
 * O primeiro for-each atribui os vetores (linhas) dentro do array, enquanto o segundo for-each atribui os elementos do vetor
 * 
 * As instruções serão executadas para cada item do vetor:
 * Escolhido o primeiro vetor, o primeiro elemento desse vetor será atribuido a uma variável (int numero) e as operações do loop serão executadas
 * Após a execução das instruções, o compilador atribui o valor do próximo elemento do vetor para a variável
 * Executadas todas as instruções dos elementos do primeiro vetor, o compilador retorna para o for-externo
 * E passa para o próximo elemento, que nesse caso, é outro vetor
 * Dentro desse vetor (segunda linha da matriz), todos os elementos são executados e retorna-se ao for-externo
 * Finalmente, o programa entra no último vetor e executa as instruções para todos os elementos
 * Após isso, a execução do laço for-each está completa
 */