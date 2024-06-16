/*
 * JanelaEx01.java
 * Listener no “Enter” da caixa de texto
 * Fazer um programa que leia o nome e a idade de uma pessoa e exiba a mensagem:
 * ""Fulano" você tem XX anos de idade."
 */

package aula15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo08 extends JFrame
{
    // Inicialização dos objetos gráficos da janela
    private JLabel lblNome, lblIdade, lblMensagem;
    private JTextField txtNome, txtIdade;

    // Construtor
    public Exemplo08()
    {
        super("Primeira janela");
        setLayout(new FlowLayout());

        // Instancia componentes
        lblNome     = new JLabel("Nome");
        lblIdade    = new JLabel("Idade");
        lblMensagem = new JLabel();
        txtNome     = new JTextField(20);
        txtIdade    = new JTextField(3);

        // Adiciona cada componente ao frame
        add(lblNome);
        add(txtNome);
        add(lblIdade);
        add(txtIdade);
        add(lblMensagem);

        // Instancia e registra listener do TextField
        TrataTextField ttf = new TrataTextField();
        txtIdade.addActionListener(ttf);
    }

    private class TrataTextField implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == txtIdade)
                lblMensagem.setText(txtNome.getText() + " voce tem " + txtIdade.getText() + " anos de idade.");
            else
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Exemplo08 janela = new Exemplo08();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 150);
        janela.setVisible(true);
    }
}

/*
 * Outros Componentes GUI
 * - JLabel, JButton
 * - JTextField e JTextArea
 * - JScrollPane
 * - JCheckBox e JComboBox
 * - JList e JTable
 * - JMenuItem, JMenu e JMenuBar
 * Para adicionar componente a um container:
 * <container>.add(componente1);
 */

/*
 * Layout managers
 * Auxiliam containers no posicionamento de seus componentes;
 * Tipos:
 * – FlowLayout
 * – BorderLayout
 * – GridLayout
 * – GridBagLayout
 * – CardLayout
 */

/*
 * FlowLayout
 * Padrão para:
 * – Panel
 * – Jpanel
 * Adiciona componentes da esquerda para direita até fim da linha;
 * Então passa para a próxima linha, repetindo o processo;
 */

/*
 * BorderLayout
 * Divide o container em 5 regiões:
 * – Norte, Sul, leste, Oeste e Centro;
 * Padrão para JFrames e JApplets;
 * Permite apenas 1 componente para cada região do container;
 */

/*
 * GridLayout
 * Divide o container como uma grade com tamanhos e espaços iguais entre os componentes
 * Estes, por sua vez dividem-se em linhas e colunas do layout;
 * 
 * GridBagLayout
 * Semelhante ao GridLayout, porém, permite divisões com tamanhos diferentes;
 */

/*
 * CardLayout
 * Usado para exibir um componente de cada vez como em uma pilha de cartas;
 * Somente o objeto que estiver no topo será visível;
 */