package day16;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1= scan.nextDouble();

        System.out.println("Enter your second number");
        double num2=scan.nextDouble();

        System.out.println("Enter the math operator");
        char operator = scan.next().charAt(0);

        boolean result = operator=='/'||operator=='*'||operator=='-'||operator=='+'||operator=='%';
        if(result){
            switch (operator){
                case'*':
                    System.out.println(num1*num2);
                    break;
                case'/':
                    System.out.println(num1/num2);
                    break;
                case'%':
                    System.out.println(num1%num2);
                    break;
                case'-':
                    System.out.println(num1-num2);
                    break;
                case '+':
                    System.out.println(num1+num2);
                default:
                    System.out.println(num1-num2);
            }

        }else{
            System.out.println("invalid operator");
        }

    }
}
