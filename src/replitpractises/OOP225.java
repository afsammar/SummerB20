package replitpractises;

public class OOP225 {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;
    String brand = "undefined";

    public OOP225(){
        System.out.println("Creating TV object using no Args- constructor");
    }
    public OOP225(String brand){
        this.brand=brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }

    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void channelUp(){
        channel+=1;
    }
    public void channelDown(){
        channel-=1;
    }
    public void isOn(){
        if(on){
            System.out.println("TV is already ON");
        }
    }
    public void isOff(){
        if (on==false) {
            System.out.println("TV is already OFF");
        }
        if(channel<=0 || channel>120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }
        if(volumeLevel<=1||volumeLevel>=7 &&on==false){
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }

}
