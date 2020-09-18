package day52_Exceptions;

public class ThrowsKeyword {
    public static void main(String[] args)throws InterruptedException {
       try {
           method1();
       }catch (InterruptedException e){
           e.getMessage();
       }
       method2();
       method3();
    }
    public static void method1() throws  InterruptedException{

        Thread.sleep(3000);
    }
    public static void method2() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
    }

    public static void method3() throws InterruptedException{
        method1();

        }
    }

