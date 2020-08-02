package day35_ArrayList;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String str = scan.next();
        int sum=0;

        for(int i=0; i<=str.length()-1; i++){
            char each=str.charAt(i);//a,1,b,2,c,3
            if(each>=48&& each<=57){//if the char is between 48-57, then its digit
                sum+= Integer.parseInt((""+each));//convert the character to integer

            }
        }
        System.out.println(sum);
    }
}
