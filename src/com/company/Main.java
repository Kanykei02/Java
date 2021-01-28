package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Circular> apple1 = new ArrayList<>();
        for (int i = 1; i <= 20; i++){
            apple1.add(new Apple(i));
        }

        ArrayList<Circular> tns = new ArrayList<>();
        for (int i = 1; i <= 50; i++){
            tns.add(new TennisBall(i));
        }

        ArrayList<Circular> apl = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            apl.add(new Apple());
        }

        ArrayList<Circular> tns2 = new ArrayList<>();
        tns2.add(new TennisBall(0));
        tns2.add(new TennisBall(1));
        tns2.add(new TennisBall(2));

        Backpack backpack1 = new Backpack(new Book(), apple1, new CocaCola());
        Backpack backpack2 = new Backpack(new Folder(), tns, new BottleOfWater());
        Backpack backpack3 = new Backpack(apl, tns2, new Folder(), new CocaCola());
    }
}
