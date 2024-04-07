// CirculoParte03.java
// Implementar uma classe Circulo que recebe o atributo raio e possui os métodos de alterar e informar o raio e exibir dados
// O raio é validado, não podendo ser número negativo
// Utilizar um método construtor para a classe, que recebe como parâmetro um valor double para o setRaio()

package aula04;

public class Exemplo05
{
    private double raio;

    public Exemplo05(double raio)
    {
        setRaio(raio);
    }

    public void setRaio(double raio)
    {
        if (raio < 0)
            System.out.println("O raio nao pode ser negativo");
        else
            this.raio = raio;
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
 * Construtor
 * – Método especial que cria ou instancia novos objetos na memória do computador;
 * – Tem o mesmo nome da classe;
 * – Assegura estado consistente do objeto inicializando seus atributos;
 * Boa prática: Inicialize as variáveis de instância de uma classe no seu construtor.
 */

/*
 * Construtores Java
 * O Java requer um construtor para cada classe.
 * O Java fornecerá um construtor sem argumentos-padrão, caso nenhum seja fornecido.
 * Ex. classe Círculo: Podemos implementar o construtor inicializando o valor do raio.
 * Os construtores são chamados quando a palavra-chave new precede o nome da classe.
 * Ex.:Scanner entrada = new Scanner(System.in);
 * Circulo c = new Circulo( );
 */

/*
 * Uso do this.
 * Quando se tem duas variáveis com nomes iguais, sendo uma atributo da classe e a outra o parâmetro da função,
 * utilizamos this. para referenciar a variável que é atributo da classe
 * 
 * public void setRaio(double raio) 
 * {
 * this.raio = raio;
 * }
 * O compilador entendo como o atributo da classe Circulo [private double raio] recebendo o valor do parâmetro [public void setRaio(double raio)]
 * 
 * Se por exemplo não utilizassemos this. , estariamos atribuindo uma variável a ela mesma
 * public void setRaio(double raio)
 * {
 * raio = raio;
 * }
 * O compilador entende a operação como atribuir o valor do parâmetro para o parâmetro, portanto não há efeito de atribuição
 */