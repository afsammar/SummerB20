package replitpractises;
import java.util.Scanner;
public class shopping3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        String more ="yes";

        do{
            System.out.println("Enter Item"+count+" and its price:");
            item=scan.next();
            price=scan.nextDouble();

            System.out.println("Add one more item?");
            more=scan.next();
            shoppingListReport+=", Item"+count+": "+item+" Price: "+price;


            totalPrice=totalPrice+price;
            count++;
        }while (more.equalsIgnoreCase("yes"));
        System.out.println(shoppingListReport.substring(2));
        System.out.println("Total price: "+totalPrice);





        }
         }




