public class A {
    public A() {
        System.out.println("Call constructor in class A");
    }
    static {
        System.out.println("Call static block initilization in class A");
    }
    {
        System.out.println("Call no-static block initilization in class A");
    }

}