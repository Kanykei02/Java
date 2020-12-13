package com.company;

public class Megacom extends MobileOperator {
    public Megacom(String number){
        super("555", number, 1.05, 1.7, 40);
    }

    @Override
    public double call(String code, String number, double minute) {
        System.out.println("Calling from (" + getCode() + ") " + getNumber() + " to " + "( " + code + " ) " + number);
        return getCallingPrice(code, minute);
    }

    @Override
    public double sendSms(String code, String number, String smsText) {
        System.out.println("Sending sms from (" + getCode() + ") " + getNumber() + " to " + "( " + code + " ) " + number);
        return getSmsPrice();
    }

    @Override
    public double useInternet(double amount) {
        System.out.println("Using " + amount + " GB of Internet from Megacom");
        return getInternetPrice(amount);
    }
}
