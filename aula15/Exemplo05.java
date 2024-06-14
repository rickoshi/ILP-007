// TesteOptionDialog.java
// Mostra uma caixa de diálogo com opções para o usuário
// Cria um vetor de objetos, onde cada objeto é atribuido como uma das opções da caixa de diálogo

package aula15;

import javax.swing.JOptionPane;

public class Exemplo05 {
    public static void main(String[] args) {
        Object[] options = {"OK", "CANCELA"};

        JOptionPane.showOptionDialog(null, "Clique OK para continuar", "Cuidado", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        /*
         * JOptionPane.showOptionDialog(parentComponent, message, title, 
         * optionType, messageType, icon, options, initialValue)
         * 
         * O showOptionDialog() utiliza um array de objetos indicando as possíveis escolhas do usuário
         * Podemos utilizar um array de objetos String para determinar todas os opções
         * Adicionamos essas opções no parâmetro "options"
         * Podemos definir "initialValue" usando o índice do array de objetos
         * 
         * Returna um inteiro dependendo da escolha do usuário
         * Ou CLOSED_OPTION se o usuário fechou a caixa de diálogo
         */
    }
}