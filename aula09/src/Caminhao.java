package aula09.src;

public class Caminhao extends Veiculo {
    private double capacidade;
    private int numEixos;

    public Caminhao(String modelo, String placa, int anoFabr, double capacidade, int numEixos, double valor) {
        super(modelo, placa, anoFabr, valor);
        setCapacidade(capacidade);
        setNumEixos(numEixos);
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = 2;
        if (numEixos > 2) {
            this.numEixos = numEixos;
        }
    }

    public double getCapacidade() {
        return capacidade;
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void imprime() {
        System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
        System.out.printf("\nFabr: %4d\nCapacidade: %.1f toneladas", anoFabr, capacidade);
        System.out.printf("\n%02d Eixos\nR$ %.2f\n", numEixos, valor);
    }
}