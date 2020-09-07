package replitpractises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CombineFullNamw {
    public static String[] combineNames(String[]first_name,String[]last_name){
        String [] arr = new String [2];
        arr[0]=first_name[0]+" "+last_name[0];
        arr[1]=first_name[1]+" "+last_name[1];
        return arr;
    }

    public static void main(String[] args) {
        String [] arr1 = {"ahmed","Erkam"};
        String [] arr2 = {"Afsin","leman"};
        System.out.println(Arrays.toString( combineNames(arr1,arr2)));
    }
}
