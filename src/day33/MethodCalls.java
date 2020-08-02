package day33;
import library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {
        Integer[] arr1={1,2,3,4};
        Integer[] arr2={5,6,7,8};
        Integer[] arr3=Util.combine2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        Integer max =Util.maxNum(arr3);
        System.out.println(max);

        Integer min =Util.minNum(arr3);
        System.out.println(min);

        Character[] ch={'A','B','C','D','E','F',};
    }
}
