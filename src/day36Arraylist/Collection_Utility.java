package day36Arraylist;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Collection_Utility {
    public static void main(String[] args) {
        /*
        Arrays: utility class for array
        Collections: utility for collection*/
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(40);
        list.add(15);
        list.add(25);
        list.add(10);
        list.add(70);

        Collections.sort(list);
        System.out.println(list);
        System.out.println("Max "+list.get(list.size()-1));
        System.out.println("Min "+list.get(0));
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        Collections.swap(list2, 1, 2);

        System.out.println(list2);

        Collections.swap(list2, 0, list2.size()-1);

        System.out.println(list2);

        ArrayList<Character>charList = new ArrayList<>();

        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('A');
        charList.add('C');
        int count = Collections.frequency(charList, 'A');
        System.out.println(count);
    }
}
