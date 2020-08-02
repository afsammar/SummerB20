package replitpractises;
import java.util.*;
public class firsttwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        for (int i=0; i<=words.length-1; i++) {
            char first=words[i].charAt(0);
            int len = +words[i].length()-1;
            char last =words[i].charAt(len);


            System.out.println(Arrays.toString(words));
        }

    }
}
