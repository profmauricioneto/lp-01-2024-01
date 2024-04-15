package org.example.challenges;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {
    // user's input
    JTextField ENTER1;
    JTextField ENTER2;
    // calc buttons
    JButton SUMBUTTON;
    JButton MINUSBUTTON;
    JButton MULTBUTTON;
    JButton DIVBUTTON;
    // labels
    JLabel ROTULO1;
    JLabel ROTULO2;
    JLabel RESULT;

    public Calculator(String title) {
        super(title);
        Container container = getContentPane();
        // instances
        SUMBUTTON = new JButton("+");
        MINUSBUTTON = new JButton("-");
        MULTBUTTON = new JButton("*");
        DIVBUTTON = new JButton("/");
        ENTER1 = new JTextField();
        ENTER2 = new JTextField();
        ROTULO1 = new JLabel("Valor 1: ");
        ROTULO2 = new JLabel("Valor 2: ");
        RESULT = new JLabel("O resultado é: ");

        JPanel panelEntries = new JPanel();
        panelEntries.setLayout(new GridLayout(2,2));
        panelEntries.add(ROTULO1);
        panelEntries.add(ENTER1);
        panelEntries.add(ROTULO2);
        panelEntries.add(ENTER2);

        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(new GridLayout(1,4));
        panelButtons.add(SUMBUTTON);
        panelButtons.add(MINUSBUTTON);
        panelButtons.add(MULTBUTTON);
        panelButtons.add(DIVBUTTON);

        JPanel panelResult = new JPanel();
        panelResult.setLayout(new GridLayout(1,1));
        panelResult.add(RESULT);

        // setting layout manager as null
        this.setLayout(new GridLayout(3,1));
        this.add(panelEntries);
        this.add(panelButtons);
        this.add(panelResult);

        // add an action for each button
        SUMBUTTON.addActionListener(new SumOption());
        MINUSBUTTON.addActionListener(new MinusOption());
        MULTBUTTON.addActionListener(new MultOption());
        DIVBUTTON.addActionListener(new DivOption());
        // setting the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 250);
        setVisible(true);
    }
    // class with the action of sum button
    private class SumOption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            double res = value1 + value2;
            RESULT.setText("Resultado: " + res);
        }
    }
    // class with the action of minus button
    private class MinusOption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e)  {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            double res = value1 - value2;
            RESULT.setText("Resultado: " + res);
        }
    }
    // class with the action of multiply button
    private class MultOption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            double res = value1 * value2;
            RESULT.setText("Resultado: " + res);
        }
    }
    // class with the action of divide button
    private class DivOption implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            double value1 = Double.parseDouble(ENTER1.getText());
            double value2 = Double.parseDouble(ENTER2.getText());
            if (value2 == 0) {
                RESULT.setText("Resultado: -inf");
            } else {
                double res = value1 / value2;
                RESULT.setText("Resultado: " + res);
            }
        }
    }
    /**
     * main class
     */
    public static void main(String[] args) {
        Calculator calculadora = new Calculator("Simple Calculator");
    }
}
