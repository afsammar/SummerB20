package day48_Inheritance.deviceTask;

import day48_Inheritance.Device;

public class Phone extends Device {

    public static boolean hasSimCard = true;
    public String OS;

    public Phone(boolean hasSimCard, String OS,String brand, String model, double price, boolean hasBattery, boolean hasMemory, String sceenSize) {

        this.OS = OS;
        setIno(brand,model,price,hasBattery,hasMemory,sceenSize);
    }
    public void call(long phoneNumber){
        System.out.println("Calling:"+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting to: "+phoneNumber);
    }
}
