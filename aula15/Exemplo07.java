// TesteWindowListener.java
// Cria um frame que irá receber um WindowListener
// Utiliza a classe TrataWindow para adicionar um objeto listener na janela
// Quando utilizado, o listener encerra o programa main ao sair da janela

package aula15;

import javax.swing.JFrame;

public class Exemplo07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo");
        frame.setSize(300, 300);
        frame.setVisible(true);

        Exemplo06 tw = new Exemplo06();
        frame.addWindowListener(tw);
    }
}

/*
 * Tratamento de Eventos
 * Eventos: são acionados pelos programas com interface gráfica
 * Eventos mais comuns
 * – Gerados pelo teclado ou mouse
 * – A partir de botões
 * – A partir de menu
 */

/*
 * Event Listener
 * É um objeto preparado para receber informações de eventos;
 * A função de um listener é “escutar” eventos;
 * Espera um evento ocorrer a partir de uma ou mais fontes;
 * Para processar informações, precisamos implementar métodos (a partir de interfaces listeners);
 */

/*
 * Interfaces Java
 * São modelos de comportamentos;
 * Definem e padronizam serviços que uma classe pode oferecer;
 * Implementar uma interface é como assinar um contrato!
 * Ex: Interfaces gráficas (GUI) => Listener
 */