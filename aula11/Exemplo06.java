// CirculoV3.java
// Subclasse que concreta o método area()
// Sobrescreve o método imprime() com o método da classe super e adiciona o atributo "raio"
// Herda o método imprime() com os lados e a area()

package aula11;

public class Exemplo06 extends Exemplo05
{
    private double raio;

    public void setRaio(double raio) {
        if (raio < 0) this.raio = 0;
        else this.raio = 0;
    };

    public Exemplo06(double raio) {
        setRaio(raio);
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    // sobrescreve imprime()
    public void imprime() {
        System.out.println("Dados do circulo: ");
        super.imprime(); // Chama o método da superclasse (imprime lados)
        System.out.println("Raio: " + raio);
    }
}