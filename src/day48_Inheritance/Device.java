package day48_Inheritance;

public class Device {
    public String brand;
    public String model;
    public double price;
    public boolean hasBattery;
    public boolean hasMemory;
    public String sceenSize;

    public static  String madeIn ;
    public static boolean isElectronic;
    static{
        madeIn="China";
        isElectronic=true;
    }

    public void setIno(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String sceenSize) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.hasBattery = hasBattery;
        this.hasMemory = hasMemory;
        this.sceenSize = sceenSize;
    }

    public String toString(){
        return "=================================="+
                "\nBrand:"+brand+
                "\nModel:"+model+
                "\nMade in:"+madeIn+
                "\nScreen Size:"+sceenSize+
                "\nPrice:"+price+
                "\nDoes it have a battery ?"+hasBattery+
                "\nDoes it have a memory ?"+hasMemory+
                "==================================";

    }

}
