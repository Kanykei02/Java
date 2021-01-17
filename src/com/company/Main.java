package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        for (char ch = 'A'; ch <= 'Z'; ch++){
            fileWriter.write(ch);
        }

        fileWriter.write("\n");

        for (int i = 0; i < 10; i++){
            fileWriter.write(i + "\n");
        }
        fileWriter.close();

        FileReader fileReader = new FileReader("file1.txt");
        Scanner sc = new Scanner(fileReader);

        FileWriter fileWriter1 = new FileWriter("file2.txt");

        for (int i = 1; sc.hasNextLine(); i++){
            String line = sc.nextLine();
            if(i % 3 == 0) {
                fileWriter1.write(line);
                System.out.println(line);
            }
        }
        fileReader.close();
        fileWriter1.close();

        try{
            int[] array = {1, 2, 3};
            System.out.println(array[3]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("\n\nВы вышли за пределы массива!");
            System.out.println(ex);
            ex.printStackTrace();
        }
    }
}
