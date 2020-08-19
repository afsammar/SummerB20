package day42_Static;

public class Car {
    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;

    static boolean hasSteeringWheel= true;
    static int numberofTires = 4;
    static boolean hasEngine=true;
    static boolean hasDoors= true;
    static boolean hasAirbag=true;
    static boolean hasSeatbelt=true;
    static boolean hasHorn= true;

    public void start(){
        System.out.println("Starting "+brand+" "+model);
    }
    public static void printTires(){
        System.out.println(numberofTires+" tires");
    }
    public String toString(){
        return "Bran: "+brand+", Model: "+model+", Year: "+year+", Color:"+color+
                "\nNumber of tires: "+numberofTires+"\nHas Engine: "+hasEngine+"\nHas Doors: ";
    }

}
