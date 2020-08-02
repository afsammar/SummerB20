package replitpractises;
import java.util.Scanner;
public class zombie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day = 0;
        for(int j =0; j<=inhabitants; inhabitants/=2){
        for(int i =inhabitants; i<=1; inhabitants/=2 ) {
            day++;
            System.out.println("Day " + day + inhabitants);

        }
        }

        }
}
