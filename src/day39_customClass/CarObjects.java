package day39_customClass;

public class CarObjects {
    public static void main(String[] args) {

        car car1 = new car();
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.color ="White";
        car1.milage = 20000;
        car1.price = 19000.50;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);


        car car2 = new car();

        car2.brand = "Mercedes";
        car2.model = "G 550";
        car2.year = 2000;
        car2.color ="Blue";

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);


    }
}
