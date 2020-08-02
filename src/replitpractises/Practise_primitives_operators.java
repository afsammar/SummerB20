package replitpractises;

public class Practise_primitives_operators {
    public static void main(String[] args) {
        int n =10;
        int i = n;
        System.out.println(i);

        int num1 = 100;
        int num2=num1;
        int num3=num2;
        int num4 = num1;


        System.out.println(num2);

        int apples =25;
        int kiwis =apples;
        int mangoes =55;
        kiwis =mangoes;

        System.out.println(apples);
        System.out.println(kiwis);
        System.out.println(mangoes);

        String food = "burger";
        System.out.println(food);
        food = "pizza";

        String water = "sparkling water";
        System.out.println(food);
        System.out.println(water);

        String firstname = "ammar";
        System.out.println("first name is : "+ firstname);

        int zipcode = 30066;
        System.out.println();
        String city1 = "newyork";
        String city2 = "tashkent";
        String city3 = "kyiv";
        String city4= "moscow";
        System.out.println("From "+city2+" to "+ city3 +" 50 $");
        String app = "skype and "+"whatsapp";
        System.out.println(app);


    }


}
