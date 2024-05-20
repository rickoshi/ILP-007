// CirculoV2.java
// Subclasse que concreta o método area()
// Sobrescreve o método imprime() com o método da classe super e adiciona o atributo "raio"

package aula11;

public class Exemplo04 extends Exemplo01 
{
    private double raio;

    public void setRaio(double raio) {
        if (raio < 0) this.raio = 0;
        else this.raio = 0;
    };

    public Exemplo04(double raio) {
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

/*
 * Mais alterações...
 * Como imprimir área da forma geométrica instanciada? No caso, a área do circulo...
 * – Altero método imprime() na classe Círculo?
 * Podemos alterar na classe Círculo, mas se possuirmos outras classes que também utilizarão o mesmos método, 
 * 
 * 
 * – Ou na FormaGeometrica?
 * Redefinir método imprime() incluindo área.
 */