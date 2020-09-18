package day52_Exceptions;

public class ThrowsPracticee {
    public static void m1()throws InterruptedException{
        Thread.sleep(3000);
    }
    public static void m2()throws  InterruptedException{
        m1();
    }
    public static void m3()throws InterruptedException{
        m2();
    }
    public static void m4()throws InterruptedException{
        m3();
    }
}
