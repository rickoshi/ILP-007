// Adicao.java
// Programa de adicao que exibe a soma de dois numeros.

import java.util.Scanner;

public class Exemplo02 {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int num1;
      int num2;
      int soma;
      
      System.out.print("Digite o primeiro numero: ");
      num1 = input.nextInt();
      
      System.out.print("Digite o segundo numero: ");
      num2 = input.nextInt();
      
      soma = num1 + num2;
      
      System.out.printf("A soma e %d\n", soma);
      input.close(); // Resource leak: 'input' is never closed 
      // É importante fechar tudo que se abre, para isso, utiliza-se o método .close()
   }
}

/*
Entrada de dados – Classe Scanner
- Pertence ao pacote java.util
- Cláusula import: aparecer antes da definição da classe
import java.util.Scanner;
*/

/*
Classe Scanner X objeto input (variável do tipo Scanner)
*/

/*
Exemplo
// declaração da variável input
Scanner input;

// instanciando objeto: alocado espaço na memória do computador
input = new Scanner (System.in);

// chamando métodos a partir do objeto input
num1 = input.nextInt( );
num2 = input.nextFloat( );
num3 = input.nextDouble( );
nome = input.nextLine( );
Métodos públicos da classe Scanner chamados a partir do objeto input
*/