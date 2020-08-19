package day43_Static;

public class StaticBlock {

    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static {//runs first,runs one time as soon asn the class loaded
        System.out.println("Static Block");
    }
}
