package day20_while_loop;
import java.util.Scanner;
public class sum_of_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i == 0;){
            System.out.println("Enter a number");
           int num = scan.nextInt();
           if(num<0){
               break;
           }
            sum+=num;
        }
        System.out.println("sum is: "+sum);
    }
}
