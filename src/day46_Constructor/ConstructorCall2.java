package day46_Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){
        System.out.println("A");

    }
    public ConstructorCall2(int a){
        //ConstructorCall2();
        this();
        System.out.println("B");
    }
    public ConstructorCall2(String str){
        this(4);
        System.out.println("C");
    }

    public static void main(String[] args) {
        new ConstructorCall2(10);
    }

}
