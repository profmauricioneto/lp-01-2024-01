package org.example;

import java.util.Scanner;

public class QuestaoMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nota1;
        double nota2;
        double media;

        System.out.print("Digite nota1: ");
        nota1 = scan.nextDouble();

        System.out.print("Digite nota2: ");
        nota2 = scan.nextDouble();

        media = (nota1 + nota2)/2;
        System.out.println("Media: " + media);

        if(media >= 7.0) {
            System.out.println("Aprovado!");
        } else {
            if(media < 4.0) {
                System.out.println("Reprovado!");
            } else {
                System.out.println("Final! Fica mais um pouco...");
                double notaFinal;
                double mediaFinal;

                System.out.println("Digite a nota Final: ");
                notaFinal = scan.nextDouble();

                mediaFinal = (nota1 + nota2 + notaFinal)/3;
                System.out.println("Media Final: " + mediaFinal);

                if(mediaFinal >= 5.0) {
                    System.out.println("Aprovado na Final! Vaitimbora!");
                } else {
                    System.out.println("Reprovado na Final! Bora fazer novamente neh!");
                }
            }
        }
    }
}
