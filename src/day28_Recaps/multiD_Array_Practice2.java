package day28_Recaps;

import java.util.Arrays;

public class multiD_Array_Practice2 {
    public static void main(String[] args) {
        int [][] arr2D = {{1,2,3},{4,5,6}};
        int[][][]arr3D = {{{1,2,3},{4,5,6}},{{6,7,8},{9,10,11}}};
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[0][1]));
        System.out.println(arr3D[1][0][2]);
        for(int i =0; i<=arr3D.length-1; i++){
            int[][] each2D= arr3D[i];
            for(int j =0; j<=each2D.length-1; j++){
                int[] each1D = each2D[j];
                for(int l=0; l<=each1D.length-1; l++){
                    System.out.print(each1D[l]+" ");

                }

            }
            System.out.println();
        }
        System.out.println("=================================");
        for(int[][]each2D:arr3D){
            for(int[]each1D:each2D){
                for(int each:each1D){
                    System.out.print(each+" ");
                }
            }
            System.out.println();
        }



    }
}
