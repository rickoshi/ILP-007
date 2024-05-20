// TesteFormasV2.java
// Utiliza as classes FormaGeometrica, Circulo e Retangulo
// O método imprime() de Circulo mostra apenas o número de lados (herdado de FormaGeometrica)

package aula11;

public class Exemplo08 {
    public static void main(String[] args) {
        Exemplo06 circulo = new Exemplo06(5);
        circulo.imprime();
        System.out.println();

        Exemplo07 retangulo = new Exemplo07(3, 4);
        retangulo.imprime();

        /*
         * Dados do circulo:
         * Numero de lados: 0
         * Area: 0,00
         * Raio: 0.0
         * 
         * Dados do retangulo:
         * Numero de lados: 4
         * Area: 12,00
         * Base: 3.0
         * Altura: 4.0
         */
    }
}