/*
* Atividade 12 – Classe Retângulo + UML
* Modele e implemente uma classe que represente um Retângulo a partir de seus atributos: base e altura
* Ela deve ser capaz de instanciar objetos a partir de 2 parâmetros (base e altura)
* Caso base e altura não sejam informados, instancie um retângulo de base = 2 e altura = 1;
* Cada instância deve ser capaz de:
* Devolver os valores de: Área; Perímetro; Base; Altura;
* Informar se o objeto é um quadrado (boolean)
* Imprimir todas as informações sobre o objeto instanciado
* Elabore o diagrama de Classes (jgrasp ou word ou qualquer editor).
* */

package aula07;

public class Exercicio12 {
    // Class Attributes
    private double base;
    private double altura;


    // Constructors
    public Exercicio12(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    public Exercicio12(){
        setBase(2);
        setAltura(1);
    }


    // Setters
    public void setBase(double base) {
        if (base < 0) {
            this.base = 2;
            System.out.println("Valor da base invalida. Valor da base = 2.");
        }
        else
            this.base = base;
    }

    public void setAltura(double altura) {
        if (altura < 0) {
            this.altura = 1;
            System.out.println("Valor da altura invalida. Valor da altura = 1.");
        }
        else
            this.altura = altura;
    }


    // Getters
    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getPerimetro() {
        return 2 * (base + altura);
    }

    public double getArea() {
        return base * altura;
    }


    // Class methods
    public boolean informaQuadrado() {
        return base == altura;  // If-else simplificado para condição base == altura
    }

    public void imprimirDados() {
        System.out.println("\n=================================");
        System.out.printf("Base     : %.2f", getBase());
        System.out.printf("\nAltura   : %.2f", getAltura());
        System.out.printf("\nPerimetro: %.2f", getPerimetro());
        System.out.printf("\nArea     : %.2f", getArea());
        System.out.printf("\nQuadrado : %s", informaQuadrado());
        System.out.println("\n=================================");
    }
}