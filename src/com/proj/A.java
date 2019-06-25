package com.proj;

public class A {

    public A(){
        System.out.println("Call constructor in class A");
    }


    static {
        System.out.println("Call static block initialization in class A");
    }

    {
        System.out.println("Call no-static block initialization in class A");
    }
}


