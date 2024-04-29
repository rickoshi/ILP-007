package aula09.src;

public class TesteVeiculo {
    public static void main(String[] args) 
    {
        Veiculo moto;
        moto = new Veiculo("Yamaha", "AMZ1289", 2023, 19000);
        moto.imprime();
        moto.deprecia(5);
        System.out.println("Veiculo depreciado");
        moto.imprime();

        Veiculo carro;
        carro = new Veiculo("Fiesta", "ABC1678", 2006, 31000);
        carro.imprime();
        carro.deprecia(10);
        System.out.println("Veiculo depreciado");

        Veiculo caminhao;
        caminhao = new Veiculo("Mercedes", "XYZ3456", 2000, 50000);
        caminhao.imprime();
        caminhao.deprecia(15);
        System.out.println("Veiculo depreciado");
        caminhao.imprime();

        /*
         * Veiculo: Yamaha
         * Placa: AMZ1289
         * Ano: 2023
         * Valor: R$19000,00
         * Veiculo depreciado
         * 
         * Veiculo: Yamaha
         * Placa: AMZ1289
         * Ano: 2023
         * Valor: R$18050,00
         * 
         * Veiculo: Fiesta
         * Placa: ABC1678
         * Ano: 2006
         * Valor: R$31000,00
         * Veiculo depreciado
         * 
         * Veiculo: Mercedes
         * Placa: XYZ3456
         * Ano: 2000
         * Valor: R$50000,00
         * Veiculo depreciado
         * 
         * Veiculo: Mercedes
         * Placa: XYZ3456
         * Ano: 2000
         * Valor: R$42500,00
         */
    }
}
