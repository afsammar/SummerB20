package replitpractises;
import java.util.Scanner;
public class exist {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        for(int i = 0; i<word.length()-6; i++){
            if(word.substring(0,i+4).equals("java")) {
                exists = true;
            }else if(word.substring(1,i+4).equals("java")) {
                exists = true;
            }
            }
            System.out.println(exists);

    }
}
