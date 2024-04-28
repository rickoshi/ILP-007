// VeiculoProtected.java
// Implementa uma superclasse Veiculo
// Utiliza atributos protected, acessíveis para as subclasses

package aula09;

public class Exemplo04_SpVeiculo
{
    // Attributes
    protected String modelo, placa;
    protected int anoFabr;
    protected double valor;

    // Constructor
    public Exemplo04_SpVeiculo(String pModelo, String pPlaca, int pAnoFabr, double pValor)
    {
        setModelo(pModelo);
        setPlaca(pPlaca);
        setAnoFabr(pAnoFabr);
        setValor(pValor);
    }

    // Setters/Getters
    public void setModelo(String pModelo) {
        modelo = pModelo;
    }

    public String getModelo() {      
        return this.modelo;  // uso opcional nesse caso
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }  

    public void setAnoFabr(int anoFabr) { 
        this.anoFabr = anoFabr;
    }
    
    public int getAnoFabr() {
        return anoFabr;
    }  
    
    public void setValor(double valor)
    { 
        if (valor >= 0)
            this.valor = valor;
        else
            this.valor = 0;
    }
    
    public double getValor() {
        return valor;
    }  

    // Class methods
    public void deprecia(float taxa)
    {
        setValor(valor - valor * taxa/100);
    }
        
    public void imprime()
    {
        System.out.printf(" \nVeiculo: %s\nPlaca: %7s\nAno: %4d\nValor: R$%.2f\n",
        modelo, placa, anoFabr, valor);
    }
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