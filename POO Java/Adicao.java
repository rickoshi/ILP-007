// Adicao.java
// Programa de adicao que exibe a soma de dois numeros.
import java.util.Scanner;

public class Adicao {
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
   }
}