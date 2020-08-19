package replitpractises;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.lang.reflect.Array;

public class DefitnitionReverse {
    public static void main(String[] args) {

    }
    public static String[] reverse(String[]arr){
        for(int i=0; i<arr.length/2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

return arr;
    }

}
