// TesteFormas.java
// Utiliza as classes FormaGeometrica e Circulo
// Não consegue instanciar a classe FormaGeometrica por ser abstrata
// O método imprime() de Circulo mostra apenas o número de lados (herdado de FormaGeometrica)

package aula11;

public class Exemplo03 
{
    public static void main(String[] args) {
        // Não é possível instanciar uma classe abstrata
        // Exemplo01 forma = new Exemplo01();
        // forma.imprime();

        Exemplo02 circulo = new Exemplo02(5);
        circulo.imprime();

        /*
         * Output
         * Numero de lados: 0
         */
    }
}

/*
 * Alterações
 *  Classes abstratas não podem ser instanciadas.
 * – Corrigir código do teste
 * O que o método imprime(), quando invocado a partir de um objeto circulo deve imprimir na tela?
 * Como imprimir raio junto ao número de lados?
 * Altero em Circulo ou FormaGeometrica?
 * Redefinir método imprime() na classe circulo!
 */