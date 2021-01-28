package com.company;

public class TennisBall implements Circular{
    private int pc;

    public TennisBall(int pc) {
        this.pc = pc;
    }

    @Override
    public String toString(){
        return "Tennis ball";
    }

    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }
}
