package day53_FinalKeyWord;

import javax.swing.*;

class A{
    public void  method1(){
        System.out.println("Enter username and password");
    }
    private final void method1(int a){
    }
    public final static void method2(int b ){

    }
}

public class FinalMethod extends A {

    public void method1(){
        System.out.println("Enter something else");


    }

    public final static void main(String[] args) {
        System.out.println("hello");

    }
}
