package org.example;

import java.util.Scanner;

public class Nutricionista {
    public static double imcCalculator(double altura, double pesoAtual) {
        return pesoAtual/(altura*altura);
    }
    public static double pesoIdealCalculator(String genero, double altura) {
        double pesoIdeal = 0;
        if (genero.equalsIgnoreCase("masculino") || genero.charAt(0) == 'm') {
            pesoIdeal = 72.7*altura - 58;
        } else if (genero.equalsIgnoreCase("feminino") || genero.charAt(0) == 'f') {
            pesoIdeal = 62.1*altura - 44.7;
        } else {
            System.out.println("Genero Inválido");
        }
        return pesoIdeal;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double altura, pesoAtual, pesoIdeal, imc;
        String genero;

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();
        System.out.println("Digite seu peso atual: ");
        pesoAtual = scan.nextDouble();
        imc = imcCalculator(altura, pesoAtual);
        System.out.println("IMC: " + imc);
        System.out.println("Digite o seu genero: [m/f ou masculino/feminino]: ");
        genero = scan.next();
        scan.close();
        pesoIdeal = pesoIdealCalculator(genero, altura);
        System.out.println("O seu peso ideal é: " + pesoIdeal);
    }
}
