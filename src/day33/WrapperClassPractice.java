package day33;

import java.util.Arrays;

public class WrapperClassPractice {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        Integer[]arr2={1,2,3,4};
        for (Integer each:arr2) {
            System.out.println(each);
        }
    Double[] arr3 ={1.0,2.0,4.1,3.2};
        for(int i=0; i<=arr3.length-1; i++){
            System.out.println(arr3[i]);
        }
char[]arr5={65,67,68,69};
        System.out.println(Arrays.toString(arr5));


        String[] nums1={"12","13","14","15"};
        double[] num2 = new double[nums1.length];

        for (int i =0; i<=nums1.length-1; i++){
           num2[i]=Double.parseDouble(nums1[i]);
        }


        System.out.println(Arrays.toString(num2));
    }
}
