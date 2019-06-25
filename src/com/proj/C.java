package com.proj;

public class C extends B{

    private static int a = printInitialization ("Initialized static variable in class C");
    private int b = printInitialization ("Initialized no-static variable in class C");

    public C(){
        System.out.println("Call constructor in class C");
    }


    static {
        System.out.println("Call static block initialization in class C");
    }

    {
        System.out.println("Call no-static block initialization in class C");
    }
}
