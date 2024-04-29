package aula09.src;

public class TesteCaminhao {
    public static void main(String[] args) {
        Caminhao cam1;
        cam1 = new Caminhao("Mercedes", "XYZ3456", 2000, 10, 3, 50000);
        cam1.imprime();
        cam1.deprecia(10);
        System.out.println("Caminhao depreciado");
        cam1.imprime();

        /*
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