package replitpractises;
import java.util.Scanner;
public class calling {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter area code and local number");
        int areaCode = input.nextInt();
        int localNumber=input.nextInt();



String phonenumber1 = "("+ areaCode+")"+"-"+localNumber;


        System.out.println("calling number "+phonenumber1);

    }
}
