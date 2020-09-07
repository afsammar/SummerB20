package day51_exceptions;
class B{

    public B(){
        System.out.println("Super class default constructor");
    }
}

public class SuperKeyword2 extends B {

    public SuperKeyword2(){
        System.out.println("Sub class default constructor");
    }

    public static void main(String[] args) {
        new SuperKeyword2();
    }
}
