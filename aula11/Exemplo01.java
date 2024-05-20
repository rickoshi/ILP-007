// FormaGeometrica.java
// Classe abstrata com método abstrato area() e método imprime(), para imprimir lados

package aula11;

public abstract class Exemplo01 
{
    // Atributo protected para herança (todas as subclasses possuirão)
    protected int lados;

    // Método concreto setter do atributo lados
    public void setLados(int lados) {
        if (lados < 0) this.lados = 0;
        else this.lados = lados;
    }

    // Método abstrato
    public abstract double area();

    // Método concreto
    public void imprime() {
        System.out.println("Numero de lados: " + lados);
    }
}

/*
 * Aulas Anteriores
 * Herança: 
 * – Criação de uma nova classe a partir de uma classe existente, permitindo melhor organização e reuso de código.
 * – Adota um relacionamento hierárquico entre classes.
 * Polimorfismo:
 * – Princípio pelo qual várias classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos.
 * 
 * Podemos afirmar que: 
 * Todo Carro “é um” Veículo, mas nem todo Veículo é um carro.
 * Todo Caminhão “é um” Veículo.
 */

/*
 * Classe Abstrata
 * - Classes demasiadamente gerais para criar objetos reais;
 * - Utilizadas como superclasses para subclasses concretas;
 * - Declara atributos e comportamentos (métodos) comuns das várias classes em uma hierarquia;
 * - Contém um ou mais métodos abstratos;
 * - Utiliza palavra abstract para declarar uma classe abstrata ou um método abstrato;
 * - Tentar instanciar um objeto de uma classe abstrata é um erro de compilação.
 */

/*
 * Exemplo - Formas geométricas
 * área( )
 * Triângulo: área = (b x h)/2
 * Retângulo: área = b x h
 * Círculo: área = π x r2
 * 
 * Atributos básicos
 * – Número de lados
 * Métodos
 * – Set/ get número de lados: métodos não abstratos
 * – Área: método abstrato
 * – Imprime(): método não abstrato
 * – Precisa construtor?
 */

/*
 * Classe concreta X superclasse abstrata
 * - Classes abstratas contêm um ou mais métodos abstratos.
 * No caso da forma geométrica: método area() é um exemplo de método abstrato.
 * Todas as subclasses concretas devem sobrescrever todos os métodos abstratos herdados. No caso do círculo, devemos sobrescrever o método area().
 */