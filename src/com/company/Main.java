package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<AbstractComputer> computers = new ArrayList<>();
        int discount = 20;
        for (int i = 1; i < 50; i++){
            computers.add(new Laptop(i * 150, Model.Dell, discount));
            computers.add(new PK(i * 100, Model.Sony, 0, 23));
        }
        System.out.println(computers);

        int lpPrice = 0, lpPriceWithDiscount = 0, pcPrice = 0;
        for (AbstractComputer comp : computers){
            if (comp instanceof Laptop){
                lpPrice += comp.getPrice();
                lpPriceWithDiscount += comp.getPriceWithDiscount();
            }
            else {
                pcPrice += comp.getPrice();
            }
        }
        System.out.println("===================================ООО==================================");
        System.out.println("Laptop price sum: " + lpPrice + "\n Laptop with discount: " + lpPriceWithDiscount +
                "\nPc price sum: " + pcPrice);

//        double findPrice = 7350.0;
//        String findModel = "Dell";
//        for (AbstractComputer compp : computers) {
//            if(compp.getPrice() == findPrice && compp.getModel().equals(findModel)){
//                System.out.println(compp);
//                break;
//            }
//        }
        AbstractComputer findComp = new PK(150.0, Model.Dell, 20, 23);
        System.out.println("\nFound: \n" + findComp.find(computers));

        System.out.println("============================================================================");

        Model[] models = Model.values();
        System.out.println(Model.Lenovo.ordinal());

        System.out.println("================================================================================");

        WeekDay weekDay = WeekDay.Friday;
        if(weekDay == WeekDay.Monday || weekDay == WeekDay.Wednesday || weekDay == WeekDay.Friday){
            System.out.println("Учеба в " + weekDay.getRusName());
        }
        else {
            System.out.println("В " + weekDay.getRusName() + " я не учусь");
        }

        switch (weekDay){
            case Monday:
            case Wednesday:
            case Friday:
                System.out.println("Учеба в " + weekDay.getRusName());
            default:
                System.out.println("В " + weekDay.getRusName() + " я не учусь");
        }

        WeekDay[] weekDays = WeekDay.values();
        for (WeekDay wday : weekDays){
            System.out.println(wday.getRusName());
        }
    }
}
