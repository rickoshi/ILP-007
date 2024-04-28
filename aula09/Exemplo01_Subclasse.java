// Carro.java
// Subclasse que herda a superclasse Veiculo

package aula09;

public class Exemplo01_Subclasse extends Exemplo01 
{
    private int numPortas;
    private int anoModelo;
    
    public Exemplo01_Subclasse(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor) 
    {
        super(modelo, placa, anoFabr, valor); // Construtor super é necessário
        setModelo(modelo);
        setPlaca(placa);
        setAnoFabr(anoFabr);
        setValor(valor);
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

/*
 * Compilação da classe Carro: erro no construtor!!!
 * "Implicit super constructor Exemplo01() is undefined. Must explicitly invoke another constructor"
 * Caso a superclasse possua construtor definido, a subclasse deve utilizá-lo para garantir integridade dos atributos básicos.
 * 
 * public Carro(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor)
 * {
 *     super (modelo, placa, anoFabr, valor);
 *     setPortas(numPortas);
 *     setAnoModelo(anoModelo);
 * }
 */