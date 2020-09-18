package replitpractises;

public class CarpetObjects {
    public static void main(String[] args) {
        Carpet c = new Carpet(200,100,20,true);
        System.out.println(c.totalPrice);
        Carpet c1 = new Carpet();
        System.out.println(c1.totalPrice);
    }
}
