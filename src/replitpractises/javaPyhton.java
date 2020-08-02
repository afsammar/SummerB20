package replitpractises;
import java.util.Scanner;
public class javaPyhton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countjava=0;
        int countpython=0;
        for(int i=0; i<=sentence.length()-4; i++){
        if(sentence.substring(i,i+4).equalsIgnoreCase("java")){
            countjava++;
        }}
        for(int i=0; i<=sentence.length()-6; i++){
        if(sentence.substring(i,i+6).equalsIgnoreCase(("python"))){
            countpython++;
        }}
        System.out.println(countjava==countpython);
    }
}
