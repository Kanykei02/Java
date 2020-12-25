package com.company;

public class LaFinta extends Pizza{
    private int mushrooms; // same Pepperoni

    public LaFinta() {
    }

    public LaFinta(double price, double weight, int mushrooms) {
        super(price, weight);
        this.mushrooms = mushrooms;
    }

    public int getMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(int mushrooms) {
        this.mushrooms = mushrooms;
    }

    public boolean withMushrooms() {
        return mushrooms > 0;
    }

    @Override
    public void cooking() {
        System.out.println("Готовиться пицца Ла Финта!");
    }

    @Override
    public void delivery() {
        System.out.printf("Доставка-Цена: %s, вес: %s, начинка: %s", getPrice(), getWeight(), withMushrooms());
    }
}
