package com.company;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Dean", 35, 4.0);
        students[1] = new Student("Sem", 31, 5.0);
        students[2] = new Student("Cas", 10000000, 10.0);
        double sum = 0;
        for(int i = 0; i < students.length; i++) {
            sum += students[i].getRate();
        }
        System.out.printf("Students' AVG: %.3f", sum/students.length);
        sum = 0;
        for (Student i : students) {
            sum += i.getRate();
        }
        System.out.printf("%nNew Students' AVG: %.3f", sum/students.length);
    }
}
