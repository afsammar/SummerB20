package day51_exceptions;
class C{

    public C (int a){
        System.out.println("super class int arg constructor");
    }
}
public class SuperKeyword3 extends C {
    public SuperKeyword3(int a ){
        super(100);
        System.out.println("Sub class constructor with in arg");
    }

    public static void main(String[] args) {
        new SuperKeyword3(100);
    }
}
