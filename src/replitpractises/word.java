package replitpractises;
import java.util.Scanner;
public class word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int l = word.length();
        int position = (word.length())/2;
        int position2= (word.length()/2-1);
        int position3= (word.length()/2);
        if(l%2!=0&&l>=3) {
            System.out.println(word.charAt(position));
        }else if(l==1){
            System.out.println(word+word+word);
        }else if(l%2==0&&l>=4){
            System.out.println(""+word.charAt(position2)+word.charAt(position3));
        }else if(l==2){
            System.out.println(word+word);
        }

    }
}
