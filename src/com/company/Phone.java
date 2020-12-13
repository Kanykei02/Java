package com.company;

public class Phone {
    private Beeline sim1;
    private O sim2;

    public Phone(){}

    public Phone(Beeline sim1, O sim2) {
        this.sim1 = sim1;
        this.sim2 = sim2;
    }

    public void call(String code, String number, double minute) {
        double callPriceSim1 = sim1.getCallingPrice(code, minute);
        double callPriceSim2 = sim2.getCallingPrice(code, minute);

        if(callPriceSim1 < callPriceSim2) {
            System.out.println("Using sim 1");
        } else {
            System.out.println("Using sim 2");
        }
    }

    public Beeline getSim1() {
        return sim1;
    }

    public void setSim1(Beeline sim1) {
        this.sim1 = sim1;
    }

    public O getSim2() {
        return sim2;
    }

    public void setSim2(O sim2) {
        this.sim2 = sim2;
    }
}
