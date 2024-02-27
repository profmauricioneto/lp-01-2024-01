package org.example;

import java.util.Scanner;
public class CalcSerieHarmonica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double serieHarmonica = 0;
        int numTermos;

        System.out.println("Digite o numero de termos da serie harmonica: ");
        numTermos = scan.nextInt();

        for(int i = 1; i <= numTermos; i++) {
            serieHarmonica = serieHarmonica + (double) 1/i;
        }

        System.out.println("Valor da Série Harmônica é: " + serieHarmonica);
    }
}
