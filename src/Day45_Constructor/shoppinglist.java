package Day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class shoppinglist {
    public static void main(String[] args) {
        Item item1 = new Item("Apple",1.5,3);
        Item item2 = new Item("Bread",0.97,3);
        Item item3 = new Item("Cheese",9.89,3);
        Item item4 = new Item("Beans",0.88,3);
        Item item5 = new Item("Milk",1.79,3);

        ArrayList<Item> list = new ArrayList<>();
        list.addAll(Arrays.asList(item1,item2,item3,item4,item5));
        System.out.println("Items : "+list.size());
        double totalCost = 0;
        for(Item each:list){
            totalCost+= each.calcCost();
        }
        System.out.println("Total Price: "+totalCost);
        System.out.println("================");

        Item[] items = {item1,item2,item3,item4,item5};
        double totalCost2= 0;

        for (int i =0; i<=items.length-1; i++) {
            totalCost2+= items[i].calcCost();
        }
        System.out.println("total price: "+totalCost2);
        System.out.println(item1);

    }

}
