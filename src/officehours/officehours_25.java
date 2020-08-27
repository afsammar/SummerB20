package officehours;

import java.util.Arrays;
import java.util.Scanner;
public class officehours_25 {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        arr1[0]=10;
        arr1[arr1.length-1] = 20;
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        int[]arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[4]*arr2[1]);
        System.out.println("==========================");
        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        for (int i=0; i<=arr1.length-1; i++){

            System.out.println("Enter a name");
            names[i]=scan.nextLine();
        }


        System.out.println(Arrays.toString(names));
    }
}
