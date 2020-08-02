package replitpractises;
import java.util.Scanner;
public class last {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int last = word.length()-1;
        char last2 = word.charAt(last);
        System.out.println(last2);
    }
}
