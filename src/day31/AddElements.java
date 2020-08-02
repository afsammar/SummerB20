package day31;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int num = 4;
        int[]arr2=new int[arr.length+1];
        int i=0;
        for (int each:arr) {
            arr2[i]=each;
            arr2[arr2.length-1]=num;

        i++;
        }
        System.out.println(Arrays.toString(arr2));
    int[] scores ={85,65,45,55,95};
    int n1=87;
    scores=addelement(scores,n1);
        System.out.println(Arrays.toString( scores));



    }
public static int []addelement(int []arr,int num){

    int[]arr2=new int[arr.length+1];

    int i=0;
    for (int each:arr) {
        arr2[i]=each;
        arr2[arr2.length-1]=num;

        i++;
}
return arr2;
    }
}
