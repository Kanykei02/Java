package com.company.familu;

public abstract class AbstractHouse {
    private String street;
    private int house;

    public AbstractHouse(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public abstract void payBill();

    @Override
    public String toString() {
        return "Street: " + getStreet() + ", house: " + getHouse();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }
}
