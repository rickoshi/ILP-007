// TesteCarroImprime.java
// Cria um objeto carro que possui um método imprimir() próprio

package aula09;

public class Exemplo04_Teste {
    public static void main(String[] args) 
    {
        Exemplo04_SbCarro c;
        c = new Exemplo04_SbCarro("Fiesta", "ABC1678", 2006, 2007, 3, 31000);

        c.imprime();
        c.deprecia(10);

        System.out.println("Carro depreciado");
        c.imprime();

        /*
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