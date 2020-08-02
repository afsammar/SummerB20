package replitpractises;
import java.util.Scanner;
public class maxpayne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //WRITE YOUR CODE HERE
        System.out.println("Enter full name:");
        String name = scan.nextLine();
        if(name.equals("Max Payne")||name.equals("Alan Wake")){
            System.out.println("User found");
        }else{
            System.out.println("Please make your search case insensitive!");
        }
    }
}
