package day16;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you employed");
        String answer = input.next();
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("emplyoyeed");
        }else {
            System.out.println("Not employeed");

        }


    }
}
