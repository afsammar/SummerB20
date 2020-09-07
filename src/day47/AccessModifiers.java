package day47;

public class AccessModifiers {
    public static int publicVariable = 100;

    public static void publicMethod(){
        System.out.println("public method");
    }
    static int defaultVariable = 200;

    static void defaultMethod() {
        System.out.println("default method");
    }
    private static int privateVariable = 300;

    private static void privateMethod(){
        System.out.println("private method");
    }

    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);

        publicMethod();
        privateMethod();
        defaultMethod();
    }
}
