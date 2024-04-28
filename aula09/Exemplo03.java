// CarroImprimePrivate.java
// Subclasse que herda a superclasse Veiculo, com método construtor super
// Possui método imprimir específico da classe Carro, que não pode ser utilizado

package aula09;

public class Exemplo03 extends Exemplo01 
{
    private int numPortas;
    private int anoModelo;
    
    public Exemplo03(String modelo, String placa, int anoFabr, int anoModelo, int numPortas, double valor) 
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

    // public void imprime() {
        // System.out.printf("\nVeiculo: %s\nPlaca: %7s", modelo, placa);
        // System.out.printf("\nFabr: %4d\nModelo: %4d", anoFabr, anoModelo);
        // System.out.printf("\n%02d Portas\nR$ %.2f\n", numPortas, valor);
    // }

    /*
     * Os Atributos tem acesso privado, e não podem ser executados
     *   The field Exemplo01.modelo is not visible
     *   The field Exemplo01.placa is not visible
     *   The field Exemplo01.anoFabr is not visible
     *   The field Exemplo01.valor is not visible
     */
}

/*
 * Herança – Acesso aos membros
 * Acesso public:
 * – Subclasses acessam diretamente membros public de sua superclasse.
 * Acesso private:
 * – Subclasses não acessam diretamente atributos private da superclasse. Apenas por meio de métodos não-private.
 * 
 * Acesso protected:
 * – Subclasses acessam diretamente membros protected de sua superclasse.
 * – Pode ser usada a palavra-chave “super.”
 * – Também são acessíveis a classes de um mesmo pacote (conjunto de classes)
 */