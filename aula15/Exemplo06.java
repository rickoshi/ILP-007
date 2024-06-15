// TrataWindow.java
// Implementa a interface WindowListener para definir métodos listeners
// Faz override no método windowClosing para sair do programa

package aula15;

import java.awt.event.*;

public class Exemplo06 implements WindowListener {
    @Override public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowOpened(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}
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