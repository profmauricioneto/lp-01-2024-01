package org.example;

import java.util.Scanner;

public class ConversorGrauRad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rad;
        double graus;

        System.out.println("Digite o valor em Graus: ");
        graus = scan.nextDouble();

        rad = graus * (Math.PI/180);

        System.out.println("O valor em radianos é: " + rad);
    }
}
