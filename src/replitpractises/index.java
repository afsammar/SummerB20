package replitpractises;
import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = "foo bar";
        int b = txt.indexOf("b");
        System.out.println(b);
        int a = txt.indexOf("foo");
        System.out.println(a);
    }
}
