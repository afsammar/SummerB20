package day33;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class List_Practise2 {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer each:list) {
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
