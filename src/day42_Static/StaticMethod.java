package day42_Static;

public class StaticMethod {

    int a = 200;
    static int b=400;


    public static void main(String[] args) {
        System.out.println(b);
        StaticMethod obj =new StaticMethod();
        System.out.println(obj.a);
        //the only way to call instances in a static method

        staticMethod();
        StaticMethod.staticMethod();
        //instanceMethod();

        obj.instanceMethod();
    }
    public static void staticMethod(){

    }
    public void instanceMethod(){

    }
}
