// TesteCarroAlternativo.java
// Cria um objeto carro que possui um método imprimir() próprio
// Usa getters ao invés de atributos protected

package aula09;

public class Exemplo05_Teste {
    public static void main(String[] args) 
    {
        Exemplo05_CarroAlternativo cAlt;
        cAlt = new Exemplo05_CarroAlternativo("Fiesta", "ABC1678", 2006, 2007, 3, 31000);

        cAlt.imprime();
        cAlt.deprecia(10);

        System.out.println("Carro depreciado");
        cAlt.imprime();

        /*
         * O resultado do uso do getters é o mesmo do uso dos atributos protected
         * 
         * Veiculo: Fiesta
         * Placa: ABC1678
         * Fabr: 2006
         * Modelo: 2007
         * 03 Portas
         * R$ 31000,00
         * Carro depreciado
         * 
         * Veiculo: Fiesta
         * Placa: ABC1678
         * Fabr: 2006
         * Modelo: 2007
         * 03 Portas
         * R$ 27900,00
         */
    }
}
