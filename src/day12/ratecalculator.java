package day12;
import java.util.Scanner;

public class ratecalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary");
        double s = scan.nextDouble();
        System.out.println("Enter work hours");
        int w = scan.nextInt();
        double hourrate =  s/(w*52);
        System.out.println("Hourly rate of employee $" + hourrate);

    }
}
