package org.handlingexception;

import java.util.Scanner;

public class DivisionCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, den;
        float res = 0;
        System.out.println("Entre com o valor do numerador: ");
        num = scan.nextInt();
        System.out.println("Entre com o valor do denominador: ");
        den = scan.nextInt();
        try {
            res = (float) num / den;
        }catch (ArithmeticException e) {
            System.out.println("Erro de Divisão");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Resultado da Divisão: " + res);
        }
    }
}
