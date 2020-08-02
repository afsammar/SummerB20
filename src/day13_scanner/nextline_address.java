package day13_scanner;
import java.util.Scanner;
public class nextline_address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number");
        int buildingnumber= scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street name");
        String streetname= scan.nextLine();

        System.out.println( buildingnumber+" "+streetname);
        scan.close();


    }
}
