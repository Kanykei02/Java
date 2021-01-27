package com.company;

public abstract class AbstractFood {
    private String name;

    public AbstractFood(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }
}
