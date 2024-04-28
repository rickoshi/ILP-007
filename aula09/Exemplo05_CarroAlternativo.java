// CarroAlternativo.java
// Possui um método imprimir() que utiliza os getters da superclasse ao invés dos próprios atributos (sem uso do protected)

package aula09;

public class Exemplo05_CarroAlternativo extends Exemplo05_VeiculoAlternativo{
    private int numPortas;
    private int anoModelo;
    
    public Exemplo05_CarroAlternativo(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor) 
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
        System.out.printf("\nVeiculo: %s\nPlaca: %7s", getModelo(), getPlaca());
        System.out.printf("\nFabr: %4d\nModelo: %4d", getAnoFabr(), anoModelo);
        System.out.printf("\n%02d Portas\nR$ %.2f\n", numPortas, getAnoFabr());
    }
}