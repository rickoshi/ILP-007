// TesteCirculoParte03.java
// Utiliza a classe circulo para executar o programa
// O teste consiste em atribuir valores positivos e negativos para o raio
// Utiliza o método construtor que exige o parâmetro double, e já altera o valor do raio para o valor do próprio parâmetro

package aula04;

public class Exemplo06
{
    public static void main(String[] args) 
    {
    //  Exemplo05 circulo = new Exemplo05(); Não funciona pois o método construtor exige parâmetro
        
        Exemplo05 circ = new Exemplo05(12);
        circ.exibeDados();

        Exemplo05 c = new Exemplo05(-10);
        c.exibeDados();
    }
}