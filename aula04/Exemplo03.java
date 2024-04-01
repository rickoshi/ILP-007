// CirculoParte02.java
// Implementar uma classe Circulo que recebe o atributo raio e possui os métodos de alterar e informar o raio e exibir dados
// O raio é validado, não podendo ser número negativo

package aula04;

public class Exemplo03
{
    private double raio;

    public void setRaio(double r)
    {
        // Condição para validar o raio, demonstrando a importância do encapsulamento
        if (r < 0) {
            System.out.println("O raio nao pode ser negativo");
        }
        else
        {
        raio = r;
        }
    }

    public double getRaio()
    {
        return raio;
    }

    public void exibeDados()
    {
        System.out.println("Raio: " + getRaio());
    }
}

/*
 * Cuidados
 * Declarar mais de uma classe public no mesmo arquivo é um erro de compilação.
 * Entretanto, podemos ter vários métodos public declarados em uma mesma classe
 * Listar os atributos antes de declarar métodos da classe. É possível listar os atributos em qualquer lugar na classe, mas sua dispersão tende a resultar em um código de difícil leitura.
 */

/*
 * Encapsulamento
 * Recomenda-se que atributos sejam privados (somente o próprio objeto pode vê-lo)
 * Apesar de privados, os atributos podem ser acessados ou alterados a partir de qualquer método.
 * Para alterar ou ler seu valor, criamos métodos públicos: set e get;
 * 
 * Importância do encapsulamento
 * - Criamos classes para “clientes” (reuso)
 * - Capacidade de usar sem conhecer detalhes internos
 * - Alterações na implementação não afetam cliente
 * - Garantia de acesso seguro aos dados
 * Posso ter círculo com raio negativo? Supondo que não, devemos validar no método set.
*/

/*
 * Invocando métodos
 * Observe que não existe obrigatoriedade de chamar os métodos na ordem em que foram implementados.
 * Semelhante a um “fornecedor de serviços”, o objeto instanciado disponibiliza todos os seus métodos, entretanto, o programa só utiliza aqueles que desejar, na ordem que for relevante.
 * Em métodos com parâmetros, os mesmos são usados para passar informações adicionais ao método. Neste exemplo, usamos o valor do parâmetro r para alterarmos o atributo raio.
 */

/*
 * Variáveis de instância x Variáveis locais
 * Atributos ou variáveis de instância:
 * – Variáveis declaradas na declaração de classe;
 * – Cada objeto (instância) da classe tem uma instância separada da variável;
 * – Existe enquanto o objeto existir: antes e depois de chamadas aos métodos;
 * – Exemplo: raio
 * Variáveis locais:
 * – Declaradas no corpo do método;
 * – Só podem ser utilizadas nesse método;
 * – Só existem durante a execução do método;
 * - Exemplo: double r
*/

/*
 * Exemplo: Classe Circulo
 * Variável de instância: raio;
 * Cada objeto do tipo Circulo tem seu próprio raio;
 * Circulo c1 = new Circulo();
 * c1.setRaio(5);
 * Circulo c2 = new Circulo();
 * c2.setRaio(10);
 */