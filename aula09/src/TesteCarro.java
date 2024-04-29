package aula09.src;

public class TesteCarro {
    public static void main(String[] args) {
        Carro car1;
        car1 = new Carro("Fiesta", "ABC1678", 2006, 2007, 3, 31000);
        car1.imprime();
        car1.deprecia(10);
        System.out.println("Carro depreciado");
        car1.imprime();

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