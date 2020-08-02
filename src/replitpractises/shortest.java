package replitpractises;
import java.util.Arrays;
import java.util.Scanner;
public class shortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};
        String b ="";
        int a =0;
        for(int i =0; i<str.length-1; i++) {

            if (a > str[i].length()) {
               a=str[i].length();
                b=str[i];


            }
        }
        System.out.println(b);
    }
}
