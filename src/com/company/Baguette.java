package com.company;

public class Baguette extends Bread{
    double length;
    int strips;
    String name;

    public Baguette() {}

    public Baguette(double weight, double price, String producerCompany, double length, int strips, String name) {
        super(weight, price, producerCompany);
        this.length = length;
        this.strips = strips;
        this.name = name;
    }

    public void makeStrips() {
        System.out.println("Нанесли рубцы!");
    }

    @Override
    public void pack() {
        System.out.println("Только в экологичный пакет!");
    }

    @Override
    public void bake() {
        System.out.println(name + "готов!");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getStrips() {
        return strips;
    }

    public void setStrips(int strips) {
        this.strips = strips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
