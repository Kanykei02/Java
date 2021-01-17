package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        for (char ch = 'A'; ch <= 'Z'; ch++){
            fileWriter.write(ch);
        }

        fileWriter.write("\n");

        for (int i = 0; i < 10; i++){
            fileWriter.write(i + "");
        }
        fileWriter.close();
    }
}
