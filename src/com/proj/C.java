package com.proj;

public class C extends B{

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
