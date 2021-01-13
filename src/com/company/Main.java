package com.company;

public class Main {

    public static void main(String[] args) {
        Swimible turtle = new Turtle();
        Container container = new Container();
        container.setSwimible(turtle);
        container.setPutEggs(new Chicken());
        container.print();
        turtle.swimming();

        System.out.println("Is swimming? " + (Swimible.IS_SWIMMING ? "yes" : "No"));
        System.out.println("Max ocean's depth: " + Swimible.MAX_OCEAN_DEPTH);
    }
}
