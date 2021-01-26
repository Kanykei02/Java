package com.company;

public class Laptop extends AbstractComputer{
    public Laptop() {
    }

    public Laptop(double price, Model model, double discount) {
        super(price, model, discount);
    }
}
