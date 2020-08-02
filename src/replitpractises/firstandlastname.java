package replitpractises;
import java.util.Scanner;
public class firstandlastname {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String firstName = scan.next();
        String lastName = scan.next();
        String initialF= firstName.substring(0,1);
        String initialL= lastName.substring(0,1);
        System.out.println("Your initials are: "+initialF.toUpperCase()+initialL.toUpperCase());
    }
}
