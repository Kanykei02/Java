package com.company;

public class MobileOperator {
    private String code;
    private String number;
    private double minutePrice;
    private double smsPrice;
    private double gbPrice;

    public MobileOperator(){}

    public MobileOperator(String code, String number, double minutePrice, double smsPrice, double gbPrice) {
        this.code = code;
        this.number = number;
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        this.gbPrice = gbPrice;
    }

    public double call(String code, String number, double minute){
        System.out.println("Calling (" + code + ") " + number);
        return getCallingPrice(code, minute);
    }

    public double sendSms(String code, String number, String smsText) {
        System.out.println("Send sms to (" + code + ") " + number);
        return getSmsPrice(code);
    }

    private double getSmsPrice(String code) {
        return smsPrice;
    }

    public double useInternet(double amount) {
        System.out.println("Using " + amount + " GB of Internet");
        return getInternetPrice(amount);
    }

    public double getCallingPrice(String code, double minute) {
        if(code.equals(this.code)) return 0;
        else return minute * minutePrice;
    }

    public double smsPrice(String code) {
        if(code.equals(this.code)) return 0;
        else return smsPrice;
    }

    public double getInternetPrice(double amount) {

        return amount * gbPrice;
    }

    public String getCode() {

        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getMinutePrice() {

        return minutePrice;
    }

    public void setMinutePrice(double minutePrice) {

        this.minutePrice = minutePrice;
    }

    public double getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(double smsPrice) {

        this.smsPrice = smsPrice;
    }

    public double getGbPrice() {

        return gbPrice;
    }

    public void setGbPrice(double gbPrice) {
        this.gbPrice = gbPrice;
    }
}
