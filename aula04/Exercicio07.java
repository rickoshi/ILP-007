package aula04;

public class Exercicio07 
{
    private double raio;

    public Exercicio07(double r)
    {
        setRaio(r);
    }

    public void setRaio(double r)
    {
        if (r < 0) {
            System.out.println("O raio nao pode ser negativo");
        }
        else
        {
        raio = r;
        }
    }

    public double getRaio()
    {
        return raio;
    }

    public double calcularDiametro()
    {
        return raio * 2;
    }

    public double calcularArea()
    {
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularCircunferencia()
    {
        return 2 * Math.PI * raio;
    }

    public void exibeDados()
    {
        System.out.println("Circulo de Raio: " + getRaio());
        System.out.println("Diametro: " + calcularDiametro());
        System.out.println("Circunferencia: " + calcularCircunferencia());
        System.out.printf("Area: " + calcularArea());
        System.out.printf("\n\n");
    }


}