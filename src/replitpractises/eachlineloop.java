package replitpractises;
import java.util.Scanner;
public class eachlineloop {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        int length=word.length();
        for(int i =0; i<=length-1; i++) {
            System.out.println(word.charAt(i));

        }
        }

}
