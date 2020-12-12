package com.company;

public class Main<sout> {

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

        System.out.println("\n\n");

        Bread br = new Bread();
        br.setPrice(25);
        br.setWeight(4.3);
        br.bake();
        br.pack();
        System.out.println();
        Lepeshka lep = new Lepeshka();
        lep.drawPrints();
        lep.bake();
        lep.varnish();
        lep.setPrice(12);
        if (lep.isFake()) {
            System.out.println("Это подделка!");
        } else {
            System.out.println("Это не подделка)");
        }

        System.out.println();
        Lavash lav = new Lavash();
        lav.setName("Прованьсаль");
        lav.bake();
        lav.wrap();

        System.out.println();
        Baguette bag = new Baguette();
        bag.setName("Франузский багет ");
        bag.makeStrips();
        bag.bake();
        bag.pack();
    }
}
