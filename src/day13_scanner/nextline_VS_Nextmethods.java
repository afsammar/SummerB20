package day13_scanner;
import java.util.Scanner;
public class nextline_VS_Nextmethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre your salary");
        double salary = scan.nextDouble();

        scan.nextLine();//we use this to take out the "enter" that is left in         System.out.println("enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Salary: "+salary);
        System.out.println("full name"+fullName);

    }
}
