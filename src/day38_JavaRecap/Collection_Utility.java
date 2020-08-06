package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collection_Utility {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('R','S','O','P','D','A','C','B'));
        System.out.println(chars);
        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<String>students = new ArrayList<>();
        students.addAll(Arrays.asList("Aslan","Cristina","Zeliha","Iman","Fatima","Mohammad","Mohammad","Mohammad"));
        Collections.swap(students, 1,4);
        System.out.println(students);
        ArrayList<String>unique = new ArrayList<>();
        for (String each:students) {
            int i = Collections.frequency(students, each);
            if(i==1){
                unique.add(each);
            }

        }
        System.out.println(unique);
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,89,1000,2000,3000,30,40,-50,1000,1000,1000));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);

        Collections.replaceAll(list,1000,100000);
        System.out.println(list);



    }
}
