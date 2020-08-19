package day39_customClass;

public class dogPark {
    public static void main(String[] args) {

        Dog [] dogPark ={ new Dog(), new Dog(),new Dog(),new Dog(),new Dog(),};

        dogPark[0].setDoginfo("max","kobra","medium",6,"brown");
        dogPark[1].setDoginfo("karabas","sana","medium",6,"brown");
        dogPark[2].setDoginfo("comar","kara","medium",6,"brown");
        dogPark[3].setDoginfo("alex","cira","medium",6,"brown");
        dogPark[4].setDoginfo("lol","lara","medium",6,"brown");

        for(int i = 0; i<=dogPark.length-1; i++) {
            dogPark[i].getDogInfo();
        }
        System.out.println("============================");
        for (Dog eachDog:dogPark) {
            eachDog.getDogInfo();

        }
        System.out.println("===========================");
        String food = "treats";
        for (Dog eachDog:dogPark) {
            eachDog.eat(food);

        }

        System.out.println("============================");
        String drink = "milk";
        for(Dog eachDog : dogPark){
            eachDog.drink(drink);
        }



    }



}
