// Carro.java
// Subclasse que herda a superclasse Veiculo, com método construtor super

package aula09;

public class Exemplo02 extends Exemplo01 
{
    private int numPortas;
    private int anoModelo;
    
    public Exemplo02(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor) 
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
}

/*
 * Subclasse Carro
 * Atributos específicos
 * – Número de portas
 * – Ano do modelo
 * 
 * Métodos
 * – Construtor
 * – Sets e gets específicos
 * – Impressão dos dados do carro
 */