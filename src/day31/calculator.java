package day31;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        double num =scan.nextDouble();
        System.out.println("Enter operator");
        char oper=scan.next().charAt(0);
        System.out.println("Enter second number");
        double num2 =scan.nextDouble();
       double result= calculator(num,num2,oper);
        System.out.println(result);
    }
    public static double calculator(double num, double num2, char oper){
        double result=(oper=='+')?num+num2:(oper=='-')?num-num2:(oper=='*')?num*num2:(oper=='/')?num/num2:(oper=='%')?num%num2
                :0;
        return result;
    }
}
