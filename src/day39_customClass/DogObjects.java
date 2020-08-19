package day39_customClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDoginfo("Siwan","Beagle","medium",2,"Mix");
        dog2.setDoginfo("Roofus","Argentinian Dogo","medium",2,"Mix");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle paca");
        dog2.eat("Steak");
        dog3.eat("polo");

        dog1.drink("vodka");
        dog2.drink("water");

    }


}
