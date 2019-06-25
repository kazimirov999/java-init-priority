package com.proj;

public class B extends A {

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
