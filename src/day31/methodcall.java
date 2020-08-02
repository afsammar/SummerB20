package day31;
import library.Util;

import java.util.Arrays;

public class methodcall {
    public static void main(String[] args) {
        String firstname="elkem";
        String lastname="aMMAr";
        String fullName=Util.fullname(firstname,lastname);
        System.out.println(fullName);
        String uniques = Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);
        String reverse=Util.reverse(fullName.toLowerCase());
        System.out.println(reverse);
        int []a={200,400,500,200,1000,50,40,30,400,60,78};
        int n=2500;
        int []b=Util.addelement(a,n);
        System.out.println(Arrays.toString(b));
    }
}
