package day25;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[]number = new int[100];

        for(int i = 0; i<=number.length-1; i++){
            number[i] = i + 1;

        }

        System.out.println(Arrays.toString(number));

        for(int  each: number){

            if(each%2!=0){
                continue;
            }
            System.out.print(each+" ");
        }
    }
}
