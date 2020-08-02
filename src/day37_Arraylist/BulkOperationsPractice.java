package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperationsPractice {
    public static void main(String[] args) {

        ArrayList<String>students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

    boolean r1 = students.containsAll(Arrays.asList("Ulku", "Busra","Muhtar"));

        System.out.println(r1);

        System.out.println("=========================================================");
        ArrayList<String> group1 =new ArrayList<>();


        group1.addAll(Arrays.asList("muhtar","Asiya","Nadir","Asiya","Saim"));

        System.out.println(group1);

        boolean r2 =  group1.containsAll(Arrays.asList("Ammar","Zafer"));
        System.out.println(r2);


    }
}
