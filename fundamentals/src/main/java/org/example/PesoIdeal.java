package org.example;

import java.util.Locale;
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pesoIdeal = -1;
        double altura;
        String genero;

        System.out.println("Digite sua altura: ");
        altura = scan.nextDouble();

        System.out.println("Digite seu genero[m/f - masculino/feminino]: ");
        genero = scan.next();

        genero = genero.toLowerCase();

        switch (genero) {
            case "m":
            case "masculino": {
                pesoIdeal = 72.7 * altura - 58;
                break;
            }
            case "f":
            case "feminino": {
                pesoIdeal = 62.1 * altura - 44.7;
                break;
            }

            default:
                System.out.println("Genero Invalido.");
        }

        System.out.println("Valor do Peso Ideal é: " + pesoIdeal);
        scan.close();
    }
}
