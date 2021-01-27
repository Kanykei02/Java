package com.company;

public abstract class AbstractDestination {
    private String name;

    public AbstractDestination(String name) {
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
