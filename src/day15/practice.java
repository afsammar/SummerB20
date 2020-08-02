package day15;
import java.util.Scanner;
public class practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname= scan.next();
        System.out.println("Enter your last name");
        String lastname=scan.next();
        firstname = firstname.concat(" ".concat(lastname));
        System.out.println(firstname);
        //toLowerCase():

        String name1 = "CYBERTEK SCHOOL";
        name1 = name1.toLowerCase();
        System.out.println(name1);
    }
}
