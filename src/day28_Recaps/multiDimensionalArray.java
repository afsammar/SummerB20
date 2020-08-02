package day28_Recaps;

import java.util.Arrays;

public class multiDimensionalArray {
    public static void main(String[] args) {
        int[] arr1D = {1,2,3};
        int [][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(arr2D[1][3]);
        System.out.println("======================================");
    for(int i=0; i<=arr2D.length-1; i++){
        int[] each1Darray=arr2D[i];
       // System.out.println(Arrays.toString(each1Darray));
    for(int j =0; j<=each1Darray.length-1; j++){
        int eachNum =each1Darray[j];
        if(eachNum %2==0) {
            System.out.print(eachNum + " ");
        }
        }
        System.out.println();

    }
        System.out.println("======================================");
        for (int[] each:arr2D) {
            for (int eachElement:each) {
                if(eachElement%2!=0) {

                    System.out.print(eachElement + " ");
                }
            }
            System.out.println();
        }

    }
}
