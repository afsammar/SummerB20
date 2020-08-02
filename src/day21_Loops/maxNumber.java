package day21_Loops;
import java.util.Scanner;
public class maxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max =-999999999;
        for(int i = 1; i<=5; i++) {

            System.out.println("Enter a number");
            int number = scan.nextInt();
            if (number>max){
                max=number;
            }

        }
        System.out.println("max number is : "+max);

    }
}
