package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        Swimmable[] oceanarrium = new Swimmable[15];
//        for (int i = 0; i < oceanarrium.length; i++){
//            if (i < 5) oceanarrium[i] = new Turtle();
//            else if (i < 10) oceanarrium[i] = new Shark();
//            else oceanarrium[i] = new Duck();
//
//            oceanarrium[i].makeSound();
//        }
//        System.out.println("****************************************************");
//        for (int i = 0; i < oceanarrium.length; i++){
//            if (oceanarrium[i] instanceof Shark)
//                ((Shark)oceanarrium[i]).hunt();
//            else if (oceanarrium[i] instanceof Turtle)
//                ((Turtle)oceanarrium[i]).layEggs(10);
//            System.out.println(oceanarrium[i].getClass());
//        }
//        Turtle[] turtles = new Turtle[5];
//        Shark[] sharks = new Shark[5];
//        Duck[] ducks = new Duck[5];
//        int iTurtle = 0;
//        int iShark = 0;
//        int iDuck = 0;
//
//        for (Swimmable animal : oceanarrium){
//            if (animal instanceof Turtle)
//                turtles[iTurtle++] = (Turtle) animal;
//            else if (animal instanceof Shark)
//                sharks[iShark++] = (Shark) animal;
//            else if (animal instanceof Duck)
//                ducks[iDuck++] = (Duck) animal;
//        }
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
