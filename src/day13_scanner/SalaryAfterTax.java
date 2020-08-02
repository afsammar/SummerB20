package day13_scanner;
import java.util.Scanner;

public class SalaryAfterTax {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
      int salary=  input.nextInt();
        System.out.println("enter your state tax rate: ");
        double taxRate =input.nextDouble();
        double totalStateTax= salary*taxRate;
        System.out.println("Enter your state tax rate: ");
        double federalTaxRate = input.nextDouble();
        double federalTax= salary*federalTaxRate;

        double salaryAfterTax = salary - totalStateTax-federalTax;
        System.out.println("Your annual salary: $"+salary);
        System.out.println("Your state tax: $"+totalStateTax);
        System.out.println("federal tax : $"+federalTax);
        System.out.println("Your salary after tax : $"+salaryAfterTax);


    }
}
