package com.company;

public class Apple implements Circular{
    private int pc;

    public Apple(int pc) {
        this.pc = pc;
    }

    @Override
    public String toString(){
        return "Apple";
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }
}
