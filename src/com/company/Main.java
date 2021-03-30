package com.company;

public class Main {

    public static void main(String[] args) {
        OldGenerics intGen = new OldGenerics(5);
        OldGenerics strGen = new OldGenerics("string");

        System.out.println(intGen);
        System.out.println((int)intGen.getVal() + 2);
        System.out.println(strGen);
        System.out.println(strGen.getVal() + ", number");
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
