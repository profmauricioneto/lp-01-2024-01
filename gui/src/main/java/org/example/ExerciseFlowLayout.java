package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExerciseFlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Example Flow Layout");
        JLabel lbNome = new JLabel("Nome: ");
        JLabel lbIdade = new JLabel("Idade: ");
        JLabel lbResultado = new JLabel("");
        JTextField tfNome = new JTextField(30);
        JTextField tfIdade = new JTextField(30);
        JButton btnEnviar = new JButton("Enviar Dados");

        JPanel panelNome = new JPanel();
        JPanel panelIdade = new JPanel();
        JPanel panelOutput= new JPanel();

        panelNome.setLayout(new BorderLayout());
        panelIdade.setLayout(new BorderLayout());
        panelOutput.setLayout(new BorderLayout());
        frame.setLayout(new FlowLayout());

        panelNome.add(lbNome, BorderLayout.WEST);
        panelNome.add(tfNome, BorderLayout.EAST);
        panelIdade.add(lbIdade, BorderLayout.WEST);
        panelIdade.add(tfIdade, BorderLayout.EAST);
        panelOutput.add(btnEnviar, BorderLayout.CENTER);
        panelOutput.add(lbResultado,BorderLayout.SOUTH);

        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(tfIdade.getText()) >= 18) {
                    lbResultado.setText(tfNome.getText() + " é maior de idade");
                } else {
                    lbResultado.setText(tfNome.getText() + " é menor de idade");
                }
            }
        });

        panelNome.setSize(400, 100);
        panelIdade.setSize(400, 100);
        panelOutput.setSize(400, 200);

        frame.add(panelNome);
        frame.add(panelIdade);
        frame.add(panelOutput);

        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
