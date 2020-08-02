package day22;
import com.sun.prism.shader.Texture_ImagePattern_AlphaTest_Loader;

import java.util.Scanner;
public class creditentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name");
        String u =scan.next();
        System.out.println("Enter your password");
        String p =scan.next();
        int attempt = 0;

        while(!(u.equals("cyber")&&p.equals("tek12"))) {

            System.out.println("Invalid user name or password, Please re-enter");
            System.out.println("Enter your user name");
            u = scan.next();
            System.out.println("Enter your password");
            p = scan.next();
            attempt++;
            if (attempt==3){
                System.out.println("Account is blocked");
                System.exit(0);


            }
        }


            System.out.println("Logged in");


        }
}
