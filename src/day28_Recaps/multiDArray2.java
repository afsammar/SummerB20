package day28_Recaps;

import java.util.Arrays;

/* task1:
        9 10 11 12 13
        4 5 6 7 8
        1 2 3
        task2:
        3 2 1
        4 5 6 7 8
        9 10, 11 12 13
        task3:
        13 12 11 10 9
        8 7 6 5 4
        3 2 1 */
public class multiDArray2 {
    public static void main(String[] args) {
        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
        for(int i =arr2D.length-1; i>=0; i--) {
            int eachgroup[] = arr2D[i];
            //System.out.println(Arrays.toString(eachgroup));
            for (int each: eachgroup) {
                System.out.print(each);
            }
            System.out.println();
        }
        for(int i=0; i<=arr2D.length-1; i++ ){
            int eachgr[] =arr2D[i];
            for (int j=eachgr.length-1; j>=0; j--){
                int eachelem=eachgr[j];
                System.out.print(eachelem+" ");
            }
            System.out.println();
        }

        for(int i =arr2D.length-1; i>=0; i--) {
            int eachgroup[] = arr2D[i];
            for (int j = eachgroup.length - 1; j >= 0; j--) {
                int eachelem = eachgroup[j];
                System.out.print(eachelem+" ");
            }

            System.out.println();
        }

    }
}
