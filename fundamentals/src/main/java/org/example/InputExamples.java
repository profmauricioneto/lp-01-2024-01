package org.example;
import java.util.Scanner;

public class InputExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;

        System.out.print("Digite seu nome: ");
        name = scan.next();
        System.out.print("Digite sua idade: ");
        age = scan.nextInt();

        System.out.println("Olá " + name + " sua idade é: " + age);
    }
}
