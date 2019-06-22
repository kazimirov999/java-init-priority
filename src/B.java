public class B extends A {

    private static int staticB = printInitialzationStaticVariable("Initialization static variable in class B");
    private int noStaticB = printInitialzationStaticVariable("Initialization no-static variable in class B");

    public B() {
        System.out.println("Call constructor in class B");
    }
    static {
        System.out.println("Call static block initilization in class B");

    }
    {
        System.out.println("Call no-static block initilization in class B");
    }

}