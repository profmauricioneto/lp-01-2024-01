package org.example;

import java.util.Scanner;

public class Lista02Questao05 {
    public static void calcDiagonalMatrix(int line, int col) {
        Scanner scan = new Scanner(System.in);
        if (line == col) {
            int matrix[][] = new int[line][col];
            int somatorio = 0;
            try {
                for (int i = 0; i < line; i++) {
                    for (int j = 0; j < col; j++) {
                        System.out.printf("Digite o valor [%d][%d]: ", i, j);
                        matrix[i][j] = scan.nextInt();
                        if (i < j) {
                            somatorio += matrix[i][j];
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e.getCause());
            }
            System.out.println("Somatório: " + somatorio);
        } else {
            System.out.println("Erro. A matriz não é quadrada.");
        }
        scan.close();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line;
        int col;
        System.out.println("linhas: ");
        line = scan.nextInt();
        System.out.println("colunas: ");
        col = scan.nextInt();
        calcDiagonalMatrix(line, col);
        scan.close();
    }
}
