package org.filemanipulation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File file;
        String filename;
        System.out.println("Digite o nome do seu arquivo: ");
        filename = scan.next();
        file = new File(filename.concat(".txt"));

        try {
            if(file.createNewFile()){
                System.out.println("Arquivo Criado com Sucesso!" + file.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
