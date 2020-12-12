package com.company;

public class Lavash extends Bread {
    double radius;
    double thickness;
    String name;

    public Lavash(){}

    public Lavash(double weight, double price, String producerCompany, double radius, double thickness, String name) {
        super(weight, price, producerCompany);
        this.radius = radius;
        this.thickness = thickness;
        this.name = name;
    }

    public void wrap() {
        System.out.println("Завернули!");
    }

    @Override
    public void bake() {
        System.out.println("Я " + name + " лаваш, меня испекли!");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
