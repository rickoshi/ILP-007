package aula05;

public class Exercicio09_Teste {
    public static void main(String[] args)
    {
        Exercicio09 data1, data2, data3, data4;
        data1 = new Exercicio09(28, 02, 2024);
        data2 = new Exercicio09(29, 02, 2024);
        data3 = new Exercicio09(30, 02, 2024);
        data4 = new Exercicio09(29, 02, 2025);

        System.out.println(data1.FormatarData());
        System.out.println(data2.FormatarData());
        System.out.println(data3.FormatarData());
        System.out.println(data4.FormatarData());
    }
}