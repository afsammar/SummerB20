package day43_Static;

import java.util.Arrays;

import static library.Resources.a;
import static library.Resources.*;//imports all class static class members from the class


public class Test {
    public static void main(String[] args) {

        System.out.println(StaticClass.a);
        System.out.println(StaticClass.b);
        System.out.println(StaticClass.c);

        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);

        System.out.println("=====================================");
        System.out.println(a);



    }
}
