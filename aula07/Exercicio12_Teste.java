package aula07;

public class Exercicio12_Teste {
    public static void main(String[] args) {
        Exercicio12 ret1 = new Exercicio12(10, 30);
        Exercicio12 ret2 = new Exercicio12(3, 3);
        Exercicio12 ret3 = new Exercicio12();

        ret1.imprimirDados();
        ret2.imprimirDados();
        ret3.imprimirDados();
    }
}

/*
 * Output
 * =================================
 * Base : 10,00
 * Altura : 30,00
 * Perimetro: 80,00
 * Area : 300,00
 * Quadrado : false
 * =================================
 * 
 * =================================
 * Base : 3,00
 * Altura : 3,00
 * Perimetro: 12,00
 * Area : 9,00
 * Quadrado : true
 * =================================
 * 
 * =================================
 * Base : 2,00
 * Altura : 1,00
 * Perimetro: 6,00
 * Area : 2,00
 * Quadrado : false
 * =================================
 */