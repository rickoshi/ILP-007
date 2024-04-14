package aula05;

public class Exercicio01_Teste {
    public static void main(String[] args)
    {
        Exercicio01 data1, data2, data3, data4;
        data1 = new Exercicio01(28, 02, 2024);
        data2 = new Exercicio01(29, 02, 2024);
        data3 = new Exercicio01(30, 02, 2024);
        data4 = new Exercicio01(29, 02, 2025);

        System.out.println(data1.FormatarData());
        System.out.println(data2.FormatarData());
        System.out.println(data3.FormatarData());
        System.out.println(data4.FormatarData());
    }
}