package com.company;

import java.util.Objects;

public class Multiple {
    private Integer a;
    private Integer b;

    public Multiple(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getMultAB() {
        return a * b;
    }

    @Override
    public String toString() {
        return "A: " + a + ", B: " + b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof Multiple)
//            return ((Multiple) obj).getMultAB() == this.getMultAB();
//        return false;
//    }
}
