package day23;
import java.util.Scanner;
public class Months {
    public static void main(String[] args) {


    String months[] ={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-12");
        int n =scan.nextInt();

        System.out.println(months[n-1]);
    }
}
