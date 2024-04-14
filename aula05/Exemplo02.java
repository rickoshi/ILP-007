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