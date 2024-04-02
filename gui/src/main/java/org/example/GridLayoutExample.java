package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class GridLayoutExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example GridLayout");
        JPanel panelSup = new JPanel();
        JPanel panelInf = new JPanel();

        JLabel lbIdade = new JLabel("Idade: ");
        JLabel lbResultado = new JLabel("");
        JTextField tfIdade = new JTextField("0", 30);
        JButton btnCalcular = new JButton("Calcular");

        lbIdade.setHorizontalAlignment(SwingConstants.CENTER);

        panelSup.setLayout(new GridLayout(1,2));
        panelSup.add(lbIdade);
        panelSup.add(tfIdade);

        panelInf.setLayout(new GridLayout(2,1));
        panelInf.add(btnCalcular);
        panelInf.add(lbResultado);

        frame.setLayout(new GridLayout(2,1));
        frame.add(panelSup);
        frame.add(panelInf);

        CalcIdade calculoIdade = new CalcIdade(tfIdade, lbResultado);
        btnCalcular.addActionListener(calculoIdade);

//        btnCalcular.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               int anoNascimento = Integer.parseInt(tfIdade.getText());
//               int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
//               int idade = anoAtual - anoNascimento;
//               lbResultado.setText("Sua idade é: "+ idade);
//            }
//        });

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static class CalcIdade implements ActionListener {
        private final JTextField tfIdade;
        private final JLabel lbResultado;

        private CalcIdade(JTextField tfIdade, JLabel lbResultado) {
            this.tfIdade = tfIdade;
            this.lbResultado = lbResultado;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int anoNascimento = Integer.parseInt(tfIdade.getText());
            int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
            int idade = anoAtual - anoNascimento;
            lbResultado.setText("Sua idade é: "+ idade);
        }
    }
}
