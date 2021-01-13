package com.company;

public class Chicken implements Put{
    @Override
    public void putEgg(){
        System.out.println("Курица откладывает яйца!");
    }
    @Override
    public String toString(){
        return "Курица";
    }
}
