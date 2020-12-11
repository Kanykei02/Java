package com.company;

public class Bread {
    double weight;
    double price;
    String producerCompany;

    public Bread() {}
    public Bread(double weight, double price, String producerCompany) {
        this.weight = weight;
        this.price = price;
        this.producerCompany = producerCompany;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }
    public void bake() {
        System.out.println("Хлеб готов!");
    }
    public void pack() {
        System.out.println("Хлеб упакован!");
    }
}
