package aula14.src;

public class Triangulo extends FormaGeometrica
{
    private double base, altura;

    public Triangulo(double base, double altura) throws Exception{
        super.setLados(3);
        setBase(base);
        setAltura(altura);
    }

    public void setBase(double base) throws Exception {
        if (base < 0) 
            throw new Exception("Triangulo com base negativa");
        else 
            this.base = base;
    }

    public void setAltura(double altura) throws Exception {
        if (altura < 0) 
            throw new Exception("Triangulo com altura negativa");
        else 
            this.altura = altura;
    }

    public double area() {
        return (base * altura)/2;
    }

    public void imprime() {
        System.out.println("Dados do triangulo: ");
        super.imprime();
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
    }
}