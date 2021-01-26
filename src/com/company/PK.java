package com.company;

public class PK extends AbstractComputer{
    private int monitorDiagonal;

    public PK(int monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public PK(double price, Model model, double discount, int monitorDiagonal) {
        super(price, model, discount);
        this.monitorDiagonal = monitorDiagonal;
    }

    public int getMonitorDiagonal() {
        return monitorDiagonal;
    }

    public void setMonitorDiagonal(int monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    @Override
    public String toString(){
        return "\nPrice: " + getPrice() + "\nModel: " + getModel() +
                "\nMonitor Diagonal: "+ getMonitorDiagonal() + "\nDiscount: " + getDiscount() +
                "\nPrice with discount: " + getPriceWithDiscount();
    }
}
