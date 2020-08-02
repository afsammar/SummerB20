package day20_while_loop;
import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String password = "Cybertek123";

        System.out.println("enter your password");
        String input= scan.nextLine();

        while(!input.equals(password)){
            System.out.println("Please re-enter your password");
            input=scan.nextLine();
        }
        System.out.println("logged in");
    }

}
