package org.example;

/**
 * Faça um programa para calcular a média aritmética M entre duas notas de um aluno e
 * mostrar sua situação, que pode ser Aprovado (M ⩾ 7), Reprovado (M < 4) e Final (4 ⩽ M < 7).
 * Se o aluno ficar de Final, entre com a nota da prova Final e mostre a média e o resultado final.
 * */

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
