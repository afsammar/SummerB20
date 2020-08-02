package replitpractises;
import java.util.Scanner;
public class seperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String newword="";
        for(int i=0; i<count; i++) {
        newword+=word;
        if(i!=count-1) {
            newword += separator;
        }
        }
        System.out.println(newword);
        }
    }

