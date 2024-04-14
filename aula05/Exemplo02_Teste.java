// TesteDataSobrecarregada.java
// Utiliza a classe DataSobrecarregada para criar um objeto Data()
// O método construtor pode possuir 1, 2, ou 3 parâmetros, de acordo com a atribuição do objeto

package aula05;

public class Exemplo02_Teste {
    public static void main(String[] args)
    {
        Exemplo02 data1, data2, data3;
        data1 = new Exemplo02(20, 03, 2024);
        data2 = new Exemplo02(2022);
        data3 = new Exemplo02(06, 2025);

        System.out.println("Hoje é " + data1.FormatarData() + ". Ingressei no segundo semestre de " + data2.getAno() + " e me formarei em " + data3.getMes() + "/" + data3.getAno());
    }
}