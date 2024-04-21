// InitArray06.java
// Método para exibir Array bidimensional

package aula06;

public class Exemplo06
{
    public static void main(String[] args)
    {
        int a1[][] = {{1, 2}, {3}, {4, 5, 6}};
        System.out.println("Impressao por linha");
        exibeArray(a1);
    } // fim do main()

    public static void exibeArray(int v[][])
    {
        int lin, col;
        for (lin = 0; lin < v.length; lin++) 
        {
            for (col = 0; col < v[lin].length; col++)
            {
                // for-interno
                System.out.printf("%d ", v[lin][col]);
            }
            // for-externo
            System.out.println();
        } // fim do for-externo
    } // fim do exibeArray()
} // fim da class

/*
 * Output
 * Impressao por linha
 * 1 2
 * 3
 * 4 5 6
 */

/*
 * Demonstração do loop
 * int a1[][] = {{1, 2}, {3}, {4, 5, 6}};
 * for (lin = 0; lin < v.length; lin++) 
 *      for (col = 0; col < v[lin].length; col++)
 *          System.out.printf("%d ", v[lin][col]);
 * 
 *                  i=0    i=1      i=2
 *                   1      2        3
 * v.length = 3; {{1 , 2}, {3}, {4 , 5 , 6}}
 * 
 *                   i=0 i=1
 *                    1   2  
 * v[0].length = 2; { 1 , 2 }
 * 
 *                  i=0
 * v[1].length = 1; {3}
 * 
 *                   i=0 i=1 i=2
 * v[2].length = 3; { 4 , 5 , 6 }
 * 
 * 
 * lin = 0 < 3 (v.length); col = 0 < 2 (v[lin].length); col++; print();
 * {{<1>, 2}, {3}, {4, 5, 6}}; 
 * 1        v[0][0];
 * 
 * lin = 0 < 3 (v.length); col = 1 < 2 (v[lin].length); col++; print();
 * {{1, <2>}, {3}, {4, 5, 6}}; 
 * 1 2      v[0][1];
 * 
 * lin = 0 < 3 (v.length); col = 2 < 2 (v[0].length) == false; retorna ao for-externo com lin++;
 * {{1, 2}, {3}, {4, 5, 6}};
 * 1 2
 * 
 * lin = 1 < 3; col = 0 < 1 (v[1].length); col++; print();
 * {{1, 2}, {<3>}, {4, 5, 6}};
 * 1 2
 * 3        v[1][0];
 * 
 * lin = 1 < 3; col = 1 < 1 (v[1].length) == false; retorna ao for-externo com lin++;
 * {{1, 2}, {3}, {4, 5, 6}};
 * 1 2
 * 3
 * 
 * lin = 2 < 3; col = 0 < 3; col++; print();
 * {{1, 2}, {3}, {<4>, 5, 6}};
 * 1 2
 * 3
 * 4        v[2][0];
 * 
 * lin = 2 < 3; col = 1 < 3; col++; print();
 * {{1, 2}, {3}, {4, <5>, 6}};
 * 1 2
 * 3
 * 4 5      v[2][1];
 * 
 * lin = 2 < 3; col = 2 < 3; col++; print();
 * {{1, 2}, {3}, {4, 5, <6>}};
 * 1 2
 * 3
 * 4 5 6    v[2][2];
 * 
 * lin = 2 < 3; col = 3 < 3 == false; retorna ao for-externo com lin++;
 * {{1, 2}, {3}, {4, 5, 6}};
 * 1 2
 * 3
 * 4 5 6
 * 
 * lin = 3 < 3 == false; retorna ao método;
 * {{1, 2}, {3}, {4, 5, 6}};
 * 1 2
 * 3
 * 4 5 6
 */