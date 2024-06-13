// TesteInputDialog.java
// Mostra uma caixa de diálogo onde se pode fazer entrada de dados
// Atribui o input do user a uma variável e mostra na tela

package aula15;

import javax.swing.JOptionPane;

public class Exemplo04 {
    public static void main(String[] args) {
        // showInputDialog() retorna o user input, que é atribuido a uma variável
        String s = JOptionPane.showInputDialog(null, "Digite um numero", "Entrada de dados", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "O numero selecionado foi: " + s, "Saida", JOptionPane.PLAIN_MESSAGE);
    }
}