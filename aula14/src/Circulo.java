package aula14.src;

public class Circulo extends FormaGeometrica
{
    private double raio;

    public void setRaio(double raio) throws Exception {
        if (raio < 0)
            throw new Exception("Circulo com raio negativo");
        else
            this.raio = raio;
    };

    public Circulo(double raio) throws Exception {
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