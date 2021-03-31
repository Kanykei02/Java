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

        testable haskell = () -> System.out.println("Haskell is being tested");
        testable alonzo = () -> System.out.println("Alonzo is being tested");
        haskell.takethetest();
        alonzo.takethetest();

        Printable printable = (supernatural) -> System.out.println(supernatural);
        printable.print("I am Dean");

    }
}
