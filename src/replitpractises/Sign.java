package replitpractises;
import java.util.Scanner;
public class Sign {
    public static void sign(int n)
    {
        int a =(n>0)?1:(n<0)?-1:0;


    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);
    }

}
