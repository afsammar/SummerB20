package day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog("Wintson","Medium",5,'M',"Kangal");
        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1.age);
        System.out.println(dog1.gender);

        System.out.println(dog1);

        Cat cat1 = new Cat("Ramiz","Medium",6,'M',"Iranian");
        System.out.println(cat1);
        cat1.meow();
    }
}