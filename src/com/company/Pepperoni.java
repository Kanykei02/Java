package com.company;

public class Pepperoni extends Pizza{
    private int spicy; //сделала для уникального рецепта, если spicy будет равняться 0, то он не острый/false.

    public Pepperoni() {
    }

    public Pepperoni(double price, double weight, int spicy) {
        super(price, weight);
        this.spicy = spicy;
    }

    public int getSpicy() {
        return spicy;
    }

    public void setSpicy(int spicy) {
        this.spicy = spicy;
    }

    public boolean isSpicy() {
        return spicy > 0;
    }

    @Override
    public void cooking() {
        System.out.println("Готовиться пицца Пепперони!");
    }

    @Override
    public void delivery() {
        System.out.printf("Доставка-Цена: %s, вес: %s, острота: %s", getPrice(), getWeight(), isSpicy());
    }
}
