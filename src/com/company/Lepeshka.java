package com.company;

public class Lepeshka extends Bread {
    double radius;

    public Lepeshka() {}
    public Lepeshka(double radius) {
        this.radius = radius;
    }

    public Lepeshka(double weight, double price, String producerCompany, double radius) {
        super(weight, price, producerCompany);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void drawPrints() {
        System.out.println("Нанесли узоры!");
    }

    public void varnish() {
        System.out.println("Нанесли лак!");
    }
}
