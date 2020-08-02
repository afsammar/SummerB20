package replitpractises;
import java.util.Scanner;
public class hours {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of miligrams in drink");
        int miligrams = input.nextInt();
        int overdose=10*1000/miligrams;
        System.out.println("It would take about "+ overdose+" drinks "+" for a lethal overdose.");




    }
}
