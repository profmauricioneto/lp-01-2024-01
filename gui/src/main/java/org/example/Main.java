package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel greeting = new JLabel("Hello From GUI");
        JLabel subtitle = new JLabel("This is my first GUI");
        frame.setTitle("Minha Primeira GUI");
        frame.setLayout(null);
        greeting.setBounds(20, 20, 200, 20);
        subtitle.setBounds(20, 50, 200, 20);
        frame.add(greeting);
        frame.add(subtitle);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}