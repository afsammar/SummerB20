package day39_customClass;

public class car {

             /*
            Attributes:
            model,brand, year , color , milage ,Price..
            */


        String brand;
        String model;
        int year;
        String color;
        double milage;
        double price;


        public void setInfo(String carBrand, String carModel, int carYear, String carColor, double carPrice, double carmileage ){
                brand = carBrand;
                model = carModel;
                year = carYear;
                color = carColor;
                price = carPrice;
                milage = carmileage;}

        public void getInfo(){
                System.out.println(year + " "+brand+" "+model+", "+color+", "+milage+", $"+price);
        }
        public void start(){
                System.out.println(brand+" "+model+" is started");
        }

}
