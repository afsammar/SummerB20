package day32;
import java.util.Arrays;
public class SortDescending {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2=new int [arr.length];
        arr2[0]=arr[arr.length-1];
        System.out.println(Arrays.toString(arr2));
        arr2[1]=arr[3];
        System.out.println(Arrays.toString(arr2));
    }
}
