// TesteShowMessage.java
// Utiliza do container Caixa de Diálogo para mostrar uma mensagem

package aula15;

import javax.swing.JOptionPane;

public class Exemplo02 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Teste dialogo PLAIN_MESSAGE", "Mensagem normal", JOptionPane.PLAIN_MESSAGE);
//                                      ^                 ^                        ^         		 ^
//                                   Posição           Mensagem                  Título                Ícone

// A "Posição" indica o parentComponent, o frame no qual o JOptionPane é mostrado, se for null, apresenta um frame default
// O Ícone pode ser determinado por String (WARNING_MESSAGE) ou int (2)
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
 * – ERROR_MESSAGE          (0)
 * – INFORMATION_MESSAGE    (1)
 * – WARNING_MESSAGE        (2)
 * – QUESTION_MESSAGE       (3)
 * – PLAIN_MESSAGE          (4)
 */