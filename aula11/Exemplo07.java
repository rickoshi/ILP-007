// Retangulo.java
// Subclasse que concreta o método area()
// Sobrescreve o método imprime() com o método da classe super e adiciona os atributos "base" e "altura"
// Herda o método imprime() com os lados e a area()

package aula11;

public class Exemplo07 extends Exemplo05
{
    private double base, altura;

    public Exemplo07(double base, double altura) {
        super.setLados(4);
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) {
        if (base < 0) this.base = 0;
        else this.base = base;
    }

    public void setAltura(double altura) {
        if (altura < 0) this.altura = 0;
        else this.altura = altura;
    }

    public double area() {
        return base * altura;
    }

    public void imprime() {
        System.out.println("Dados do retangulo: ");
        super.imprime();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}

/*
 * Subclasse Retangulo
 * 
 * Atributos básicos
 * – Base
 * – Altura
 * 
 * Métodos
 * – Sets/ Gets
 * – Construtor (base, altura)
 * – area( )
 * – imprime( )
 */