package com.company;

public class Main {

    public static void main(String[] args) {
        Beeline bee = new Beeline("505050");
        O oSim = new O("344034");

        Phone phone = new Phone(bee, oSim);

        phone.call("500", "344034", 30);
    }
}
