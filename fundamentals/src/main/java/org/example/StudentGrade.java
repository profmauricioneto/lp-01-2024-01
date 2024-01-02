package org.example;

import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        double np1, np2, np3, mf;
        Scanner in = new Scanner(System.in);
        System.out.print("Entre com a NP1: ");
        np1 = in.nextDouble();
        System.out.print("Entre com a NP2: ");
        np2 = in.nextDouble();
        System.out.print("Entre com a NP3: ");
        np3 = in.nextDouble();
        if (np3 >= 4.0) {
            mf = (np1 + np2 + np3)/3;
            System.out.printf("Media: %.2f\n", mf);
            if (mf >= 5.0) {
                System.out.println("Resultado: Aprovado.");
            } else {
                System.out.println("Resultado: Reprovado.");
            }
        } else {
            System.out.println("Resultado: Reprovado.");
        }
    }
}
