package com.proj;

public class A {

    private static int a = printInitialization ("Initialized static variable in class A");
    private int b = printInitialization ("Initialized no-static variable in class A");

    public A(){
        System.out.println("Call constructor in class A");
    }

    static {
        System.out.println("Call static block initialization in class A");
    }

    {
        System.out.println("Call no-static block initialization in class A");
    }

    protected static int printInitialization(String s){
        System.out.println(s);
        return 1;
    }
}


