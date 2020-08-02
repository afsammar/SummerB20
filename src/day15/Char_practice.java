package day15;
import java.util.Scanner;
public class Char_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName=input.next();
        String lastName = input.next();
        char initial =firstName.charAt(0);
        char initial2=lastName.charAt(0);
        System.out.println(initial);
        System.out.println(initial2);

    }
}
