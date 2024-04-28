// CarroImprime.java
// Subclasse que herda a superclasse Veiculo, com método construtor super
// Possui método imprimir específico da classe Carro

package aula09;

public class Exemplo04_SbCarro extends Exemplo04_SpVeiculo
{
    private int numPortas;
    private int anoModelo;
    
    public Exemplo04_SbCarro(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor) 
    {
        super(modelo, placa, anoFabr, valor);
        setPortas(numPortas);
        setAnoModelo(anoModelo);
    }

    public void setPortas(int numPortas)
    {
        this.numPortas = 2;
        if (numPortas > 2) this.numPortas = numPortas;
    }

    public int getPortas() {
        return numPortas;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void imprime() {
        System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
        System.out.printf("\nFabr: %4d\nModelo: %4d", anoFabr, anoModelo);
        System.out.printf("\n%02d Portas\nR$ %.2f\n", numPortas, valor);
    }
}