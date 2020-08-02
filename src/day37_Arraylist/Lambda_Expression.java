package day37_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));
        Predicate<Integer> lessThan5 = p->p < 5;

        list.removeIf(lessThan5);
        System.out.println("======================================================");

        Predicate<Integer> oddNumbers = p -> p%2!=0;
        list.removeIf(oddNumbers);
        ArrayList<Integer>number = new ArrayList<>();
        for(int i=0; i<=100; i++){
            number.add(i);
        }
        number.removeIf(oddNumbers);
        System.out.println(number);
        System.out.println("=========================================");

        ArrayList<String>names = new ArrayList<>();
        names.addAll(Arrays.asList("Marry","Monica","Mehray","Musti","Sumeyra","Hasan","Beril"));
        System.out.println(names);

        names.removeIf(each->each.startsWith("M"));
        System.out.println(names);

        System.out.println("==============================================");
        ArrayList<Integer>nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,2,2,2,3,3,3,4,5,6,7,8,8,9));

        nums.removeIf(p-> Collections.frequency(nums,p)!=1);




    }
}
