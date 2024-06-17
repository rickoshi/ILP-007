/*
 * JanelaEx02.java
 * Listener nos botões Ok e Fim
 * Fazer um programa que leia o nome e a idade de uma pessoa
 * Usando botões para o tratamento do evento.
 */

package aula15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo09 extends JFrame {
    private JLabel lblNome, lblIdade, lblMensagem;
    private JButton btnOK, btnFim;
    private JTextField txtNome, txtIdade;

    // Construtor
    public Exemplo09() {
        super("Segunda janela");
        setLayout(new GridLayout(4, 2));

        // Instancia componentes
        lblNome     = new JLabel("Nome");
        lblIdade    = new JLabel("Idade");
        lblMensagem = new JLabel();
        btnOK       = new JButton("OK");
        btnFim      = new JButton("Fim");
        txtNome     = new JTextField(20);
        txtIdade    = new JTextField(3);

        // Adiciona cada componente ao frame
        add(lblNome);
        add(txtNome);
        add(lblIdade);
        add(txtIdade);
        add(btnOK);
        add(btnFim);
        add(lblMensagem);

        // Instancia e registra listener dos botões
        trataBtn tBtn = new trataBtn();
        btnOK.addActionListener(tBtn);
        btnFim.addActionListener(tBtn);
    }

    private class trataBtn implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnOK)
                lblMensagem.setText(txtNome.getText() + " voce tem " + txtIdade.getText() + " anos de idade.");
            else
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Exemplo09 janela = new Exemplo09();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400, 150);
        janela.setVisible(true);
    }
}