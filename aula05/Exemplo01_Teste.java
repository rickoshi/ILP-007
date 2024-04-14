// Teste_Data
// Utiliza a classe Data para criar um objeto Data(int dia, int mes, int ano)
// Após validação da entrada, utiliza o método FormatarData() para imprimir a data formatada

package aula05;

public class Exemplo01_Teste {
    public static void main(String[] args) {
        Exemplo01 data = new Exemplo01(06, 04, 2024);
        System.out.println("Meu aniversario: " + data.FormatarData());

        data.setData(31, 02, 2024);
        System.out.println("Que data e essa? " + data.FormatarData());
    }
}