package com.proj;

public class B extends A {

    private static int a = printInitialization ("Initialized static variable in class B");
    private int b = printInitialization ("Initialized no-static variable in class B");

    public B(){
        System.out.println("Call constructor in class B");
    }


    static {
        System.out.println("Call static block initialization in class B");
    }

    {
        System.out.println("Call no-static block initialization in class B");
    }
}
