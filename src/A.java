public class A {
    private static int staticA = printInitialzationStaticVariable("Initialization static variable in class A");
    private int noStaticA = printInitialzationStaticVariable("Initialization no-static variable in class A");

    public A() {
        System.out.println("Call constructor in class A");
    }
    static {
        System.out.println("Call static block initilization in class A");
    }
    {
        System.out.println("Call no-static block initilization in class A");
    }

   static int printInitialzationStaticVariable(String s){
       System.out.println(s);
       return 0;
    }
}