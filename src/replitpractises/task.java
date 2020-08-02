package replitpractises;
import java.util.Scanner;
public class task {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two words");
        String word1 = scan.next();
        String word2 = scan.next();

        int l = word1.length()-1;
        char w1 = word1.charAt(l);
        char w2 = word2.charAt(0);
        if(w1==w2){
            System.out.println(word1.substring(0,word1.length()-1)+word2);
        }


    }
}
