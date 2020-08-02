package day12;
import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println( "enter your first number ");
        int a = scan.nextInt();
        System.out.println("enter your second number ");
        int b =scan.nextInt();

        int sum= a+b;
        System.out.println("Sum of those two numbers are " +sum);
    }

}
