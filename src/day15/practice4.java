package day15;
import java.util.Scanner;
import java.util.SortedMap;

public class practice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentnece=scan.nextLine();

        System.out.println(sentnece.charAt(0));
        System.out.println(sentnece.charAt(sentnece.length()-1));


    }
}
