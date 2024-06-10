package aula14.src;

public class Retangulo extends FormaGeometrica
{
    private double base, altura;

    public Retangulo(double base, double altura) throws Exception {
        super.setLados(4);
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) throws Exception {
        if (base < 0) 
            throw new Exception("Retangulo com base negativa");
        else 
            this.base = base;
    }

    public void setAltura(double altura) throws Exception {
        if (altura < 0) 
            throw new Exception("Retangulo com altura negativa");
        else 
            this.altura = altura;
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