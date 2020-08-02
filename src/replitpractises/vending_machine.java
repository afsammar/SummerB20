package replitpractises;
import  java.util.Scanner;
public class vending_machine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents: ");
        int itemPrice = scan.nextInt();
        int quarters =(100-itemPrice)/25;
        int dimes = (100-(quarters*25+itemPrice))/10;
        int nickels =(100-(dimes*10+itemPrice+quarters*25))/5;



        if(itemPrice%5==0 &&itemPrice>=25&&itemPrice<=100){
            System.out.println("Your change is: "+quarters+" quarters, "+dimes+" dimes, and "+
                    nickels+" nickels");
        }else{
            System.out.println("Invalid price");
        }

    }
}
