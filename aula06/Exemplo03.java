// InitArray03.java
// Cria um vetor para a quantidade de dias no mês e outro para o nome do mês
// Imprime o diaDoMes e os meses relacionando seus índices (diaDoMes[1] = 31, meses[1] = "Jan")

package aula06;

public class Exemplo03
{
    public static void main(String[] args)
    {
        int diaDoMes[] = 
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String meses[] = 
            {"", "Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out" ,"Nov" ,"Dez"};

        System.out.printf("%s %9s\n", "Mes" ,"Dias");
        for (int i = 0; i < diaDoMes.length; i++) {
            System.out.printf("%02d (%3s) %4d\n", i, meses[i], diaDoMes[i]);
        }
    }
}

/*
 * Inicializando array com uma lista
 * Utiliza a lista inicializadora:
 * – Itens entre chaves ({ }).
 * – Itens em uma lista separada por vírgulas.
 * int n[] = { 10, 20, 30, 40, 50 }
 * – Cria um array de cinco elementos.
 * – Indexa valores de 0, 1, 2, 3, 4.
 * Não precisa da palavra-chave new.
 */