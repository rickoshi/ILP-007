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
        String num1 = JOptionPane.showInputDialog(null, "Numero 1", "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);
        String num2 = JOptionPane.showInputDialog(null, "Numero 2", "Soma de dois inteiros", JOptionPane.PLAIN_MESSAGE);

        JOptionPane.showMessageDialog(null, "A soma dos dois numeros foi: " + (Integer.parseInt(num1) + Integer.parseInt(num2)), "Soma de dois inteiros", JOptionPane.INFORMATION_MESSAGE);
    }
}
