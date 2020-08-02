package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
        ArrayList<String>earlybirdlist=new ArrayList<>();
        earlybirdlist.add("Ibrahim");
        earlybirdlist.add("Virgina");
        earlybirdlist.add("Ziiadin");
        earlybirdlist.add("Erfan");
        earlybirdlist.add("Aalia");

        earlybirdlist.set(2,"Aslan");
        earlybirdlist.set(0,"Lan");
        System.out.println(earlybirdlist);
        earlybirdlist.clear();
        System.out.println(earlybirdlist);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        System.out.println(list);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        //int a = 1 removes the index "1"
        Integer a =1;//removes the element"1"
        list2.remove(a);
        System.out.println(list2);

        ArrayList<String>list3=new ArrayList<>();
        list3.add("Liliia");
        list3.add("Hamit");
        list3.add("Bulent");
        list3.add("Viorel");
        list3.add("Musa");
        list3.remove("Bulent");
        list3.remove(2);
        boolean r=list3.remove("Musa");
        System.out.println(list3);
        System.out.println(r);





    }
}
