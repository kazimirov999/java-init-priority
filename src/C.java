public class C extends B {

    private static int staticC = printInitialzationStaticVariable("Initialization static variable in class C");
    private int noStaticC = printInitialzationStaticVariable("Initialization no-static variable in class C");

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