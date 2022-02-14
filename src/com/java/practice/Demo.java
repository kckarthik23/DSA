package com.java.practice;

public interface Demo {

    public int square(int n);

}

class DemoImpl {

    public static void main(String[] args) {

        Demo d = val -> val * val;
        System.out.println("val is " + d.square(4));
    }

}
