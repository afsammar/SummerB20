package day51_exceptions.PetsTask;

public class House {
    public static void main(String[] args) {
        Dog dog1 = new Dog("winston","Scotty",4,'M',"black");
        System.out.println(dog1.name);
        System.out.println(dog1);
        Cat cat = new Cat("Welat","British",4,'M',"White");
        System.out.println(cat);
        Tiger tiger = new Tiger("ammar","human",4,'M',"white");
        System.out.println(tiger);
        tiger.eat();
    }


}
