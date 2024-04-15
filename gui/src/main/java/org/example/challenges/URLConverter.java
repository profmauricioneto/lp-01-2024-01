package org.example.challenges;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class URLConverter extends JFrame {
    JLabel TEXT;
    JTextField URL;
    JButton CONVERTER;

    public URLConverter(String title) {
        super(title);
        Container CONT = getContentPane();

        TEXT = new JLabel("Put the URL");
        URL = new JTextField(100);
        CONVERTER = new JButton("Convert");

        JPanel panelFront = new JPanel();
        panelFront.setLayout(new GridLayout(3,1));
        panelFront.add(TEXT);
        panelFront.add(URL);
        panelFront.add(CONVERTER);

        this.setLayout(new GridLayout(1,1));
        this.add(panelFront);

        CONVERTER.addActionListener(new Converter());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 200);
        this.setVisible(true);
    }

    private class Converter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String url = URL.getText();

            JFrame frame = new JFrame();
            JLabel IP = new JLabel(" ");
            JLabel ADDRESS = new JLabel(" ");

            JPanel panelBack = new JPanel();
            panelBack.setLayout(new GridLayout(2,1));
            panelBack.add(IP);
            panelBack.add(ADDRESS);

            frame.setLayout(new GridLayout(1,1));
            frame.add(panelBack);

            frame.setSize(300, 200);
            frame.setVisible(true);

            try {
                InetAddress address = InetAddress.getByName(url);
                String ip = address.getHostAddress();
                String ad = address.getHostName();

                IP.setText("IP: " + ip);
                ADDRESS.setText("Address: " + ad);

            } catch (UnknownHostException exp) {
                JOptionPane.showMessageDialog(null, exp.toString(), "Error", 1);
            }

        }
    }


    public static void main(String[] args) {
        URLConverter urlconverter = new URLConverter("URL Converter");
    }
}
