package aula14.src;

public abstract class FormaGeometrica 
{
    protected int lados;
    
    public void setLados(int lados) throws Exception {
        if (lados < 0)
            throw new Exception("Numero de lados negativo");
        else
            this.lados = lados;
    }

    public abstract double area();

    public void imprime() {
        System.out.println("Numero de lados: " + lados);
        System.out.printf("Area: %.2f\n", area());
    }
}