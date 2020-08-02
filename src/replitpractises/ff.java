package replitpractises;
import java.util.Scanner;
public class ff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        char w1 = word1.charAt(0);
        char w2 = word1.charAt(1);
        char w3 = word1.charAt(2);
        char w21 = word2.charAt(0);
        char w22 = word2.charAt(1);
        char w23 = word2.charAt(2);
        if(word1.length()==3){
            System.out.print(w1);
            System.out.print(w21);
            System.out.print(w2);
            System.out.print(w22);
            System.out.print(w3);
            System.out.print(w23);


        }else{
            System.out.println("cannot merge");
        }

    }
}
