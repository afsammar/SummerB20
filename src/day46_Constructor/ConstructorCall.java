package day46_Constructor;

public class ConstructorCall {
   public ConstructorCall(){
       method1();
       method2();
   }



    public static void method1(){
        method2();
    }
    public static void method2(){
        method1();
    }
}
