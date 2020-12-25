package com.company;

public class Margarita extends Pizza{
    private int meat; // same Pepperoni

    public Margarita() {}

    public Margarita(double price, double weight, int meat) {
        super(price, weight);
        this.meat = meat;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    public boolean withMeat() {
        return meat > 0;
    }

    @Override
    public void cooking() {
        System.out.println("Готовиться пицца Маргарита!");
    }

    @Override
    public void delivery() {
        System.out.printf("Доставка-Цена: %s, вес: %s, начинка: %s", getPrice(), getWeight(), withMeat());
    }
}
