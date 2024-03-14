package org.filemanipulation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author maumneto
 * This code is an example of file manipulation in Java.
 * Each subroutine executes an action in file created
 * */
public class CreateFile {
    /**
     * This method is responsible to print a menu
     */
    public static void menu() {
        System.out.println("1 - Write in File");
        System.out.println("2 - Read File");
        System.out.println("3 - Delete File");
    }
    /**
     * @param file
     * This method is responsible to create a new File.
     */
    public static void createFile(File file) {
        try {
            if(file.createNewFile()){
                System.out.println("File Created with Success! Filename: " + file.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param file, message, appendable
     * This method is responsible to write a content in file.
     * */
    public static void writeInFile(File file, String message, boolean appendable) {
        if (file.exists()) {
            try {
                FileWriter objWriter = new FileWriter(file, appendable);
                objWriter.write(message);
                System.out.println("Success write in File!");
                objWriter.close();
            } catch (IOException e) {
                System.out.println("Error to write in File.");
                System.out.println("Error: " + e.getMessage());
            }
        } else {
            System.out.println("File not Found.");
        }
    }

    /**
     * @param file
     * This method is responsible to read all content of file */
    public static void readFile(File file) {
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * This method is responsible to delete file.
     * */
    public static void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("File deleted with success.");
        } else {
            System.out.println("Error: delete option failed.");
        }
    }

    /**
     * main code
     * */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        File file = new File("teste.txt");

        menu();
        System.out.println("Option: ");
        option = scan.nextInt();

        switch (option) {
            case 1: {
                System.out.print("Write your message: ");
                String message = scan.nextLine().concat("\n");
                System.out.print("Do you want to override the content of the file? [y/n]");
                String choice = scan.next();
                writeInFile(file, message, choice.contains("y"));
                break;
            }
            case 2: {
                readFile(file);
                break;
            }
            case 3: {
                deleteFile(file);
                break;
            }
            default:
                System.out.println("No options choosen");
        }


    }
}
