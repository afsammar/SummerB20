package replitpractises;
import java.util.Scanner;
public class wordcontains {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
      boolean result= sentence.contains(word);
      if(result){
        System.out.println(word);




        }
    }
}
