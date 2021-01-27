package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1 == str2);

        Scanner sc = new Scanner(System.in);
//        String stri = sc.nextLine();
//        String newString = stri.replace('а', 'б');
//        System.out.println(newString);
//        System.out.println("Введите строку: ");
//        String sentence = sc.nextLine();
        //sentence = sentence.trim();
//        String[] words = sentence.trim().split("\\s+");
//        for (int i = 0; i < words.length; i++){
//            System.out.println(i + 1 + ") " +words[i]);
//        }
//        System.out.println("Найдено слов: " + words.length);
//
//        int longest = 0;
//        for (int i = 1; i < words.length; i++){
//            if (words[i].length() > words[longest].length()){
//                longest = i;
//            }
//        }
//        System.out.println("Самое длинное слово: " + words[longest] +
//                ", его длинна: " + words[longest].length());

//        String strr = "Hello";
//        strr = strr.concat(", friend");
//        System.out.println(strr);
//
//        StringBuilder stringBuilder = new StringBuilder("Hello");
//        System.out.println(stringBuilder);
//        stringBuilder.append(", friend!");
//        stringBuilder.replace(1, 3, "ASD");
//        System.out.println(stringBuilder);
//
//        System.out.println("Введите фио");
//        String fio = sc.nextLine();
//        String[] qarray = fio.trim().split(" ");
//        System.out.println(qarray[1].charAt(0) + "." + qarray[2].charAt(0) + ". " + qarray[0]);

        System.out.println("Введите имя файла: ");
        String file = sc.nextLine();
        System.out.println("Новое расширение: ");
        String ext = sc.nextLine();
        System.out.println("Результат: " + edit(file, ext));
    }

    public static String edit(String file, String newExt) {
        int lasInd = file.lastIndexOf('.');
        if (lasInd < 0) {
            file = file.concat("." + newExt);
        } else {
            file = file.substring(0, lasInd + 1) + newExt;
        }
        return file;
    }
}
