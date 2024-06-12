// TesteFrame.java
// Declara e instancia uma janela (JFrame)

package aula15;

import javax.swing.JFrame;

public class Exemplo01 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("Exemplo");  // O parâmetro do JFrame é Titulo da janela
        fr.setSize(500, 500);        // Ajusta a largura e a altura da janela
        fr.setVisible(true);                    // Ajusta a visibilidade da janela
    }
}

/*
 * Interface Gráfica do Usuário (GUI)
 * Componentes que possuem representação gráfica;
 * Podem ser exibidos na tela e fornecem meios de interação com o usuário;
 * A plataforma Java oferece recursos para construção de interfaces gráficas de usuário (GUI) a partir do framework Java Foundation Classes (JFC):
 * – Java 2D: Criação de imagens e gráficos 2D
 * – AWT: Componentes básicos para janelas Desktop. Base para Swing API.
 * – Swing: Componentes sofisticados para construir uma interface gráfica de usuário
 */

/*
 * Container
 * Local em que são adicionados os componentes visualizados na tela;
 * Principais containers:
 * – Frame 
 * – Dialog
 * – Applets
 */

/*
 * Container: Frames
 * Janelas usadas para aplicações que construímos.
 * Sintaxe:
 * – JFrame fr = new JFrame(“Exemplo”);
 * – fr.setSize(colunas, linhas);
 * – fr.setVisible(true);
 */