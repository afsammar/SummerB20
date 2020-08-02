package day26;

import java.util.Arrays;

public class multiDimensionalArray {

    public static void main(String[] args) {
        String sentence = "I love java java java , phyton is cool";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        int countJava = 0;
        int countPython = 0;

        for (String each : words) {
            if (each.toLowerCase().contains("java")){
                countJava++;
            }else if(each.toLowerCase().contains("phyton")){
            countPython++;
        }}
        System.out.println(countJava);
        System.out.println(countPython);

    }

}
