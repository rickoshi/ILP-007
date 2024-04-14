// Atividade - Classe Data
// Altere a classe Data incluindo o método bissexto() que informa se o ano é bissexto ou não (devolve booleano);
// Utilize este método para validar a quantidade de dias de fevereiro dentro do método checkDia();

package aula05;

public class Exercicio01 {
    private int dia;
    private int mes;
    private int ano;

    public Exercicio01(int dia, int mes, int ano)
    {
        setData(dia, mes, ano);
    }
    
    public Exercicio01(int mes, int ano)
    {
        setData(1, mes, ano);
    }
    
    public Exercicio01(int ano)
    {
        setData(1, 1, ano);
    }

    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    
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

    private int checkDia(int diaTeste)
    {
        if (bissexto(ano))
        {
            int diaMes[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (diaTeste > 0 && diaTeste <= diaMes[mes])
            {
                return diaTeste;
            }
            else
            {
                System.out.println("Dia " + diaTeste + " invalido. Configurado dia = 1.");
                return 1;
            }
        }
        else
        {
            int diaMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (diaTeste > 0 && diaTeste <= diaMes[mes])
            {
                return diaTeste;
            }
            else
            {
                System.out.println("Dia " + diaTeste + " invalido. Configurado dia = 1.");
                return 1;
            }
        }

    }

/*
 * Se o ano não termina em 00, ele é bissexto caso seja divisível por 4. Exemplos: 1988, 1992, 1996, 2004, e assim por diante. 
 * Um ano é estimado em aproximadamente 365 dias, 5 horas, 48 minutos e 46 segundos, a diferença de menos de 12 minutos causa erros a cada cerca de 120 anos. 
 * Logo, a regra para os anos terminados em 00 é: O ano terminado em 00 será bissexto se for divisível por 400. 
 */
    public boolean bissexto(int ano)
    {
        if(ano % 10 != 0 && ano % 4 == 0)
        {
            return true;
        }
        else
        {
            if (ano % 10 == 0 && ano / 400 == 0) {
                return true;
            }
            else
            return false;
        }
    }

    public String FormatarData()
    {
        return dia + "/" + mes + "/" + ano;
    }
}