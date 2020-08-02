package day35_ArrayList;

import java.util.ArrayList;

public class ReverseOrer {
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
       list.add(10);//autoboxing
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.size());
        for(int i =list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
        }
}
