// Atividade - Classe Data
// Altere a classe Data incluindo o método bissexto() que informa se o ano é bissexto ou não (devolve booleano);
// Utilize este método para validar a quantidade de dias de fevereiro dentro do método checkDia();

package aula05;

public class Exercicio09Alternativo {
    private int dia;
    private int mes;
    private int ano;

    public Exercicio09Alternativo(int dia, int mes, int ano)
    {
        setData(dia, mes, ano);
    }
    
    public Exercicio09Alternativo(int mes, int ano)
    {
        setData(1, mes, ano);
    }
    
    public Exercicio09Alternativo(int ano)
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
    	int diaMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    	if(bissexto(ano))
    		diaMes[2] = 29;
    	if (diaTeste > 0 && diaTeste <= diaMes[mes])
    		return diaTeste;
    	System.out.println("Dia " + diaTeste + "invalido. Configurado dia = 1.");
    	return 1;
    }

    private boolean bissexto(int anoTeste)
    {
    	if((anoTeste%4==0 && anoTeste%100!=0) || (anoTeste%400==0))
    		return true;
    	return false;
    }

    public String FormatarData()
    {
        return dia + "/" + mes + "/" + ano;
    }
}