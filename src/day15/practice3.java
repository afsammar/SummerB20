package day15;
import java.util.Scanner;
public class practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname = scan.next().toUpperCase();
        System.out.println("enter your last name");
        String lastname = scan.next().toUpperCase();
        String fullname = firstname+ " "+ lastname;
        System.out.println(fullname);

    }
}
