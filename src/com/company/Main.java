package com.company;

public class Main {

    public static void main(String[] args) {
        LeftPocked leftPocked = new LeftPocked();
        leftPocked.setRinging(new Phone());
        leftPocked.print();
        leftPocked.setRinging(new SmartWatch());
        leftPocked.print();

        RightPocked rightPocked = new RightPocked();
        rightPocked.setPaperBased(new Letter());
        rightPocked.print();
        rightPocked.setPaperBased(new Origami());
        rightPocked.print();
    }
}
