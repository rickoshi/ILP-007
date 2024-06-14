/*
 * Sugestão de Atividade
 * SomaDoisInteiros.java
 * Escreva um programa que use o inputDialog para ler dois valores inteiros e exiba uma caixa de diálogo com sua soma.
 * Dica: use Integer.parseInt(s) para converter a String em inteiro;
 */

package aula15;

import javax.swing.JOptionPane;

public class Exercicio01 {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog(null, "Numero 1", "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        String input2 = JOptionPane.showInputDialog(null, "Numero 2", "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);

        int num1 = Integer.parseInt(input1);
        int num2 = Integer.parseInt(input2);
        
        JOptionPane.showMessageDialog(null, "A soma dos dois numeros foi: " + (num1 + num2), "Soma de dois inteiros", JOptionPane.INFORMATION_MESSAGE);
    }
}