// TiposDistintos.java
// Programa que lê e exibe tipos distintos de variáveis

package aula02;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner entr_Str = new Scanner(System.in);
        Scanner entr_Int = new Scanner(System.in);
        Scanner entr_Doub = new Scanner(System.in);

        String nome;
        int idade;
        double salario;

        System.out.println("Digite o nome:");
        nome = entr_Str.nextLine();

        System.out.println("Digite a idade:");
        idade = entr_Int.nextInt();

        System.out.println("Digite o salario:");
        salario = entr_Doub.nextDouble();

        System.out.println("Dados lidos:");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Idade: %d\n", idade);
        System.out.printf("Salario: R$%.2f\n", salario);

        entr_Str.close();
        entr_Int.close();
        entr_Doub.close();
    }
}

// System.out.println(input.nextLine());
// Também é possível exibir a saída sem atribuir o valor a alguma variável (ex: uso para testes)

/*
Entendendo o motivo de se utilizar outros Scanners para diferentes tipos de dados

O valor em Scanner é lido como todo o input do usuário, incluindo a tecla enter (representada por "\n")
O método nextLine() lê o valor de scanner como sendo "todo input da linha atual até a próxima linha" (caractere "\n"). Quando ele encontra o "\n", sua execução termina e o conteúdo do scanner é esvaziado por completo
O método nextInt() lê apenas a parte númerica do scanner, deixando o caractere "\n" ainda atribuido a scanner
Quando o próximo nextLine() for chamado, ele irá interpretar o "\n" scanner como o final da linha, e assim, também do input
Por isso, há um conflito em usar Strings e númericos: um dos métodos interpreta o caractere "\n" e o outro não

Método          Entrada     Scanner     Saída       Scanner após saída
nextLine()      Nome        Nome\n      Nome        
nextInt()       20          20\n        20          \n
nextLine()      -------     \n

Há maneiras de corrigir esse problema:
Uma delas é utilizar diferentes Scanners para diferentes tipos de variáveis
A outra é adicionar um método nextLine() vazio antes do scanner receber os dados de entrada, pois irá limpar "\n"

nome = input.nextLine();
idade = input.nextInt();
input.nextLine();
apelido = input.nextLine();

Método          Entrada     Scanner     Saída       Scanner após saída
nextLine()      Nome        Nome\n      Nome        
nextInt()       20          20\n        20          \n
nextLine()      -------     \n          
nextLine()      Apelido     Apelido\n   Apelido
*/