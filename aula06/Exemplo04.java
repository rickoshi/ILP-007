// InitArray04.java
// Utilização do laço for-each para percorrer todos os itens de apenas um vetor

package aula06;

public class Exemplo04
{
    public static void main(String[] args)
    {
        int[] arrayNum = {87, 68, 52, 5, 49, 83, 45, 12, 64};
        int total = 0;
        int diaDoMes[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int diasAno = 0;
        String meses[] = {"", "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out" ,"Nov" ,"Dez"};

        //ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
        for(int i : arrayNum)
            total += i;
        System.out.printf("Total de elementos arrayNum: %d\n", total);

        // Uso do for-each para cada item do vetor diaDoMes[]
        System.out.print("Quantidade de dias que cada mes possui: ");
        for (int i : diaDoMes) {
            // Condição para não imprimir o primeiro elemento (diaDoMes[0] = 0)
            if (i > 0) {
                System.out.printf("%02d, ", i);
            }
            diasAno += i;
        }
        System.out.printf("\nTotal de dias no ano: %d\n", diasAno);

        // Uso do for-each para cada item do vetor meses[]
        System.out.print("Os meses do ano sao: ");
        for (String s : meses) {
            // Condição para não imprimir o primeiro elemento (meses[0] = "")
            if (s != "") {
                System.out.printf("%s ", s);
            }
        }
    }
}

/*
 * for-each loop
 * Usado exclusivamente para fazer loop através de elementos em arrays
 * Sintaxe:
 * for ( <tipo> <var> : <array> )
 * 
 * Cada elemento do array será atribuido a uma variavel espeficada no loop (<tipo> <var>)
 * O tipo de variável precisa ser o mesmo dos elementos do vetor (int i = int diaDoMes[], String s = String meses[])
 * As instruções serão executadas para cada item do vetor:
 * O primeiro elemento (index = 0) será atribuido para a variável e o compilador executará as operações dentro do loop
 * Após a execução das instruções, o compilador atribui o valor do próximo elemento do vetor para a variável
 * 
 * Não utiliza uma variável contadora e é mais legível
 * Porém não realiza operações fora do vetor (Como imprimir os dias junto com os meses)
 */