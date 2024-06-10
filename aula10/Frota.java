/*
 * Exemplo – Frota de veículos
 * Algoritmo
 * – Solicita quantidade de veículos (n)
 * – Leitura de n veículos:
 * Solicita tipo de veiculo (“v”, “a”, “c”)
 * Solicita dados de acordo com o tipo
 * Armazena em vetor de tamanho n
 * – Imprime dados de n veículos armazenados em cada posição do vetor (polimorfismo)
 * Qual o tipo do vetor?
 * – Veículo? Carro? Caminhão?
 */

package aula10;

import java.util.Scanner;

public class Frota
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sInput = new Scanner(System.in);
        @SuppressWarnings("resource")
        Scanner nInput = new Scanner(System.in);

        int tam, i, anoFabr, anoModelo, numPortas, numEixos;
        double capacidade, valor;
        String tipo, modelo, placa;

        System.out.println("Digite o tamanho da frota: ");
        tam = nInput.nextInt();
        Veiculo[] frota = new Veiculo[tam];  // Declara e instancia um vetor do tipo Veiculo que recebe o tamanho definido pelo user

        // Loop para alocar
        for(i = 0; i<tam; i++)
        {
            System.out.println("Tipo do " + (i+1) +".o veiculo (a - auto/ c - caminhao): ");
            tipo = sInput.nextLine();  // User digita o tipo de veiculo desejado

            if (!tipo.equalsIgnoreCase("a") && !tipo.equalsIgnoreCase("c"))
                System.out.println("TIPO NAO PREVISTO");  // Se for digitado outro caractere além de "a", "c", "A" ou "C"

            // Instruções comuns para os objetos dentro do vetor frota[]: todos os objetos receberão os atributos
            System.out.println("Modelo: ");
            modelo = sInput.nextLine();
            System.out.println("Placa: ");
            placa = sInput.nextLine();
            System.out.println("Ano Fabr.: ");
            anoFabr = nInput.nextInt();
            System.out.println("Valor");
            valor = nInput.nextDouble();

            // Dados para objetos do tipo Carro
            if (tipo.equalsIgnoreCase("a"))
            {
                System.out.println("Ano modelo: ");
                anoModelo = nInput.nextInt();
                System.out.println("Portas: ");
                numPortas = nInput.nextInt();

                // A posição i do vetor receberá o endereço de memória contendo um objeto Carro com os atributos do Construtor
                frota[i] = new Carro(modelo, placa, anoFabr, anoModelo, numPortas, valor);
            }

            // Dados para objetos do tipo Caminao
            else if (tipo.equalsIgnoreCase("c")) 
            {
                System.out.println("Capacidade em toneladas: ");
                capacidade = nInput.nextDouble();
                System.out.println("Numero de eixos: ");
                numEixos = nInput.nextInt();

                // A posição i do vetor receberá o endereço de memória contendo um objeto Caminhao com os atributos do Construtor
                frota[i] = new Caminhao(modelo, placa, anoFabr, capacidade, numEixos, valor);
            }

            // Se nenhum dos casos for executado, o objeto recebe os valores padrões do tipo Veiculo
            else
            {
                // A posição i do vetor receberá o endereço de memória contendo um objeto Veiculo com os atributos do Construtor
                frota[i] = new Veiculo(modelo, placa, anoFabr, valor);
            } 
        }

        // Loop para percorrer o vetor e imprimir os dados utilizando o método imprimir(), chamado a partir do próprio objeto
        for (i = 0; i < tam; i++) 
        {
            System.out.println("\nVeiculo n.o " + (i+1));

            // A não ser que esteja nulo, imprimir os dados do objeto na posição i do vetor frota[]
            if (frota[i] != null)
                frota[i].imprime(); // Todos os objetos do vetor possuem o método imprime(), então não há conflitos ao utilizá-lo
            System.out.println();
        }
    }
}

/*
 * Relembrando Herança
 * Cria uma nova classe a partir de uma classe existente:
 * – absorvendo os dados e comportamentos da classe existente; e
 * – aprimorando-a com novas capacidades.
 * Adota um relacionamento hierárquico entre classes
 * Permite melhor organização e reuso de código
 */

/*
 * Exemplo: Veículos
 * Superclasse Veículo
 * Subclasse Carro
 * Subclasse Caminhão
 */

/*
 * Construtor do Carro
 * Chama o construtor da classe Veiculo (superclasse) para garantir integridade dos atributos básicos.
 * 
 * public Carro(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor) {
 *    super (modelo, placa, anoFabr, valor);
 *    setPortas(numPortas);
 *    setAnoModelo(anoModelo);
 * }
 */

/*
 * Método imprime( ) na Classe Carro
 * 
 * public void imprime() {
 *     System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
 *     System.out.printf("\nFabr: %4d\nModelo: %4d", anoFabr, anoModelo);
 *     System.out.printf("\n%02d Portas\nR$ %.2f\n", numPortas, valor);
 * }
 * 
 * OU
 * 
 * public void imprime( ){
 *     super.imprime();
 *     System.out.printf("\n%02d Portas\n", numPortas);
 *     System.out.printf("\nAno Modelo: %4d", anoModelo);
 * }
 */

/*
 * Definição de Polimorfismo
 * Princípio pelo várias classes derivadas de uma mesma superclasse podem
 * invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos.
 */

/*
 * Quais ou qual método esperamos que tenha o mesmo comportamento nas classes carro e caminhão?
 * Qual deve ser alterado nas classes filhas?
 * 
 * Teste - Classe Carro
 * deprecia( ): quando invocado a partir de um objeto Carro, comporta-se igual a um Veiculo. Método herdado.
 * Já o imprime(), foi reescrito na subclasse... Isto é exemplo de polimorfismo!
 */

/*
 * Reforçando - Polimorfismo
 * Redefinição de um método da superclasse, ou seja, quando o método é reescrito na subclasse;
 * Assim, um mesmo método quando invocado por objetos de tipos diferentes apresenta comportamentos distintos, 
 * apesar de pertencerem a mesma hierarquia (herança).
 * 
 * Redefinição do método imprime(): provoca diferentes resultados quando
 * o mesmo método é invocado por um objeto do tipo veículo, carro ou caminhão.
 */

/*
 * Vetor de Veículos
 * Como um vetor preparado para armazenar dados de Veiculos consegue guardar dados do tipo Carro ou Caminhão,
 * se eles são “maiores” que veículo??? Ou seja, tem mais atributos e ocupam mais memória?
 * Cada posição do vetor guarda a referência para o objeto instanciado em memória (endereço);
 * Diferentemente dos tipos primitivos, variáveis associadas a objetos não guardam os objetos,
 * mas sim sua referência (endereçamento em memória).
 */

/*
 * Ligação tardia
 * O método pode ser invocado a partir de uma referência a um objeto do tipo da superclasse, apesar de, na prática, ser uma instância da subclasse.
 * Neste caso, a decisão sobre qual o método que deve ser selecionado, de acordo com o tipo da classe derivada, 
 * é tomada em tempo de execução, através do mecanismo de ligação tardia.
 * – Ex: Classe Frota. Diferentemente da classe TesteCarro (não possui ligação tardia).
 */