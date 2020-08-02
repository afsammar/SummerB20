package day26;

import java.util.Arrays;

public class multiDArray {
    public static void main(String[] args) {
        char[]ch1 = {'A', 'B'};
        char[]ch2 = {'C','D','E'};
        char[]ch3 = {'F', 'G','H' };
        char[][] ch2d ={{'A', 'B'},{'C','D','E'},{'F', 'G','H' }};
        System.out.println(Arrays.toString(ch2d[1]));
        System.out.println(ch2d[2][2]);
        System.out.println(ch2d[2][2]+" "+ch2d[0][1]);



    }
}
