package day16;

import java.util.SortedMap;

public class Stringmethods {
    public static void main(String[] args) {
        String name1 = "Cybertek" ;
        System.out.println(name1.isEmpty());
        String name2 ="";
        System.out.println(name2.isEmpty());
        String str1 ="java";//String pool
        String str2 = new String ("java");//heap
        System.out.println(str1+" : " + str2);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        String str5 ="Java";
        String str6 ="JAVA";
        System.out.println(str5==str6);
        System.out.println(str5.equalsIgnoreCase(str6));
        String str = "I like to learn java programming language";

        System.out.println( str.contains("phhyton"));
        System.out.println(!str.contains("phyton"));
        String s1 = "Ammar";
        System.out.println(s1.startsWith("A"));
        System.out.println(s1.startsWith("Am"));


    }
}
