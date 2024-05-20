// FormaGeometricaV2.java
// Classe abstrata com método abstrato area()
// Possui o método imprime() para imprimir lados, e a area() - eventualmente definida nas subclasses

package aula11;

public abstract class Exemplo05 
{
    protected int lados;

    public void setLados(int lados) {
        if (lados < 0) this.lados = 0;
        else this.lados = lados;
    }

    // Método abstrato
    public abstract double area();

    public void imprime() {
        System.out.println("Numero de lados: " + lados);
        System.out.printf("Area: %.2f\n", area());
    }
}

/*
 * O método imprime() foi alterado para imprimir também a área da forma geométrica,
 * permitindo codificar apenas um método, válido para todas as subclasses.
 * Se não fosse usado o recurso, todas as subclasses precisariam adicionar a
 * impressão do método area() no método imprime()
 * 
 * Ex:
 * // FormaGeometrica.imprime()
 * public void imprime() {
 *     System.out.println("Numero de lados: " + lados);  // imprime() lados
 * }
 * 
 * // Circulo.imprime()
 * public void imprime() {
 *     System.out.println("Dados do circulo: ");
 *     super.imprime();                             // imprime() lados
 *     System.out.println("Raio: " + raio);
 *     System.out.printf("Area: %.2f\n", area());   // imprime() area()
 * }
 * 
 * // Retangulo.imprime()
 * public void imprime() {
 *     System.out.println("Dados do circulo: ");
 *     super.imprime();                             // imprime() lados
 *     System.out.println("Base: " + base);
 *     System.out.println("Altura: " + altura);
 *     System.out.printf("Area: %.2f\n", area());   // imprime() area()
 * }
 * 
 * // Triangulo.imprime()
 * public void imprime() {
 *     System.out.println("Dados do circulo: ");
 *     super.imprime();                             // imprime() lados
 *     System.out.printf("Area: %.2f\n", area());   // imprime() area()
 * }
 * 
 * 
 * 
 * 
 * Se utilizarmos o método imprime() para imprimir a área() na classe abstrata, ao invés de em todas as subclasses,
 * mesmo que a area() não definida concretamente, podemos reduzir o retrabalho e a redundância do código.
 * Uma linha a mais na classe abstrata pode reduzir inúmeras linhas nas subclasses.
 * 
 * // FormaGeometrica.imprime()
 * public void imprime() {
 *     System.out.println("Numero de lados: " + lados);  // imprime() lados
 *     System.out.printf("Area: %.2f\n", area());   // imprime() area()
 * }
 * 
 * // Circulo.imprime()
 * public void imprime() {
 *     System.out.println("Dados do circulo: ");
 *     super.imprime();                             // imprime() lados, imprime() area()
 *     System.out.println("Raio: " + raio);
 * }
 * 
 * // Retangulo.imprime()
 * public void imprime() {
 *     System.out.println("Dados do circulo: ");
 *     super.imprime();                             // imprime() lados, imprime() area()
 *     System.out.println("Base: " + base);
 *     System.out.println("Altura: " + altura);
 * }
 * 
 * // Triangulo.imprime()
 * public void imprime() {
 *     System.out.println("Dados do circulo: ");
 *     super.imprime();                             // imprime() lados, imprime() area()
 * }
 */
