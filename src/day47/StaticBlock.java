package day47;

import java.util.ArrayList;

public class StaticBlock {
    static String companyName = "Bank of America";


    static ArrayList<Integer>list = new ArrayList<>();
        static {
            companyName="Bank of America";

            list = new ArrayList<>();
            list.add(10);
            list.add(20);
            list.add(30);
    }

    public static void main(String[] args) {
        System.out.println(companyName);
        System.out.println(list);
    }
}
