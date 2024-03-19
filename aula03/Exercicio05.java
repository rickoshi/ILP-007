/* Atividade 05 – Conta bancária
Numa agência bancária, as contas são identificadas por números de até 6 dígitos seguidos de um dígito verificador, calculado da seguinte forma:
Ex.: Seja n = 7314 o número da conta.
1) Obtemos a soma dos dígitos de n: s = 7+3+1+4 = 15
2) Obtemos o dígito verificador a partir do resto da divisão de s por 10: d = s % 10 = 15 % 10 = 5
O número da conta é: 007314-5
Dado um número de conta n, exiba o número de conta completo correspondente.
*/

package aula03;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        // n = número da conta, s = soma dos dígitos, d = digito verificador
        // a = variável local que armazena o resto a cada repetição,  b = variável local de controle da repetição while
        int n, s, d, a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o numero da conta? ");
        n = input.nextInt();
        b = n;
        s = 0;
        // o valor de n permanecerá o mesmo depois da repetição, enquanto o valor de b mudará
        // s é inicializado com valor 0 para poder receber seu próprio valor e somá-lo com o próximo valor do resto por 10

        while (b != 0) {
            a = b % 10;     // a cada repetição, a recebe o valor do último dígito do número da conta
            b = b / 10;     // a cada repetição, b recebe seu próprio valor e elimina o último dígito pelo divisão por 10
            s = s + a;      // a cada repetição, s recebe seu prório valor e soma com o resto de a (último dígito da conta) 
        }
        d = s % 10;         // d recebe o resto do valor da soma dos dígitos por 10

        // System.out.println(n);   7314
        // System.out.println(s);   15
        // System.out.println(d);   5
        // System.out.println(a);   // Não foi inicializada
        // System.out.println(b);   0
        
        System.out.printf("O numero de conta completo e %06d-%d", n, d);
        input.close();
    }
}