package com.company;

public class Main {

    public static void main(String[] args) {
//        double a = 7;
//        if(Math.sqrt(a) != (int)Math.sqrt(a)){
//            throw new Error();
//        }
        try{
            Object o = null;
            raiser(o);
        }
        catch (NullPointerException npe){
            System.out.println("Vzyali!");
            npe.printStackTrace();
        }
        System.out.println("=============================================");
        Cat[] array = {new Cat("Dean"), new Cat("Sam"), new Cat("Crowly"), null, new Cat("Cas")};
        for(int i = 0; i < array.length; i++) {
            try {
                System.out.println(array[i].getName());
                System.out.println(array[i+1].getName());
            } catch (NullPointerException npe) {
                System.out.println("Vzyali NullPointerException");
                npe.printStackTrace();
            }
        }
    }
    public static void raiser(Object o) throws NullPointerException{
        if(o == null){
            throw new NullPointerException();
        }
    }
}
class Cat{
    private String name;

    public Cat(){}

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
