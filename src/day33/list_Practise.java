package day33;

import java.util.ArrayList;

public class list_Practise {
    public static void main(String[] args) {
        ArrayList<Integer>oddList=new ArrayList<>();
        ArrayList<Integer>evenList=new ArrayList<>();
        for(int i =0; i<=100; i++){
            if (i%2!=0){
                oddList.add(i);
            }else{
                evenList.add(i);
            }
        }
        System.out.println(oddList);
        System.out.println(evenList);
        System.out.println("================================");
        ArrayList<String> grocerylist=new ArrayList<>();
        grocerylist.add("Milk");
        grocerylist.add("Apple");
        grocerylist.add("Eggs");
        grocerylist.add("Mango");
        grocerylist.add("Ice Cream");
        for (int i=grocerylist.size()-1; i>=0; i--){
            System.out.print(grocerylist.get(i)+"   ");
        }
        System.out.println();

        for (String each : grocerylist){
            System.out.print(each+"   ");

        }
    }
}
