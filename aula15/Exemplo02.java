package aula15;

import javax.swing.JOptionPane;

public class Exemplo02 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Teste dialogo PLAIN_MESSAGE", "Mensagem normal", 3);
//                                             ^                                 ^                              ^               ^
//                                          Posição                          Mensagem                         Título          Ícone
    }
}

/*
 * Container: Caixas de diálogo
 * JOptionPane:
 * – showMessageDialog(): informativo (só 1 botão)
 * – showConfirmDialog(): possui opções padrão
 * – showInputDialog(): entrada de dados
 * – showOptionDialog(): com várias opções
 */

/*
 * Tipos de mensagem
 * Define o ícone a ser apresentado:
 * – ERROR_MESSAGE 
 * – INFORMATION_MESSAGE 
 * – WARNING_MESSAGE 
 * – QUESTION_MESSAGE 
 * – PLAIN_MESSAGE
 */