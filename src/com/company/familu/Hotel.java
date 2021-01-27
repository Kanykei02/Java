package com.company.familu;

public class Hotel extends AbstractHouse{
    public Hotel(String street, int house) {
        super(street, house);
    }

    @Override
    public void payBill() {
        System.out.println("Платим за коммунальные услуги!");
    }
}
