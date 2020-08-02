package day30_custommethod;
import java.util.Arrays;
public class ReturnMethod3 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int num = max(arr);
        System.out.println(num*5);

    }
public static int max (int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
}
}
