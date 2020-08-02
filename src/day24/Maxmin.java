package day24;
import java.util.Scanner;
public class Maxmin {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n =scan.nextInt();

        int[]arr =new int[n];
        for (int i=0; i<=n-1; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            arr[i] = num;
        }
        int max = arr[0];
        int min = arr[0];
        for(int i =0; i<= arr.length-1; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        if(arr[i]<min){
            min=arr[i];
        }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);


        }
}
