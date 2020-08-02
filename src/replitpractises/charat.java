package replitpractises;
import java.util.Scanner;
public class charat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        char third= txt.charAt(4);
        char fifth= txt.charAt(6);
        char sixth= txt.charAt(7);
        System.out.print(third);
        System.out.print(fifth);
        System.out.print(sixth);

    }
}
