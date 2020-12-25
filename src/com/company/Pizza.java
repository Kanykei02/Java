package com.company;

public class Pizza {
    private double price;
    private double weight;

    public Pizza(){}

    public Pizza(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void cooking() {
        System.out.println("Готовиться пицца!");
    }

    public void delivery(){
        System.out.println("Доставка-Цена: " + price + ", вес: " + weight);
    }
}
