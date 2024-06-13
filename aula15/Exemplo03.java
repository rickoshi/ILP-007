// TesteConfirmDialog.java
// Mostra uma diálogo de confirmação alinhado ao frame
// Mostra outra mensagem ao clicar em uma das opções

package aula15;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exemplo03 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(300, 300);
        frame.setVisible(true);

        /*
         * JOptionPane.showConfirmDialog(parentComponent, message, title,
         * optionType, messageType);
         * 
         * Returna um inteiro dependendo da escolha do usuário
         * Atribuimos uma varíavel ao objeto do JOptionPane, já que este retorna um inteiro
         */

        int op = JOptionPane.showConfirmDialog(frame, "Deseja finalizar a execucao?", "Saida", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (op == 0)
            JOptionPane.showMessageDialog(null, "Encerrando programa", "Saida", JOptionPane.PLAIN_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "Voltando ao programa", "Retorna", JOptionPane.PLAIN_MESSAGE);
    }
}

/*
 * Caixa de diálogo: ConfirmDialog
 * JoptionPane.showConfirmDialog:
 * – DEFAULT_OPTION;
 * – YES_NO_OPTION;
 * – YES_NO_CANCEL_OPTION;
 * – OK_CANCEL_OPTION.
 */