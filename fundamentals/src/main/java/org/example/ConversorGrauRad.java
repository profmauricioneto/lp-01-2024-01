package org.example;

/**
 * Faça um programa que leia um ângulo em graus e apresente a conversão em radianos.
 * Nota: a fórmula de conversão é R = G* π/180, sendo que G é o ângulo em graus e R em radianos.
 * */

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
        scan.close();
    }
}
