package com.company;

public class O extends MobileOperator {
    public O(String number) {
        super("500", number, 0.95, 2, 30);
    }

    @Override
    public double call(String code, String number, double minute) {
        System.out.println("Calling (" + code + ") " + number);
        double callPrice = getCallingPrice(code, minute);
        System.out.println("Calling price: " + callPrice);
        return callPrice;
    }

    @Override
    public double sendSms(String code, String number, String smsText) {
        System.out.println("Send sms to (" + code + ") " + number);
        System.out.println("Receiving a report");
        System.out.println("Receiving a gift: 3 free minute");
        return getSmsPrice();
    }

    @Override
    public double useInternet(double amount) {
        System.out.println("Using " + amount + " GB of Internet from O!");
        return getInternetPrice(amount);
    }
}
