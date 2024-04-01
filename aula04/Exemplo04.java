// TesteCirculoParte02.java
// Utiliza a classe circulo para executar o programa
// O teste consiste em atribuir valores positivos e negativos para o raio

package aula04;

public class Exemplo04
{
    public static void main(String[] args) {
        Exemplo03 circ = new Exemplo03();
        circ.setRaio(10); // r = 10; Raio = r; Raio = 10
        circ.setRaio(-5);   // r = -5; (r < 0); "O raio nao pode ser negativo"
        circ.exibeDados();  // Raio: 10.0; Isso ocorre porque o programa ignora a instrução de setRaio(-5)
    }
}