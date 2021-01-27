package com.company;

public class Me {
    private int age;
    private String education;

//    public void eat(AbstractFood food) throws Exception{
//        if (food instanceof Honey){
//            throw new Exception();
//        }
//        System.out.println("I'm eating " + food);
//    }

    public void eatFood(AbstractFood food) throws Exception{
        if (food instanceof Honey){
            throw new Exception();
        }
        System.out.println("I'm eating " + food);
    }
    public void toGo(AbstractDestination dst) throws IllegalAccessException{
        if (dst == null) {
            throw new IllegalAccessException();
        }
        System.out.println("I go to " + dst);
    }
}
