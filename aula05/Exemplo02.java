// DataSobrecarregada.java
// Implementar uma classe que receba como entrada inteiros, valide o dia, mês e ano e mostre como saída a data formatada

package aula05;

public class Exemplo02 {
    private int dia;    // 1 a 31, de acordo com o mês
    private int mes;    // 1 a 12
    private int ano;    // qualquer ano

    // Métodos Construtores com sobrecarga
    // Construtor existente
    public Exemplo02(int dia, int mes, int ano)
    {
        setData(dia, mes, ano);
    }

    // Construtor com mês e ano
    public Exemplo02(int mes, int ano)
    {
        setData(1, mes, ano);
    }

    // Construtor com apenas ano
    public Exemplo02(int ano)
    {
        setData(1, 1, ano);
    }

    // Métodos getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Métodos específicos da classe
    public void setData(int dia, int mes, int ano)
    {
        if (mes > 0 && mes <= 12)
        {
            this.mes = mes;
        }
        else
        {
            mes = 1;
            System.out.println("Mes: " + mes + " invalido. Configurado mes = 1.");
        }
        this.ano = ano;
        this.dia = checkDia(dia);
    }

    private int checkDia(int diaTeste)   // Método privado: uso interno da classe
    {
        int diaMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (diaTeste > 0 && diaTeste <= diaMes[mes])
        {
            return diaTeste;
        }
        else // Esse else pode ser omitido, já que: se a condição for verdadeira, a função retorna o valor e se encerra antes.
        {
            System.out.println("Dia " + diaTeste + " invalido. Configurado dia = 1.");
            return 1;
        }
    }

    public String FormatarData()
    {
        return dia + "/" + mes + "/" + ano;
    }
}

/*
 * Pergunta importante
 * Sobrecarga de métodos só funciona para método construtor?
 * A sobrecarga de métodos não está limitada apenas a construtores. A sobrecarga de métodos permite que você defina vários métodos com o mesmo nome em uma classe, mas com diferentes listas de parâmetros. Isso permite que você use o mesmo nome de método para realizar operações semelhantes, mas com diferentes tipos de dados ou números de parâmetros.
 * Embora a sobrecarga de métodos seja frequentemente associada à criação de múltiplos construtores em uma classe, ela pode ser usada em qualquer método dentro de uma classe. 
 * 
 * public class Sobrecarga
 * {
 *    public void metodo(int x) 
 *    {
         System.out.println("Método com um parâmetro inteiro: " + x);
 *    }
 *    public void metodo(String s) 
 *    {
 *       System.out.println("Método com uma string: " + s);
 *    }
 *    public void metodo(int x, String s)
 *    {
 *       System.out.println("Método com um parâmetro inteiro e uma string: " + x + ", " + s);
 *    }
 * }
 */