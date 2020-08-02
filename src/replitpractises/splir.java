package replitpractises;

import java.util.Arrays;

public class splir {
    public static void main(String[] args) {
        String a="Java is fun";
        String []words=a.split(" ");

        for (int i=0; i<=words.length; i++){
            System.out.println(words[i]);
        }
    }
}
