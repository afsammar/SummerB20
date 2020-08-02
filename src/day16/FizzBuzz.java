package day16;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter your first word");
        String word1 =scan.next();
        System.out.println("Enter your second word");
        String word2 = scan.next();
        boolean result = word1.length()==5 && word2.length()==5;//
        if (result){
            if(word1.endsWith(""+word2.charAt(0)) &&word2.startsWith(" "+word1.charAt(word1.length()-1))){
                System.out.println("fizz");
            }else {
                System.out.println("buzz");
            }
            }else{
            System.out.println("need to be at least 5 chars lentgh");
        }









        /*if (result){
        char ch1 =word1.charAt(word1.length()-1);//last character of the first word
        char ch2 = word2.charAt(0);//first char of the second word
        if(ch1==ch2){
            System.out.println("fizz");
        }else{
            System.out.println("buzz");
        }

        }else{
            System.out.println("needs to be at least 5 char");
        }
*/
    }
}
