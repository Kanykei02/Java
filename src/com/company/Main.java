package com.company;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.setPrice(300);
        pizza.setWeight(2);
        pizza.cooking();
        pizza.delivery();
        System.out.println();

        Pepperoni pepperoni = new Pepperoni();
        pepperoni.setPrice(250);
        pepperoni.setWeight(1.5);
        pepperoni.setSpicy(0);
        pepperoni.cooking();
        pepperoni.delivery();
        System.out.println();

        Margarita margarita = new Margarita();
        margarita.setPrice(280);
        margarita.setWeight(2.5);
        margarita.setMeat(1);
        margarita.cooking();
        margarita.delivery();
        System.out.println();

        LaFinta laFinta= new LaFinta();
        laFinta.setPrice(200);
        laFinta.setWeight(2.1);
        laFinta.setMushrooms(1);
        laFinta.cooking();
        laFinta.delivery();
    }
}
