package org.example;

import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int somaDiagonalPrincipal = 0;

        for(int i = 0 ; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("Digite o elemento m[%d][%d] = ", i, j);
                matrix[i][j] = scan.nextInt();

                if (i == j) {
                    somaDiagonalPrincipal += matrix[i][j];
                }
            }
        }
        System.out.println("Valor da Diagonal Principal é: " + somaDiagonalPrincipal);
    }
}
