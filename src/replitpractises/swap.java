package replitpractises;
import java.util.Scanner;
public class swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        char underscore = '_';
        int a = email.indexOf(underscore);
        char sign = '@';
        int b = email.indexOf(sign);
        if(email.contains("_")){
            System.out.println(email.substring(a+1,b)+"_"+email.substring(0,a)+"@gmail.com");

        }else{
            System.out.println(email);
        }


    }
}
