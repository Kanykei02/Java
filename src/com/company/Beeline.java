package com.company;

public class Beeline extends MobileOperator {
    public Beeline() {
        super("777", 1, 1.2, 30);
    }

    @Override
    public double call(String code, String number, double minute) {
        System.out.println("Beeline^^^^^ + ") " + number);
        System.out.println("Playing Beeline melody");
        return getMinutePrice();
    }

    @Override
    public double sendSms(String code, String number, String smsText) {
        System.out.println("Send sms to (" + code + ") " + number);
    }
}
