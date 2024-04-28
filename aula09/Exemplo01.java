// Veiculo.java
// Implementa uma superclasse Veiculo

package aula09;

public class Exemplo01 
{
    // Attributes
    private String modelo, placa;
    private int anoFabr;
    private double valor;

    // Constructor
    public Exemplo01(String pModelo, String pPlaca, int pAnoFabr, double pValor)
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
 * Herança
 * Cria uma nova classe a partir de uma classe existente:
 * – absorvendo os dados e comportamentos da classe existente; e
 * – aprimorando-a com novas capacidades.
 * Adota um relacionamento hierárquico entre classes
 * Permite melhor organização e reuso de código
 */

/*
 * Tipos de classes quanto a Herança
 * Subclasse ou classe derivada: 
 * – criada a partir de outra classe (classe mãe)
 * – herda características da classe mãe
 * – também possui características próprias
 * Superclasse ou classe base:
 * – concede características a classe derivada
 * Relação: Subclasse estende a superclasse
 */

/*
 * Herança – Hierarquia de classes
 * A superclasse representa um conjunto maior de objetos do que as subclasses.– Superclasse Veículo: representa carros, caminhões,bicicletas...
 * – Subclasse Carro: representa um subconjunto específico de veículos
 * Relação de hierarquia: “é um”
 * – Carro “é um” Veículo
 * 
 * A superclasse é mais geral do que suas subclasses.
 * Uma subclasse é uma especialização de uma superclasse;
 * A superclasse é uma generalização de subclasses;
 * 
 * Superclasse direta:
 * – Herdada explicitamente (um nível acima na hierarquia).
 * Superclasse indireta:
 * – Herdada de dois ou mais níveis acima na hierarquia.
 * 
 * Herança única:
 * – Herda de uma superclasse.
 * Herança múltipla:
 * – Herda de múltiplas superclasses.
 * – O Java não suporta herança múltipla.
 */

/*
 * Superclasse Object
 * O Java configura a superclasse de uma classe como Object quando a declaração não estender uma superclasse explicitamente.
 * A superclasse Object, no pacote java.lang, fica no topo da árvore de hierarquia de classe.
 * Toda classe é descendente, direta ou indireta, da classe Object.
 * Todas as classes que você usa ou escreve herda os métodos de instância de Object.
 * Não é necessário usar nenhum desses métodos, mas se for utilizar, talvez seja necessário substituí-los por um código específico para a classe.
 * 
 * Os métodos herdados de Object são:
 * - protected Object clone() throws CloneNotSupportedException
 *      Cria e retorna uma cópia deste objeto.
 * - public boolean equals(Object obj)
 *      Indica se algum outro objeto é "igual a" este.
 * - protected void finalize() throws Throwable
 *      Chamado pelo coletor de lixo em um objeto quando determinado que não há mais referências ao objeto
 * - public final Class getClass()
 *      Retorna a classe runtime de um objeto.
 * - public int hashCode()
 *      Retorna um valor de código hash para o objeto.
 * - public String toString()
 *      Retorna uma representação de String do objeto.
 */

/*
 * Exemplo – Classe Veículo
 * Atributos básicos
 * – Modelo
 * – Placa
 * – Ano Fabricação
 * – Valor
 * 
 * Métodos básicos
 * – Sets e gets
 * – Depreciar valor do veículo
 * – Impressão dos dados
 */