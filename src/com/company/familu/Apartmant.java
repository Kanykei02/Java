package com.company.familu;

public class Apartmant extends AbstractHouse{
    public Apartmant(String street, int house) {
        super(street, house);
    }

    @Override
    public void payBill() {
        System.out.println("Платим за коммунальные услуги!");
    }
}
