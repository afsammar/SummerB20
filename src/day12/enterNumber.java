package day12;
import java.util.Scanner;
public class enterNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("enter your number1");
        int num1 = input.nextInt();

        String even = num1%2==0 ? "even" : "odd";
        System.out.println(even);
    }

}
