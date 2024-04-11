package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExampleForm extends JFrame {

    JLabel lbMessage;
    JLabel lbResult;
    JButton btnSend;
    JTextField txtMessage;

    JRadioButton btnMasculino;
    JRadioButton btnFeminino;

    JPanel panel1;
    JPanel panel2;
    JPanel panel3;

    public ExampleForm() {
        super();
        lbMessage = new JLabel("Digite a mensagem: ");
        lbResult = new JLabel("");
        btnSend = new JButton("Enviar");
        txtMessage = new JTextField(40);
        btnMasculino = new JRadioButton("Masculino", true);
        btnFeminino = new JRadioButton("Feminino");

        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(lbMessage);
        panel1.add(txtMessage);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(2, 1));
        panel2.add(btnSend);
        panel2.add(lbResult);

        panel3 = new JPanel();
        panel3.setLayout(new FlowLayout());

        ButtonGroup group = new ButtonGroup();
        group.add(btnMasculino);
        group.add(btnFeminino);

        panel3.add(btnMasculino);
        panel3.add(btnFeminino);

        this.setLayout(new GridLayout(3, 1));
        this.add(panel1);
        this.add(panel3);
        this.add(panel2);

        Event e = new Event();

        btnSend.addActionListener(e);

        // btnSend.addActionListener(new ActionListener() {
        // @Override
        // public void actionPerformed(ActionEvent e) {
        // String message = txtMessage.getText();
        // lbResult.setText(message);
        // }
        // });

        this.setSize(600, 200);
        this.setVisible(true);
    }

    private class Event implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = txtMessage.getText();
            lbResult.setText(message);
        }
    }

    public static void main(String[] args) {
        ExampleForm tela = new ExampleForm();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
