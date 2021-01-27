package com.company;

public class Hostel extends AbstractHouse{
    public Hostel(String street, int house) {
        super(street, house);
    }

    @Override
    public void payBill() {
        System.out.println("Платим за проживание!");
    }
}
