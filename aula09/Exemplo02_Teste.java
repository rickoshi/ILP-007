// TesteCarro.java
// Cria um objeto carro, porém não possui o método imprimir específico, apenas o herdado de Veiculo

package aula09;

public class Exemplo02_Teste {
    public static void main(String[] args) {
        // Declaração de objeto da subclasse
        Exemplo02 c;

        // Uso do construtor da subclasse
        c = new Exemplo02("Fiesta", "ABC1678", 2006, 2007, 3, 31000);

        // Uso de métodos da superclasse
        c.imprime();
        c.deprecia(10);

        System.out.println("Carro depreciado");
        c.imprime();

        /*
         * Veiculo: Fiesta
         * Placa: ABC1678
         * Ano: 2006
         * Valor: R$31000,00
         * Carro depreciado
         * 
         * Veiculo: Fiesta
         * Placa: ABC1678
         * Ano: 2006
         * Valor: R$27900,00
         */
    }
}

/*
 * Imprimindo dados do carro
 * O método “imprime()” foi herdado da classe Veículo
 * Não possui todos os dados do carro
 * Como codificar método imprime() para objetos do tipo Carro?
 * No programa teste, qual método será executado: da classe Veículo ou da classe Carro?
 * - O método executado será o da superclasse Veiculo
 */