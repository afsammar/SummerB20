package replitpractises;
import java.util.Scanner;
public class longest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }
        int max=0;
        String longest=" ";
        for(int i= 0; i<=words.length-1; i++){
            if(words[i].length()>max) {
                max=words[i].length();
                longest = words[i];
            }


        }//write your code below
        System.out.print(longest);
    }



}

