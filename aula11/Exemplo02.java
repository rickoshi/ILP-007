// Circulo.java
// Subclasse que concreta o método area(), mas usa o método imprime() da classe super

package aula11;

import java.lang.Math;

public class Exemplo02 extends Exemplo01 
{
    private double raio;

    public void setRaio(double raio) {
        if (raio < 0) this.raio = 0;
        else this.raio = 0;
    };

    public Exemplo02(double raio) {
        setRaio(raio);
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}