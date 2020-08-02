package replitpractises;
import java.util.Scanner;
public class candies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numOfCoupons = input.nextInt();
        int candy=numOfCoupons/10;
        int gumballs=(numOfCoupons%10)/3;
        if(numOfCoupons<3) {
            System.out.println("Not enough coupons");
        }else {
            System.out.println("Number of Candies: " + candy);
            System.out.println("Number of Gumballs: " + gumballs);
        }}



    }

