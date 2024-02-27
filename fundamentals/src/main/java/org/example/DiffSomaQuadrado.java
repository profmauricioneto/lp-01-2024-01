package org.example;

import java.util.Scanner;
public class DiffSomaQuadrado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int limite;
        int somaQuad = 0;
        int quadSoma = 0;
        int cont = 1;
        int diff;

        System.out.println("Entre com o valor limite: ");
        limite = scan.nextInt();

        while(cont <= limite) {
            somaQuad = somaQuad + cont*cont;
            quadSoma = quadSoma + cont;
            cont++;
        }
        quadSoma = quadSoma*quadSoma;
        System.out.println("Soma dos Quadrados: " + somaQuad);
        System.out.println("Quadrado da Soma: " + quadSoma);
        diff = quadSoma - somaQuad;
        System.out.println("Diferença = " + diff);
    }
}
