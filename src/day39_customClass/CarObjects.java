package day39_customClass;

public class CarObjects {
    public static void main(String[] args) {
        car car1 = new car();
       /*
        car1.brand = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;
        car1.color = "White";
        car1.milage = 20000;
        car1.price = 19000.50;*/
        car1.setInfo("Toyota","Corolla",2020,"Red",20000,55000);


        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println();
        System.out.println("===========================");
        System.out.println();
        car car2 = new car();
        car2.setInfo("BMW","X5",2020,"Black",55550,1000);
       /* car2.brand = "Mercedes";
        car2.model = "G 550";
        car2.year = 2000;
        car2.color = "Blue";*/

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println("===========================");


        car car3 = new car();
        car3.setInfo("Audi","A7",2020,"White",32000,3500);
        car3.getInfo();


        car car4=new car();
        car4.setInfo("Jeep","Wrangler",1990,"Blue",17000,25000);

        car4.getInfo();
    }




}
