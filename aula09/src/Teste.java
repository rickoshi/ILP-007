package aula09.src;

public class Teste {
    public static void main(String[] args) 
    {
        // Objeto da classe Carro
        Carro carro;
        carro = new Carro("Fiesta", "ABC1678", 2006, 2007, 3, 31000);

        carro.imprime();
        carro.deprecia(10);
        System.out.println("Carro depreciado");
        carro.imprime();
        
        // Objeto da classe Caminhao
        Caminhao caminhao;
        caminhao = new Caminhao("Mercedes", "XYZ3456", 2000, 10, 3, 50000);

        caminhao.imprime();
        caminhao.deprecia(10);
        System.out.println("Caminhao depreciado");
        caminhao.imprime();

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
         * 
         * Veiculo: Mercedes
         * Placa: XYZ3456
         * Fabr: 2000
         * Capacidade: 10,0 toneladas
         * 03 Eixos
         * R$ 50000,00
         * Caminhao depreciado
         * 
         * Veiculo: Mercedes
         * Placa: XYZ3456
         * Fabr: 2000
         * Capacidade: 10,0 toneladas
         * 03 Eixos
         * R$ 45000,00
         */
    }
}