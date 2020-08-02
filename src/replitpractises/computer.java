package replitpractises;


import java.util.Scanner;
public class computer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 1;

        for(int i=n; i>=1; i--){
            sum=sum*i;
        }
        System.out.println(sum) ;


    }
}
