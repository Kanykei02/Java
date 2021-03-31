package com.company;

public class Main {

    public static void main(String[] args) {
        OldGenerics intGen = new OldGenerics(5);
        OldGenerics strGen = new OldGenerics("string");

        System.out.println(intGen);
        System.out.println((int)intGen.getVal() + 2);
        System.out.println(strGen);
        System.out.println(strGen.getVal() + ", number");

        NewGenerics<Integer> integerNewGenerics = new NewGenerics<>(15);
        NewGenerics<String> newGenerics = new NewGenerics<>("Hello!");

        Integer[] intArr = {21, 1, 2,22};
        String[] strArr = {"Dean", "Cas", "Sam"};
        System.out.println(getLastElement(intArr));
        System.out.println(getLastElement(strArr));
    }

    public static <T> T getLastElement(T[] arr){
        if(arr.length <= 0) return null;
        return arr[arr.length - 1];
    }
}

class OldGenerics{
    private Object val;

    public OldGenerics(Object val){
        this.val = val;
    }

    @Override
    public String toString(){
        return " (" + val + ") ";
    }

    public Object getVal() {
        return val;
    }
}

class NewGenerics<T>{
    private T val;

    public NewGenerics(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return " (" + val + ") ";
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
