package replitpractises;
import java.util.Scanner;
public class reverse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String s1 = word.substring(0,1);
        String s2 = word.substring(1,2);
        String s3 = word.substring(2,3);
        String s4 = word.substring(3,4);
        String s5 = word.substring(4,5);
        String s6 = word.substring(5);

        if (word.length()==5) {
            System.out.println(s6 + s5 + s4 + s3 + s2 + s1);
        }else if (word.length()> 5) {
                System.out.println("Too long!");
            } else {
                System.out.println("Too short!");
            }

        }}

