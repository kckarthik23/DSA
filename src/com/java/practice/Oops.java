package com.java.practice;

class OopsParent {
    OopsParent() {
        System.out.println("super constructor");
    }

    protected void print() {
        System.out.println("super");
    }
}

public class Oops extends OopsParent {
    Oops() {

        System.out.println("Child constri=uctor");
    }

    protected void print() {
        System.out.println("sub");
    }

    public static void main(String[] args) {
        Oops child = new Oops();
        child.print();

    }

}
