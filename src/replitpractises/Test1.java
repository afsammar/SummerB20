package replitpractises;

import day43_Static.Test;

public class Test1 {

    static String name = "Aron";

    public static void main(String[] args) {
        System.out.println("Daniel");
    }
    public static void print (String str){
        System.out.println(str);
    }
    static {
        print(name);
    }
}
