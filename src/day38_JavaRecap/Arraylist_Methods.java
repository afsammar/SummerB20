package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylist_Methods {
    public static void main(String[] args) {

        ArrayList<String>cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Infinity", "Tesla","WV","Lamborghini","Lexus", "Tesla", "Tesla", "Tesla"));
        cars.removeAll(Arrays.asList("Tesla"));
        cars.add(3,"Tesla");
        System.out.println(cars);
        System.out.println("===============================");
        ArrayList<String>groceryList=new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Paper Towles","Toilet Paper","Mango","Orange","Avacado","Coca-Cola"));
        boolean r1=groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk"));
        System.out.println(r2);
    }
}
