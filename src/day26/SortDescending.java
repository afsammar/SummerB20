package day26;

import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr = {2,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] desc = new int[arr.length];
        /*desc[0]=arr[2];
        desc[1]=arr[1];
        desc[2]=arr[0];*/

       int k =2;
        for(int i =0; i<=desc.length-1; i++){
            desc[i]=arr[k];
          k--;
        }

        System.out.println(Arrays.toString(desc));
    }
}
