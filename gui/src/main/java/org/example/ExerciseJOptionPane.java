package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseJOptionPane {
    public static void main(String[] args) {
        JLabel lbNome = new JLabel("Nome: ");
        JLabel lbSobrenome = new JLabel("Sobrenome: ");
        JLabel lbCPF = new JLabel("CPF: ");

        JTextField tfNome = new JTextField(20);
        JTextField tfSobrenome = new JTextField(20);
        JTextField tfCPF = new JTextField(20);

        JButton btnEnviar = new JButton("Enviar");

        JFrame frame = new JFrame("Example JOptionPanes");

        frame.setLayout(new GridLayout(2,1));

        JPanel panelSup = new JPanel();
        panelSup.setLayout(new GridLayout(3,2));
        panelSup.add(lbNome);
        panelSup.add(tfNome);
        panelSup.add(lbSobrenome);
        panelSup.add(tfSobrenome);
        panelSup.add(lbCPF);
        panelSup.add(tfCPF);

        JPanel panelInf = new JPanel();
        panelInf.setLayout(new GridLayout(1,1));
        panelInf.add(btnEnviar);

        frame.add(panelSup);
        frame.add(panelInf);

        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfNome.getText().isEmpty()) {
                    String nome = JOptionPane.showInputDialog(null, "Digite o seu nome: ", "Erro Campo Nome", 1);
                    tfNome.setText(nome);
                }
                if (tfSobrenome.getText().isEmpty()) {
                    String sobrenome = JOptionPane.showInputDialog(null, "Digite o seu sobrenome: ", "Erro Campo " +
                                    "Sobrenome",
                            1);
                    tfSobrenome.setText(sobrenome);
                }
                if (tfCPF.getText().isEmpty()) {
                    String cpf = JOptionPane.showInputDialog(null, "Digite o seu CPF: ", "Erro Campo " +
                                    "CPF",
                            1);
                    tfCPF.setText(cpf);
                }
                if (!tfNome.getText().isEmpty() && !tfSobrenome.getText().isEmpty() && !tfCPF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Mensagem Enviada coom Sucesso!", "Mensagem Enviada", 1);
                }
            }
        });

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
