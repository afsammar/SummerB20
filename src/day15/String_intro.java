package day15;
import java.lang.String;
import java.util.Scanner;

public class String_intro {
    public static void main(String[] args) {
        String str = "Cybertek";
        //Scanner input=new Scanner(System.in);
        String name ="cybertek";

        String s1 ="Cat";
        String s2 ="Cat";
        System.out.println(s1==s2);//in the same location"string pool" and its the same char

        String t1 = new String("tiger");
        String t2 = new String("tiger");
        System.out.println(t1==t2);
        String c1 ="Cybertek";//string pool
        String c2 =new String("Cybertek");//heap
        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek";//string literal ,string pool

        System.out.println(c1==c2);//different location different objects
        System.out.println(c4==c5);
        String str1 = "Java";
        str1 = "JavaScript";
        System.out.println(str1);






    }
}
