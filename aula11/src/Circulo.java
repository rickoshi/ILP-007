package aula11.src;

public class Circulo extends FormaGeometrica
{
    private double raio;

    public void setRaio(double raio) {
        if (raio < 0) this.raio = 0;
        else this.raio = 0;
    };

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }

    public void imprime() {
        System.out.println("Dados do circulo: ");
        super.imprime();
        System.out.println("Raio: " + raio);
    }
}