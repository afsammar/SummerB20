package officehours;

import java.util.ArrayList;

public class PizzaObjects {
    public static void main(String[] args) {

        ArrayList<Pizza>PizzaForBatch20 = new ArrayList<>();

        for(int i = 0; i<400; i++) {

            Pizza myPizza = new Pizza();
            myPizza.set("small", 3, 4);
            PizzaForBatch20.add(myPizza);
        }
        System.out.println("Total Number of pizza : "+PizzaForBatch20.size());
        double totalPrice=0;
        for (Pizza each:PizzaForBatch20) {
            totalPrice+= each.calcCost();
        }
        System.out.println(totalPrice);
        System.out.println("================================");

        Pizza pizza1 = new Pizza();
        pizza1.set("large",3,4);

        Pizza pizza2 = new Pizza();
        pizza2.set("medium",3,2);
        System.out.println(pizza1);
        System.out.println(pizza2);
    }
}
