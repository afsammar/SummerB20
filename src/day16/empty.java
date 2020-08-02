package day16;
import java.util.Scanner;
public class empty {
    public static void main(String[] args) {
        String str = "I like java";
        if(str.length()==0){
            System.out.println("empty string");
        }else if (str.length()>3){
            System.out.println(str.substring(str.length()-3));
        }else {
            System.out.println(str);
        }




    }

}
