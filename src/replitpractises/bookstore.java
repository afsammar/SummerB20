package replitpractises;
import java.util.Scanner;
public class bookstore {
    public static void main(String[] args) {
        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        if(isPremiumCustomer&&nbooksPurchased>=5&&nbooksPurchased<8){
            freeBooks=1;
            System.out.println(freeBooks);
        }else if(isPremiumCustomer&&nbooksPurchased>=8){
            freeBooks=2;
            System.out.println(freeBooks);
        }else if(!isPremiumCustomer&&nbooksPurchased>=7&&nbooksPurchased<12) {
            freeBooks = 1;
            System.out.println(freeBooks);
        }else if(!isPremiumCustomer&&nbooksPurchased>=12){
            freeBooks=2;
            System.out.println(freeBooks);
        }else {
            freeBooks=0;
            System.out.println(freeBooks);
        }
    }
}
