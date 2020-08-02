package day33;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntoToArraylist {
    public static void main(String[] args) {
        ArrayList <Integer>scores = new ArrayList<>();
        scores.add(95); // 0
        scores.add(100);//1
        scores.add(85);//2
        scores.add(1,65);
       scores.add(55);
       scores.add(10);

        System.out.println(scores);

        System.out.println(scores.get(2));

    }
}
