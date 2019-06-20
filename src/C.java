public class C extends B {
    public C () {
        System.out.println("Call constructor in class C");
    }
    static {
        System.out.println("Call static block initilization in class C");
    }
    {
        System.out.println("Call no-static block initilization in class C");
    }

}