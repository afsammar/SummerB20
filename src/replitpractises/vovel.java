package replitpractises;
import java.util.Scanner;
public class vovel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("In");
        String word=scan.nextLine();
        for(int i =0; i<=word.length()-1; i++){
            char ch=word.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                System.out.print(ch);
            }
        }

    }
}
