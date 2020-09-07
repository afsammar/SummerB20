package replitpractises;

import java.util.Arrays;

public class SwitchElements {
    public static int []do_switch(int[]i){
        int [] arr = new int[4];
        arr[0]=i[3];
        arr[1]=i[1];
        arr[2]=i[2];
        arr[3]=i[0];
        return arr;
    }

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3, 4};

        System.out.println(Arrays.toString(do_switch(arr1)));

    }
    }

