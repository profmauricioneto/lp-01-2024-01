package org.subroutines;

import java.util.Scanner;
public class Calculator {
    public static double sum ( double a , double b) {
         return a + b;
    }
    public static double subtraction ( double a , double b) {
         return a - b;
    }
    public static double multiplication ( double a , double b) {
         return a * b;
    }
    public static double division ( double a , double b) throws ArithmeticException {
        return a / b;
    }

    public static int optionsMenu () {
         Scanner in = new Scanner (System.in);
         System.out.println("1 - Sum ") ;
         System.out.println("2 - Subtraction ");
         System.out.println("3 - Multiplication ");
         System.out.println("4 - Division ");
         System.out.println("5 - Leave ");
         return Integer.parseInt(in.nextLine());
    }

    public static void help () {
        System.out.println(" Welcome to Simple Calculator ");
        System.out.println(" author : Mauricio Moreira ");
        System.out.println(" The options are :") ;
        System.out.println("1 - Sum ") ;
        System.out.println("2 - Subtraction ");
        System.out.println("3 - Multiplication ");
        System.out.println("4 - Division ");
        System.out.println("5 - Leave ");
    }

    public static void main (String [] args) {
         int option;
         double firstInput , secondInput , result = 0;
         Scanner in = new Scanner(System.in);

         if (args[0].equals("-h") || args[0].equals("help")) {
             help() ;
             System.exit (0) ;
             } else {
             do {
                 option = optionsMenu () ;
                 if ( option == 5) {
                     System . exit (0) ;
                 }
                 System.out.print("a: ");
                 firstInput = in.nextDouble () ;
                 System.out.print("b: ");
                 secondInput = in.nextDouble () ;
                 switch ( option ) {
                     case 1:
                         result = sum ( firstInput , secondInput ) ;
                         break;
                     case 2:
                         result = subtraction ( firstInput , secondInput );
                         break;
                     case 3:
                         result = multiplication ( firstInput , secondInput );
                         break;
                     case 4:
                         try {
                             result = division ( firstInput , secondInput ) ;
                         } catch ( ArithmeticException e) {
                             System.err.println(e.getMessage());
                         }
                         break;
                    default:
                        System.out.println("No one option choose .");
                        break;
                    }
                System.out.println (" Result = " + result );
             } while ( true );
         }
    }
}
