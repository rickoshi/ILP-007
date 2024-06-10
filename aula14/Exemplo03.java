/*
 * CirculoException.java
 * Usa a classe Circulo para declarar os métodos e atributos
 * Lança uma Exceção no método setRaio() ao declarar um raio negativo
 * O construtor relança a Exceção sempre que a exceção de raio negativo ocorrer
 * Possui a função main junto da própria classe, ao invés de uma classe separada
 * Usa os blocos try catch para verificar a criação de objeto com raio negativo
 * Se uma exceção acontecer, exibe uma mensagem de erro junto com a mensagem do objeto de exceção
*/

package aula14;

public class Exemplo03 
{
    private double raio;

    // Lança Exceção para raio inválido
    public void setRaio(double raio) throws Exception {
        if (raio < 0)
            throw new Exception("Circulo com raio negativo");
        else 
            this.raio = raio;
    }

    // Por utilizar o método setRaio(raio), o construtor também tem que lançar a exceção
    public Exemplo03(double raio) throws Exception {
        setRaio(raio);
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void imprime() {
        System.out.println("Dados do circulo: ");
        System.out.println("Raio: " + raio);
    }

    public static void main(String[] args) {

        // Declara um objeto do tipo Exemplo03
        Exemplo03 c1;
        Exemplo03 c2;
        
        // Tenta executar os seguintes comandos
        try {
            // Instancia objeto de raio positivo
            c1 = new Exemplo03(5);
            c1.imprime();

            // Instancia objeto de raio negativo
            c2 = new Exemplo03(-5);
            c2.imprime();
            
            // O compilador lança uma exceção e ela é tratada
        } catch (Exception e) {
            System.out.println("Erro ao criar circulo: " + e.getMessage());
            /*
             * Exibe mensagem de erro junto com a mensagem do objeto "e"
             * "e" é a exceção gerada pelo método setRaio() ao criarmos com raio negativo
             * setRaio() instancia e lança a exceção, e o construtor relança a exceção para o programa main
             * O método getMessage retorna a mensagem que escrevemos ao lançar a exceção no setRaio()
             */
        }
        /*
         * Dados do circulo:
         * Raio: 5.0
         * Erro ao criar circulo: Circulo com raio negativo
         *          ^                       ^
         *    Método catch()       objeto e.getMessage()
         */
    }
}

/*
 * Como gerar uma exceção?
 * Nos próximos slides vamos aprender:
 * – Como um método pode gerar e lançar uma exceção;
 * – Como relançar uma exceção gerada por outro método;
 * – Como usar essas opções na prática!
 */

/*
 * Gerando e lançando uma Exceção
 * O metodo1 cria e lança uma exceção quando a condição for verdadeira.
 * public void metodo1 ( ) throws Exception
 * {
 *      if (<condicao>)
 *          throw new Exception (“Erro");
 *      else 
 *          ...
 * }
 * 
 * Exemplo prático – Classe Circulo
 * // lança Exceção para raio inválido
 * public void setRaio (double raio) throws Exception
 * {
 *  if (raio<0)
 *    throw new Exception ("Circulo com raio negativo");
 *  else
 *    this.raio = raio;
 * }
 */

/*
 * Caso 3 - Relançando Exceção (gerada por outro método)
 * Neste exemplo, o metodo2() não cria uma exceção mas pode lançar uma possível exceção caso ocorra alguma falha na chamada ao metodo1().
 * public void metodo2 ( ) throws Exception
 * {
 *   ...
 *   metodo1( ); // lança exceção
 *   ...
 * }
 * 
 * Exemplo prático – Classe Circulo
 * // lança Exceção para raio inválido
 * public void setRaio (double raio) throws Exception
 * {
 *   if (raio<0)
 *      throw new Exception ("Circulo com raio negativo");
 *   else
 *      this.raio = raio;
 * }
 * 
 * // construtor relança Exceção do método setRaio
 * public Circulo(double raio) throws Exception {
 *   setRaio(raio);
 * }
 * 
 * O compilador executa da seguinte forma:
 * Chama metodo2() -> metodo2() chama metodo1() -> metodo1() é validado
 * Se a validação for verdadeira, cria e lança uma exceção para o metodo1()
 * Retorna ao metodo2() com o objeto de exceção
 * O metodo2() relança o objeto de exceção, nesse caso a mensagem "Circulo com raio negativo"
 */

/*
 * Captura e tratamento da Exceção relançada
 * Neste exemplo, a possível exceção lançada pelo metodo2() é capturada e tratada pelo programa principal.
 * 
 * public static void main(String[] args) {
 *      try {
 *          ...
 *          metodo2 ( );
 *          ...
 *      }
 *      catch (Exception e) {
 *          System.out.println("Erro identificado: ”+ e.getMessage());
 *      }
 * }
 */