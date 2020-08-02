package day32;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Dates {
    public static void main(String[] args) {
        java.time.LocalDate DOB = java.time.LocalDate.of(1996,03,02);
        System.out.println(DOB);
        java.time.LocalDate today= java.time.LocalDate.now();
        System.out.println(today);
        java.time.LocalDate y = java.time.LocalDate.of(2019,1,1);
        boolean result=y.isLeapYear();
        System.out.println(result);
    Scanner scan =new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scan.nextInt();
        boolean result2= java.time.LocalDate.of(year,1,1).isLeapYear();
        System.out.println(result2);
        System.out.println("===================================");
        System.out.println("Enter year,month and day");
        int year1 =scan.nextInt();
        int month=scan.nextInt();
        int day=scan.nextInt();
        java.time.LocalDate d = java.time.LocalDate.of(year1,month,day);
        System.out.println(d);

    }
}
