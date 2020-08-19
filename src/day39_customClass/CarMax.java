package day39_customClass;

public class CarMax {
    public static void main(String[] args) {

        car car1 = new car();
        car car2 = new car();
        car car3 = new car();
        car car4 = new car();
        car car5 = new car();

        car1.setInfo("Lexus","RX350",2019,"Gray",35000,4000);
        car1.getInfo();
        car2.setInfo("Lexus", "RX450", 2020,"White",40000,10000);
        car3.setInfo("Bugatti","Veyron",2018,"Blue",500000,15000);
        car4.setInfo("Ford","Escape",2018,"White",25000,20000);
        car5.setInfo("Nissan","GT-R",2015,"Blue",54000,2000);

        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        car3.start();

    }
}
