package com.company;

public class Backpack {
    private Flat flat;
    private Circular circular;
    private Cylindrical cylindrical;

    public Backpack(){}

    public Backpack(Flat flat, Circular circular, Cylindrical cylindrical) {
        this.flat = flat;
        this.circular = circular;
        this.cylindrical = cylindrical;
    }

    public void print(){
        System.out.printf("%s, %s, %s .", flat, circular, cylindrical);
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }

    public Circular getCircular() {
        return circular;
    }

    public void setCircular(Circular circular) {
        this.circular = circular;
    }

    public Cylindrical getCylindrical() {
        return cylindrical;
    }

    public void setCylindrical(Cylindrical cylindrical) {
        this.cylindrical = cylindrical;
    }
}
