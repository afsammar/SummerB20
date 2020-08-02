package Day19_Forloop;
import java.util.Scanner;
public class sumofnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num =scan.nextInt();
        int sum =0;
        if (num > 1) {

            for(int i = 0; i<=num; i++){
                sum =sum+i;
                //sum+=1
            }
            System.out.println(sum);

        }else{
            System.out.println("Invalid Entry");
        }
    }
}
