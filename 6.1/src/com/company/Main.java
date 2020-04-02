package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {




        try {
            File filein = new File("filename.txt");
            Scanner scanner = new Scanner(filein);
            double average=0;
            double sum=0;
            int count=0;
            while (scanner.hasNextLine()) {{
                int data = scanner.nextInt();
                sum=sum+data;
                count++;}
                average = sum/count;
                FileWriter myWriter = new FileWriter("media.txt");
                myWriter.write("Media aritmetica este "+average);
                myWriter.flush();
                myWriter.close();
            }
            scanner.close();
            System.out.println("Verificati fisierul!");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


