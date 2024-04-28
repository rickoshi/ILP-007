// TesteVeiculo.java
// Cria um objeto da classe Veiculo e utiliza os métodos deprecia() e imprime()

package aula09;

public class Exemplo01_Teste {
    public static void main(String[] args) {
        Exemplo01 v = new Exemplo01("Fiesta", "ABC1678", 2007, 34000);
        v.imprime();

        v.deprecia(10);
        System.out.println("Veiculo depreciado");
        v.imprime();
    }
}
