package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Accessories extends JFrame {
    JLabel TEXT;
    JTextField TOTAL;
    JCheckBox AIR_COND;
    JCheckBox DIR_HID;
    JCheckBox SIS_MEDIA;
    JCheckBox REVERSE_CAM;

    long total = 0;
    long airCond = 2000;
    long dirHid = 1400;
    long sisMedia = 800;
    long reverseCam = 500;

    public Accessories() {
        super();
        TEXT = new JLabel("Acessórios Disponíveis: ");
        TOTAL = new JTextField(50);
        AIR_COND = new JCheckBox("Ar Condicionado");
        DIR_HID = new JCheckBox("Direção Hidraulica");
        SIS_MEDIA = new JCheckBox("Sistema de Mídia");
        REVERSE_CAM = new JCheckBox("Camera de Ré");

        AIR_COND.setSelected(false);
        DIR_HID.setSelected(false);
        SIS_MEDIA.setSelected(false);
        REVERSE_CAM.setSelected(false);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1));
        panel.add(TEXT);
        panel.add(AIR_COND);
        panel.add(DIR_HID);
        panel.add(SIS_MEDIA);
        panel.add(REVERSE_CAM);
        panel.add(TOTAL);

        this.setLayout(new GridLayout(1,1));
        this.add(panel);

        AIR_COND.addActionListener(new AirConditioning());
        DIR_HID.addActionListener(new Hidraulic());
        SIS_MEDIA.addActionListener(new MediaSystem());
        REVERSE_CAM.addActionListener(new ReverseCamera());

        TOTAL.setText(String.valueOf(total));

        setSize(300, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class AirConditioning implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (AIR_COND.isSelected()) {
                total += airCond;
            } else {
                total -= airCond;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }

    private class Hidraulic implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (DIR_HID.isSelected()) {
                total += dirHid;
            } else {
                total -= dirHid;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }

    private class MediaSystem implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (SIS_MEDIA.isSelected()) {
                total += sisMedia;
            } else {
                total -= sisMedia;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }

    private class ReverseCamera implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            total = Long.parseLong(TOTAL.getText());
            if (REVERSE_CAM.isSelected()) {
                total += reverseCam;
            } else {
                total -= reverseCam;
            }
            TOTAL.setText(String.valueOf(total));
        }
    }

    public static void main(String[] args) {
        Accessories accessories = new Accessories();
    }
}
