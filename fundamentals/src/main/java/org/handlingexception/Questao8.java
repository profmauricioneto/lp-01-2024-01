package org.handlingexception;

public class Questao8 {
    public static double iterativeDivide(double... args) throws ArithmeticException {
        double total = 1;
        for(double i: args) {
            total /= i;
        }
        return total;
    }

    public static void main(String[] args) {
        double result = 0;
        try {
            result = iterativeDivide(1.1,2.1,3.1,4.1,5.2,6.2,8.1,0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(result);
            System.out.println("Executando o Finally");
        }
    }
}
