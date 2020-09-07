package day48_Inheritance.deviceTask;

import day48_Inheritance.Device;

public class TV extends Device {
    public boolean hasRemote;

    public TV(boolean hasRemote,String brand, String model, double price, boolean hasBattery, boolean hasMemory, String sceenSize) {
        setIno(brand,model,price,hasBattery,hasMemory,sceenSize);
        this.hasRemote=hasRemote;
    }

    public void watch(){
        System.out.println("Wathcing "+brand+" "+model);
    }


}
