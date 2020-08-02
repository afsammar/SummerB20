package replitpractises;
import java.util.Scanner;
public class Xx {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char first = 'x';
        char second = 'X';

        int length = word.length();
        if((word.charAt(0)==first||word.charAt(0)==second)&&(word.charAt(length-1)==first||word.charAt(length-1)==second)){
            System.out.println(word.substring(1,length-1));


        }else if(word.charAt(length-1)==first||word.charAt(length-1)==second){
            System.out.println(word.substring(0,length-1));
        }else if(word.charAt(0)==first||word.charAt(0)==second){
        System.out.println(word.substring(1,length));
        }else{
         System.out.println(word);
     }

    }
}
