package com.company;

public class Container {
    private Swimible swimible;
    private Put putEggs;

    public void print() {
        System.out.println("Плавающий: " + swimible + "\nОткладывающий яйца: " + putEggs);
    }

    public Swimible getSwimible() {
        return swimible;
    }

    public void setSwimible(Swimible swimible) {
        this.swimible = swimible;
    }

    public Put getPutEggs() {
        return putEggs;
    }

    public void setPutEggs(Put putEggs) {
        this.putEggs = putEggs;
    }
}
