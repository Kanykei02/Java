package com.company;

public class Main {

    public static void main(String[] args) {
        Student ivan = new Student("Ivan ");
        ivan.takethetest();
        testable petr = new testable() {
            @Override
            public void takethetest() {
                System.out.println("Petr is being tested");
            }
        };

        testable sergey = new testable() {
            @Override
            public void takethetest() {
                System.out.println("Sergey is being tested");
            }
        };

        petr.takethetest();
        sergey.takethetest();
        System.out.println(ivan.getClass());
        System.out.println(petr.getClass());
        System.out.println(sergey.getClass());
    }
}
