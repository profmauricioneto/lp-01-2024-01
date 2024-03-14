package org.filemanipulation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

    public static void create(String filename) {
        File file;
        file = new File(filename.concat(".txt"));
        try {
            if(file.createNewFile()){
                System.out.println("Arquivo Criado com Sucesso!" + file.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writerInFile(String filename, String message) {
        try {
            FileWriter objWriter = new FileWriter(filename);
            objWriter.write(message);
            objWriter.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void readerInFile(String filename) {
        try {
            File file = new File(filename.concat(".txt"));
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        System.out.println("Digite uma opcao: ");
        option = scan.nextInt();

        switch (option) {
            case 1: {
                create("teste");
                break;
            }
            case 2: {
                writerInFile("teste", "ola");
                break;
            }
            case 3: {
                readerInFile("teste");
                break;
            }
            default:
                System.out.println("No options chooses");
        }


    }
}
