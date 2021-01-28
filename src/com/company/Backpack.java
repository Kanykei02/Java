package com.company;

import java.util.ArrayList;

public class Backpack implements Flat, Cylindrical, Circular{
    private Flat flat;
    private ArrayList<Circular> circular;
    private ArrayList<Circular> circular1;
    private Cylindrical cylindrical;

    public Backpack(){}

    public Backpack(Flat flat, ArrayList<Circular> circular, Cylindrical cylindrical) {
        this.flat = flat;
        this.circular = circular;
        this.cylindrical = cylindrical;
    }

    public Backpack(ArrayList<Circular> circular, ArrayList<Circular> circular1, Flat flat, Cylindrical cylindrical){
        this.circular = circular;
        this.circular1 = circular1;
        this.flat = flat;
        this.cylindrical = cylindrical;
    }
}
