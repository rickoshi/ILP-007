// TesteCirculo.java
// Utiliza a classe circulo para executar o programa

package aula04;

public class Exemplo02
{
    public static void main(String[] args) {
        Exemplo01 circ = new Exemplo01();  // A instância (new Exemplo01()) é necessária para o objeto poder ser utilizado
        circ.exibeDados();  // Sem valor do raio, o valor padrão exibido é 0
    }
}

/*
 * Como usar/testar uma classe?
 * A classe Circulo não tem método main, porém a execução de programa em Java é feita em classes com método main
 * Se tentarmos executar classe sem main, o sistema dá erro/não executável
 * Na classe sem o método main, apenas compilamos para gerar o arquivo “.class”
 * Em outra classe (CirculoTeste) inserimos o método main e referenciamos a classe (Circulo) para uso
 */

/*
 * Programas usando classes
 * Palavra reservada “new”: cria instância (exemplar) de classe, ou seja, um objeto na memória:
 * new + nome da classe + parênteses.
 * Chamando (invocando) um método:
 * Nome de objeto + ponto (.) + nome do método + parênteses.
 */