package aula11.src;

public class TesteFormas {
    public static void main(String[] args) {
        Circulo c = new Circulo(5);
        c.imprime();
        System.out.println();

        Retangulo r = new Retangulo(3, 4);
        r.imprime();
        System.out.println();

        Triangulo t = new Triangulo(3, 4);
        t.imprime();
        System.out.println();

        /*
         * Dados do circulo:
         * Numero de lados: 0
         * Area: 78,54
         * Raio: 5.0
         * 
         * Dados do retangulo:
         * Numero de lados: 4
         * Area: 12,00
         * Base: 3.0
         * Altura: 4.0
         * 
         * Dados do triangulo:
         * Numero de lados: 3
         * Area: 6,00
         * Base: 3.0
         * Altura: 4.0
         * 
         */
    }
}