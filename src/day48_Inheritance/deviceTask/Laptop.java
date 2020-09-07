package day48_Inheritance.deviceTask;

import day48_Inheritance.Device;

public class Laptop extends Device {

    public static boolean hasCPU=true;
    public static boolean hasMouse=true;
    public static boolean hasKeyBoard=true;

    public String OS;

    public Laptop(String OS,String brand, String model, double price, boolean hasBattery, boolean hasMemory, String sceenSize) {
        this.OS = OS;
        setIno(brand,model,price,hasBattery,hasMemory,sceenSize);
    }
public void coding(String language){
    System.out.println("coding "+language+"in"+brand+" "+model);
}
}
