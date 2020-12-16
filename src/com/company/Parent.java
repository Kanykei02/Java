package com.company;

public class Parent {
    public static int val;
    public int a;

    static {
        System.out.println("Static block!");
        val = 55;
    }

    {
        System.out.println("Non-static block!");
        a = 10;
    }

    public static void test() {
        System.out.println("Parent");
    }
}
